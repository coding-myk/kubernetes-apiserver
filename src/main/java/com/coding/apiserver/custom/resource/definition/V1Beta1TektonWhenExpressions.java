package com.coding.apiserver.custom.resource.definition;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonWhenExpressions<T> {


    @ApiModelProperty(value = "input", notes = "input is the input for the expression which can be static inputs or variables (Parameters or Results). If the is not provided, it defaults to an empty string")
    private String input;

    @ApiModelProperty(value = "操作符",notes = "in , notin")
    private String operator;

    @ApiModelProperty(value = "value", notes = "string or array ")
    private T values;




}
