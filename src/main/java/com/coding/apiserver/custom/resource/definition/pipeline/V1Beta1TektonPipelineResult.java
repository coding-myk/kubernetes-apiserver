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

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "type", notes = "string or array", position = 1)
    private String  type;

    @ApiModelProperty(value = "输出结果的描述", position = 2)
    private String description;

    @ApiModelProperty(value = "输出的值", position = 3)
    private T value;

}
