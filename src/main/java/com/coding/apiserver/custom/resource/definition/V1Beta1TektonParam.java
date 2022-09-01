package com.coding.apiserver.custom.resource.definition;


import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
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
public class V1Beta1TektonParam {



    @SerializedName("name")
    private String name;

    @SerializedName("type")
    private String type;

    @SerializedName("description")
    private String description;

    @SerializedName("default")
    private List<String> defaultValue;

    @SerializedName("properties")
    private Map<String,Object> properties;

}
