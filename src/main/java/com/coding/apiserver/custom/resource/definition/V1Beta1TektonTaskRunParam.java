package com.coding.apiserver.custom.resource.definition;


import io.swagger.annotations.ApiModel;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@ApiModel(description = "TektonTaskRunSpec params item")
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2022-08-30T16:45:00.555Z[Etc/UTC]")
public class V1Beta1TektonTaskRunParam<T> {

    private String name;

    private T value;

}
