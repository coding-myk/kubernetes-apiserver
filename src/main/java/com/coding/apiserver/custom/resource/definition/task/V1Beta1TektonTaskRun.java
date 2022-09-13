package com.coding.apiserver.custom.resource.definition.task;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonTaskRun {

    @ApiModelProperty(value = "apiVersion", notes = "tekton.dev/v1beta1", example = "tekton.dev/v1beta1",position = 0)
    private String apiVersion;

    @ApiModelProperty(value = "kind" ,example = "TaskRun",position = 1)
    private String kind;

    @ApiModelProperty(value = "metadata", position = 2)
    private V1ObjectMeta metadata;

    @ApiModelProperty(value = "spec", position = 3)
    private V1Beta1TektonTaskRunSpec spec;

    @ApiModelProperty(value = "status", position = 4)
    private V1Beta1TektonTaskRunStatus status;

}
