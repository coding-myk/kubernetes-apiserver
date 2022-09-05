package com.coding.apiserver.custom.resource.definition.pipeline;

import io.swagger.annotations.ApiModel;
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
public class V1Beta1TektonPipelineResult<T> {

    private String name;

    @ApiModelProperty(value = "type", notes = "string or array")
    private String  type;

    private String description;

    private T value;

}
