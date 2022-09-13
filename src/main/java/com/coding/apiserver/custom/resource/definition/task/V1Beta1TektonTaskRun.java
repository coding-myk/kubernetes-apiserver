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

    @ApiModelProperty
    private String kind;

    private V1ObjectMeta metadata;

    private V1Beta1TektonTaskRunSpec spec;

    private V1Beta1TektonTaskRunStatus status;

}
