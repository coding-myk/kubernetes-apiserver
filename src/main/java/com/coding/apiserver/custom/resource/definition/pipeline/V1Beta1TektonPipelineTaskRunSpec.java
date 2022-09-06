package com.coding.apiserver.custom.resource.definition.pipeline;

import com.coding.apiserver.custom.resource.definition.V1Beta1TektonOverride;
import com.coding.apiserver.custom.resource.definition.V1Beta1TektonPodTemplate;
import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonPipelineTaskRunSpec {

    private String pipelineTaskName;

    private String serviceAccountName;

    private V1Beta1TektonPodTemplate podTemplate;

    private List<V1Beta1TektonOverride> stepOverrides;

    private List<V1Beta1TektonOverride> sidecarOverrides;

    private V1Beta1TektonPipelineTaskMetadata metadata;

    private V1ResourceRequirements computeResources;

}
