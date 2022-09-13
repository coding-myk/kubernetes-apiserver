package com.coding.apiserver.custom.resource.definition.task;


import com.coding.apiserver.custom.resource.definition.*;
import com.coding.apiserver.custom.resource.definition.pipeline.V1Beta1TektonPipelineTaskRef;
import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import io.kubernetes.client.openapi.models.V1Volume;
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
public class V1Beta1TektonTaskRunSpec {


    @ApiModelProperty(value = "debug", notes = "为特定的 TaskRun 定义断点配置",position = 0)
    private TaskRunDebug debug;

    @ApiModelProperty(value = "taskrun 需要的参数", notes = "与task中的param配合使用，这里给task中的param赋值" ,position = 1)
    private List<V1Beta1TektonRunParam<?>> params;

    @ApiModelProperty(value = "service account",position = 2)
    private String serviceAccountName;

    @ApiModelProperty(value = "task 引用", position = 3)
    private V1Beta1TektonPipelineTaskRef taskRef;

    @ApiModelProperty(value = "task 配置，一般和他taskRef选择一个进行使用，使用taskSpec不需要使用taskRef", position = 4)
    private V1Beta1TektonTaskSpec taskSpec;

    @ApiModelProperty(value = "定义用户可以提供的任务运行规范状态", position = 5)
    private String status;

    @ApiModelProperty(value = "为 TaskRun 定义人类可读的状态消息", example = "TaskRun cancelled as the PipelineRun it belongs to has been cancelled.",position = 6)
    private String statusMessage;

    @ApiModelProperty(value = "超时时间", example = "120s",position = 7)
    private String timeout;

    @ApiModelProperty(value = "PodTemplate 保存 pod 特定的配置",position = 8)
    private V1Beta1TektonPodTemplate podTemplate;

    @ApiModelProperty(value = "task 中使用的  workspace列表", position = 9)
    private List<V1Beta1TektonWorkspaceBinding> workspaces;

    @ApiModelProperty(value = "覆盖以应用于此 TaskRun 中的步骤。如果在 Step 和 StepOverride 中都指定了字段，则将使用 StepOverride 中的值。仅当启用 alpha 功能门时才支持此字段", position = 10)
    private List<V1Beta1TektonOverride> stepOverrides;

    @ApiModelProperty(value = "覆盖以应用于此 TaskRun 中的 Sidecar。如果在 Sidecar 和 SidecarOverride 中都指定了一个字段，则将使用 SidecarOverride 中的值。仅当启用 alpha 功能门时才支持此字段", position = 11)
    private List<V1Beta1TektonOverride> sidecarOverrides;

    @ApiModelProperty(value = "taskrun 的资源配额")
    private V1ResourceRequirements computeResources;



    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class TaskRunDebug {

        @ApiModelProperty(value = "断点")
        private List<String> breakpoint;

    }


}
