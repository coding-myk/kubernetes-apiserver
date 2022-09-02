package com.coding.apiserver.custom.resource.definition;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Builder
@Data
@ApiModel(description = "TektonTaskSpec params item")
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2022-08-30T16:45:00.555Z[Etc/UTC]")
public class V1Beta1TektonTaskParam<T> {



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
