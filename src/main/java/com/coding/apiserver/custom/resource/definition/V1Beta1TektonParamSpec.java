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
public class V1Beta1TektonParamSpec<T> {



    @ApiModelProperty(value = "参数名称" ,position = 0)
    private String name;

    @ApiModelProperty(value = "参数类型", notes = "string, array , object; 默认是string" ,position = 1)
    private String type;

    @ApiModelProperty(value = "参数描述" ,position = 2)
    private String description;

    @ApiModelProperty(value = "默认值" ,position = 3)
    @SerializedName("default")
    private T defaultValue;

    @ApiModelProperty(value = "参数类型描述 JSON Schema 属性" ,position = 4)
    private Map<String,Object> properties;

}
