package com.coding.apiserver.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.parser.DefaultJSONParser;
import com.alibaba.fastjson.parser.ParserConfig;
import com.alibaba.fastjson.parser.deserializer.ObjectDeserializer;
import com.alibaba.fastjson.serializer.*;
import com.coding.apiserver.custom.IntOrString;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.lang.reflect.Type;

@RestController
public class FastJsonTestController {


    public static void main(String[] args) {

        IntOrString intOrString = new IntOrString("8888");

        SerializeConfig.getGlobalInstance().put(IntOrString.class, new ObjectSerializer() {
            @Override
            public void write(JSONSerializer jsonSerializer, Object o, Object o1, Type type, int i) throws IOException {
                if(!ObjectUtils.isEmpty(o)) {
                    IntOrString  temp = (IntOrString) o;
                    if (temp.isInteger()) {
                        jsonSerializer.out.write("{\"intValue\": "+temp.getIntValue()+",\"isInt\":true,\"strValue\":\"\"}");
                    }else {
                        jsonSerializer.out.write("{\"intValue\":"+null+",\"isInt\":false,\"strValue\":\""+temp.getStrValue() +"\"}");
                    }
                } else {
                    jsonSerializer.out.writeNull(SerializerFeature.WriteMapNullValue);
                }
            }
        });

        ParserConfig.getGlobalInstance().putDeserializer(IntOrString.class, new ObjectDeserializer() {
            @Override
            public <T> T deserialze(DefaultJSONParser parser, Type type, Object fieldName) {
                String s = StringCodec.instance.deserialze(parser, type, fieldName);
                if(StringUtils.hasText(s)) {
                    JSONObject jsonObject = JSON.parseObject(s);
                    if(jsonObject.getBoolean("isInt")) {
                        return (T) new IntOrString(jsonObject.getIntValue("intValue"));
                    }else {
                        return (T) new IntOrString(jsonObject.getString("strValue"));
                    }
                }else {
                    return null;
                }

            }


            @Override
            public int getFastMatchToken() {
                return 0;
            }
        });




        System.out.println(JSONObject.toJSONString(intOrString));

        IntOrString intOrString1 = JSON.parseObject(JSONObject.toJSONString(intOrString),IntOrString.class);

        System.out.println(JSONObject.toJSONString(intOrString1));
    }





}
