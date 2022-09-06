package com.coding.apiserver.custom.resource.definition.task;


import com.coding.apiserver.custom.resource.definition.*;
import com.coding.apiserver.custom.resource.definition.pipeline.V1Beta1TektonPipelineTaskRef;
import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import io.kubernetes.client.openapi.models.V1Volume;
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


    private TaskRunDebug debug;

    private List<V1Beta1TektonRunParam<?>> params;

    private String serviceAccountName;

    private V1Beta1TektonPipelineTaskRef taskRef;

    private TaskSpec taskSpec;

    private String status;

    private String statusMessage;

    private String timeout;

    private V1Beta1TektonPodTemplate podTemplate;

    private List<V1Beta1TektonWorkspaceBinding> workspaces;

    private List<V1Beta1TektonOverride> stepOverrides;

    private List<V1Beta1TektonOverride> sidecarOverrides;

    private V1ResourceRequirements computeResources;



    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class TaskRunDebug {

        private List<String> breakpoint;

    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class TaskSpec {

        private List<V1Beta1TektonParam<?>> params;

        private String description;

        private List<V1Beta1TektonStep> steps;

        private List<V1Volume> volumes;

        private V1Beta1TektonStepTemplate stepTemplate;

        private List<V1Beta1TektonSidecar> sidecars;

        private List<V1Beta1TektonWorkSpaceDeclaration> workspaces;

        private List<V1Beta1TektonTaskResult> results;
    }

}
