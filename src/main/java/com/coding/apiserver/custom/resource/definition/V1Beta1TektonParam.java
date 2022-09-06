package com.coding.apiserver.custom.resource.definition;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class V1Beta1TektonParam<T> {



    @SerializedName("name")
    private String name;

    @ApiModelProperty(value = "参数类型", notes = "string, arry , object")
    @SerializedName("type")
    private String type;

    @SerializedName("description")
    private String description;

    @SerializedName("default")
    private T defaultValue;

    @SerializedName("properties")
    private Map<String,Object> properties;

}
