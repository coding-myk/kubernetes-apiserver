package com.coding.apiserver.custom.resource.definition.pipeline;

import com.coding.apiserver.custom.resource.definition.V1Beta1TektonOverride;
import com.coding.apiserver.custom.resource.definition.V1Beta1TektonPodTemplate;
import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty(value = "pipelineTaskName", position = 0)
    private String pipelineTaskName;

    @ApiModelProperty(value = "service account name", position = 1)
    private String serviceAccountName;

    @ApiModelProperty(value = "podTemplate" ,position = 2)
    private V1Beta1TektonPodTemplate podTemplate;

    @ApiModelProperty(value = "覆盖以应用于此 TaskRun 中的步骤。如果在 Step 和 StepOverride 中都指定了字段，则将使用 StepOverride 中的值。仅当启用 alpha 功能门时才支持此字段", position = 3)
    private List<V1Beta1TektonOverride> stepOverrides;

    @ApiModelProperty(value = "覆盖以应用于此 TaskRun 中的 Sidecar。如果在 Sidecar 和 SidecarOverride 中都指定了一个字段，则将使用 SidecarOverride 中的值。仅当启用 alpha 功能门时才支持此字段", position = 4)
    private List<V1Beta1TektonOverride> sidecarOverrides;

    @ApiModelProperty(value = "metadata", position = 5)
    private V1Beta1TektonPipelineTaskMetadata metadata;

    @ApiModelProperty(value = "资源配额", position = 6)
    private V1ResourceRequirements computeResources;

}
