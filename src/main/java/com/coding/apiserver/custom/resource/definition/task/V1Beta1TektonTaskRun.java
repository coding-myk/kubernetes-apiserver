package com.coding.apiserver.custom.resource.definition.task;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonTaskRun {

    private String apiVersion;

    private String kind;

    private V1ObjectMeta metadata;

    private V1Beta1TektonTaskRunSpec spec;

    private V1Beta1TektonTaskRunStatus status;

}
