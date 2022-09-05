package com.coding.apiserver.custom.resource.definition.pipeline;


import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonPipeline {

    private String apiVersion;

    private String kind;

    private V1ObjectMeta metadata;

    private V1Beta1TektonPipelineSpec spec;


}
