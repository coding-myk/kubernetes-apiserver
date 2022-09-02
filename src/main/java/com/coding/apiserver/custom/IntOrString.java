package com.coding.apiserver.custom;

import java.io.IOException;
import java.util.Objects;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;

/**
 * 特殊处理 去除 final, 开启 无参构造器、set 方法
 */
//@JsonAdapter(IntOrString.IntOrStringAdapter.class)
public class IntOrString {
    private  boolean isInt;
    private  String strValue;
    private  Integer intValue;

    public IntOrString() {
    }

    public IntOrString(String value) {
        this.isInt = false;
        this.strValue = value;
        this.intValue = null;
    }

    public IntOrString(int value) {
        this.isInt = true;
        this.intValue = value;
        this.strValue = null;
    }

    public boolean isInteger() {
        return isInt;
    }

    public String getStrValue() {
        if(null != strValue){
            return strValue;
        }
        if(null != intValue){
            return String.valueOf(intValue);
        }
        return null;
    }

    public Integer getIntValue() {
        if(null != intValue){
            return intValue;
        }
        if(null != strValue){
            Integer value = null;
            try {
                value = Integer.parseInt(strValue);
            }catch (Exception e){

            }
            if( null != value){
                return value;
            }
        }

        return null;
    }

    public void setIsInt(boolean isInt) {
        isInt = isInt;
    }

    public void setStrValue(String strValue) {
        this.strValue = strValue;
    }

    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

    @Override
    public String toString() {
    	if(null != strValue){
    	    return strValue;
        }
    	if(null != intValue){
    	    return String.valueOf(intValue);
        }
    	return null;
    }

    @Override
    public boolean equals(Object o) {
        return this == o || (o instanceof IntOrString && equals((IntOrString) o));
    }

    private boolean equals(IntOrString o) {
        if (isInt != o.isInt) return false;
        return isInt ? Objects.equals(intValue, o.intValue) : Objects.equals(strValue, o.strValue);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isInt, strValue, intValue);
    }

    public static class IntOrStringAdapter extends TypeAdapter<IntOrString> {
        @Override
        public void write(JsonWriter jsonWriter, IntOrString intOrString) throws IOException {
            if (intOrString.isInteger()) {
                jsonWriter.value(intOrString.getIntValue());
            } else {
                jsonWriter.value(intOrString.getStrValue());
            }
        }

        @Override
        public IntOrString read(JsonReader jsonReader) throws IOException {
            final JsonToken nextToken = jsonReader.peek();
            if (nextToken == JsonToken.NUMBER) {
                return new IntOrString(jsonReader.nextInt());
            } else if (nextToken == JsonToken.STRING) {
                return new IntOrString(jsonReader.nextString());
            } else {
                throw new IllegalStateException("Could not deserialize to IntOrString. Was " + nextToken);
            }
        }
    }
}
