package com.coding.apiserver.custom.resource.definition.task;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonTaskResult {

    private String name;

    @ApiModelProperty(value = "type", notes = "string or array")
    private String  type;

    private Map<String,Object> properties;

    private String description;

}
