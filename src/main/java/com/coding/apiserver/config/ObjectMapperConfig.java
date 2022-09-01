package com.coding.apiserver.config;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JacksonException;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.databind.ser.BeanPropertyWriter;
import com.fasterxml.jackson.databind.ser.BeanSerializerModifier;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalTimeDeserializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalTimeSerializer;
import io.kubernetes.client.custom.IntOrString;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimePrinter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;

@Configuration
public class ObjectMapperConfig {


    private final String dateTimePattern = "yyyy-MM-dd HH:mm:ss";

    private final String timePattern = "HH:mm:ss";

    @Primary
    @Bean("jsonObjectMapper")
    public ObjectMapper jsonObjectMapper(Jackson2ObjectMapperBuilder builder) {
        ObjectMapper objectMapper = builder.createXmlMapper(false)
                .factory(new MappingJsonFactory())
                .dateFormat(new SimpleDateFormat(dateTimePattern))
                .timeZone(TimeZone.getTimeZone("GMT+8"))
                .build()
                .configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false)
                .configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false)
                .configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false)
                .configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true)

                .registerModule(simpleModule());

        objectMapper.setSerializerFactory(jsonSerializerFactory(objectMapper.getSerializerFactory()));
        return objectMapper;
    }

    @Bean("yamlObjectMapper")
    public ObjectMapper yamlObjectMapper() {
        ObjectMapper objectMapper =  new ObjectMapper(new YAMLFactory());
        objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        objectMapper.setDateFormat(new SimpleDateFormat(dateTimePattern));
        objectMapper.setTimeZone(TimeZone.getTimeZone("GMT+8"));
        objectMapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        objectMapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
        objectMapper.configure(DeserializationFeature.ACCEPT_EMPTY_STRING_AS_NULL_OBJECT, true);
        objectMapper.registerModule(simpleModule());

        return objectMapper;
    }

    /**
     * 判断数组类型
     */
    boolean isArrayType(BeanPropertyWriter writer) {
        Class<?> clazz = writer.getType().getRawClass();
        return clazz.isArray() || clazz.equals(List.class) || clazz.equals(Set.class);

    }

    /**
     * 判断日期类型
     */
    boolean isDate(BeanPropertyWriter writer) {
        Class<?> clazz = writer.getType().getRawClass();
        return clazz.equals(Date.class) || clazz.equals(LocalDateTime.class) || clazz.equals(LocalDate.class) || clazz.equals(LocalTime.class);
    }

    /**
     * 判断日期类型
     */
    boolean isLocalDateTime(BeanPropertyWriter writer) {
        Class<?> clazz = writer.getType().getRawClass();
        return clazz.equals(LocalDateTime.class);
    }

    /**
     * 判断日期类型
     */
    boolean isLocalDate(BeanPropertyWriter writer) {
        Class<?> clazz = writer.getType().getRawClass();
        return clazz.equals(LocalDate.class);
    }

    /**
     * 判断日期类型
     */
    boolean isLocalTime(BeanPropertyWriter writer) {
        Class<?> clazz = writer.getType().getRawClass();
        return clazz.equals(LocalTime.class);
    }


    /**
     * 判断日期类型
     */
    boolean isBoolean(BeanPropertyWriter writer) {
        Class<?> clazz = writer.getType().getRawClass();
        return clazz.equals(Boolean.class) || clazz.equals(boolean.class);
    }
    /**
     * 判断数字类型
     */
    boolean isNumber(BeanPropertyWriter writer) {
        Class<?> clazz = writer.getType().getRawClass();
        return Number.class.isAssignableFrom(clazz)
                || clazz.equals(Short.class) || clazz.equals(short.class)
                || clazz.equals(Integer.class) || clazz.equals(int.class)
                || clazz.equals(Long.class) || clazz.equals(long.class)
                || clazz.equals(Double.class) || clazz.equals(double.class)
                || clazz.equals(Float.class) || clazz.equals(float.class)
                || clazz.equals(BigDecimal.class);
    }

    /**
     * 判断字符类型
     */
    boolean isStr(BeanPropertyWriter writer) {
        Class<?> clazz = writer.getType().getRawClass();
        return clazz.equals(String.class) || clazz.equals(Character.class)
                || clazz.equals(StringBuilder.class) || clazz.equals(StringBuffer.class);
    }


    public SimpleModule simpleModule() {
        SimpleModule javaTimeModule = new JavaTimeModule();
        javaTimeModule.addSerializer(LocalDateTime.class,new LocalDateTimeSerializer(DateTimeFormatter.ISO_DATE_TIME));
        javaTimeModule.addDeserializer(LocalDateTime.class,new LocalDateTimeDeserializer(DateTimeFormatter.ofPattern(dateTimePattern)));

        javaTimeModule.addSerializer(LocalDate.class,new LocalDateSerializer(DateTimeFormatter.ISO_LOCAL_DATE));
        javaTimeModule.addDeserializer(LocalDate.class,new LocalDateDeserializer(DateTimeFormatter.ISO_LOCAL_DATE));

        javaTimeModule.addSerializer(LocalTime.class,new LocalTimeSerializer(DateTimeFormatter.ofPattern(timePattern)));
        javaTimeModule.addDeserializer(LocalTime.class,new LocalTimeDeserializer(DateTimeFormatter.ofPattern(timePattern)));

        javaTimeModule.addSerializer(OffsetDateTime.class, new JsonSerializer<>() {
            @Override
            public void serialize(OffsetDateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                gen.writeString(DateTimeFormatter.ofPattern(dateTimePattern).format(value));
            }
        });

        javaTimeModule.addSerializer(DateTime.class, new JsonSerializer<DateTime>() {
            @Override
            public void serialize(DateTime value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                gen.writeString(value.toString());
            }
        });

        javaTimeModule.addSerializer(IntOrString.class, new JsonSerializer<>() {
            @Override
            public void serialize(IntOrString value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                if (value.isInteger()) {
                    gen.writeNumber(value.getIntValue());
                } else {
                    gen.writeString(value.getStrValue());
                }
            }
        });

        javaTimeModule.addDeserializer(IntOrString.class, new JsonDeserializer<>() {
            @Override
            public IntOrString deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {

                if (p.currentToken().isNumeric()){
                    return new IntOrString(p.getValueAsInt());
                }else {
                    return new IntOrString(p.getValueAsString());
                }
            }
        });


        javaTimeModule.addSerializer(com.coding.apiserver.custom.IntOrString.class, new JsonSerializer<com.coding.apiserver.custom.IntOrString>() {
            @Override
            public void serialize(com.coding.apiserver.custom.IntOrString value, JsonGenerator gen, SerializerProvider serializers) throws IOException {
                if (value.isInteger()) {
                    gen.writeNumber(value.getIntValue());
                } else {
                    gen.writeString(value.getStrValue());
                }
            }
        });

        javaTimeModule.addDeserializer(com.coding.apiserver.custom.IntOrString.class, new JsonDeserializer<com.coding.apiserver.custom.IntOrString>() {
            @Override
            public com.coding.apiserver.custom.IntOrString deserialize(JsonParser p, DeserializationContext ctxt) throws IOException, JacksonException {

                if(p.currentToken().isNumeric()) {
                    return new com.coding.apiserver.custom.IntOrString(p.getValueAsInt());
                }else {
                    return new com.coding.apiserver.custom.IntOrString(p.getValueAsString());
                }
            }
        });






                /*
          long类型前端精度丢失问题（超过53位二进制数），
          建议在需要转换的字段上加注解 @JsonFormat(shape = JsonFormat.Shape.STRING)
          不做整体数值转换，防止无需转换的long类型也转为string
         */
//        javaTimeModule.addSerializer(Long.class, ToStringSerializer.instance);
//        javaTimeModule.addSerializer(Long.TYPE, ToStringSerializer.instance);


        return javaTimeModule;
    }


    public SerializerFactory jsonSerializerFactory (SerializerFactory serializerFactory) {
        return serializerFactory.withSerializerModifier(new BeanSerializerModifier() {
            @Override
            public List<BeanPropertyWriter> changeProperties(SerializationConfig config, BeanDescription beanDesc, List<BeanPropertyWriter> beanProperties) {
                //循环所有的beanPropertyWriter
                for (BeanPropertyWriter beanProperty : beanProperties) {
                    //判断字段的类型，如果是array，list，set则注册nullSerializer
                    if (isArrayType(beanProperty)) {
                        //给writer注册一个自己的nullSerializer
                        beanProperty.assignNullSerializer(new JsonSerializer<>() {
                            @Override
                            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                                if (o == null) {
                                    jsonGenerator.writeStartArray();
                                    jsonGenerator.writeEndArray();
                                }
                            }
                        });
                    } else if (isNumber(beanProperty)) {
                        beanProperty.assignNullSerializer(new JsonSerializer<>() {
                            @Override
                            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                                jsonGenerator.writeNumber(0);
                            }
                        });
                    } else if (isBoolean(beanProperty)) {
                        beanProperty.assignNullSerializer(new JsonSerializer<>() {
                            @Override
                            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                                jsonGenerator.writeBoolean(false);
                            }
                        });
                    } else if (isStr(beanProperty) || isDate(beanProperty)) {
                        beanProperty.assignNullSerializer(new JsonSerializer<>() {
                            @Override
                            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                                jsonGenerator.writeString(StringUtils.EMPTY);
                            }
                        });
                    }
                    else {
                        beanProperty.assignNullSerializer(new JsonSerializer<>() {
                            @Override
                            public void serialize(Object o, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
                                jsonGenerator.writeStartObject();
                                jsonGenerator.writeEndObject();
                            }
                        });
                    }
                }
                return beanProperties;
            }
        });
    }


}
