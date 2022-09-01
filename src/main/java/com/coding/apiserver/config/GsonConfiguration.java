package com.coding.apiserver.config;

import com.google.gson.*;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

import java.io.IOException;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Configuration
public class GsonConfiguration {



    private final String dateTimePattern = "yyyy-MM-dd HH:mm:ss";

    private final String timePattern = "HH:mm:ss";


    @Bean
    public Gson gson() {

       return new GsonBuilder()
                .setPrettyPrinting()
                .setDateFormat(dateTimePattern)
                .registerTypeAdapter(LocalDateTime.class, (JsonSerializer<LocalDateTime>) (localDateTime, type, jsonSerializationContext) ->
                        new JsonPrimitive(localDateTime.format(DateTimeFormatter.ofPattern(dateTimePattern))))
                .registerTypeAdapter(LocalDate.class, (JsonSerializer<LocalDate>) (localDate, type, jsonSerializationContext) ->
                        new JsonPrimitive(localDate.format(DateTimeFormatter.ISO_LOCAL_DATE)))
                .registerTypeAdapter(LocalTime.class, (JsonSerializer<LocalTime>) (localTime, type, jsonSerializationContext) ->
                        new JsonPrimitive(localTime.format(DateTimeFormatter.ofPattern(timePattern))))
                .registerTypeAdapter(Integer.class, new TypeAdapter<Integer>() {
                    @Override
                    public void write(JsonWriter jsonWriter, Integer integer) throws IOException {
                        jsonWriter.value(integer == null ? 0 : integer);
                    }

                    @Override
                    public Integer read(JsonReader jsonReader) throws IOException {
                        return jsonReader.nextInt();
                    }
                })
                .registerTypeAdapter(Long.class, new TypeAdapter<Long>() {
                   @Override
                   public void write(JsonWriter jsonWriter, Long number) throws IOException {
                       jsonWriter.value(number == null ? 0L : number);
                   }

                   @Override
                   public Long read(JsonReader jsonReader) throws IOException {
                       return jsonReader.nextLong();
                   }
               })
                .registerTypeAdapter(String.class, new TypeAdapter<String>() {
                   @Override
                   public void write(JsonWriter jsonWriter, String str) throws IOException {
                       jsonWriter.value(StringUtils.hasText(str) ? str : "");
                   }

                   @Override
                   public String read(JsonReader jsonReader) throws IOException {
                       return jsonReader.nextString();
                   }
               })
                .registerTypeAdapter(Date.class, new TypeAdapter<Date>() {
                   @Override
                   public void write(JsonWriter jsonWriter, Date date) throws IOException {
                       jsonWriter.value(date == null ? "" : new SimpleDateFormat(dateTimePattern).format(date));
                   }

                   @Override
                   public Date read(JsonReader jsonReader) throws IOException {
                       try {
                           return DateFormat.getInstance().parse(jsonReader.nextString()) ;
                       } catch (ParseException e) {
                           throw new RuntimeException(e);
                       }
                   }
               })
                .registerTypeAdapter(Double.class, new TypeAdapter<Double>() {
                   @Override
                   public void write(JsonWriter out, Double value) throws IOException {
                       out.value(value == null ? 0.00 : value);
                   }

                   @Override
                   public Double read(JsonReader in) throws IOException {
                       return in.nextDouble();
                   }
               })
                .registerTypeAdapter(Float.class, new TypeAdapter<Float>() {
                   @Override
                   public void write(JsonWriter out, Float value) throws IOException {
                       out.value(value == null ? 0.00f : value);
                   }

                   @Override
                   public Float read(JsonReader in) throws IOException {
                       return Float.parseFloat(in.nextString());
                   }
               })


                .serializeNulls()
                .create();
    }

}
