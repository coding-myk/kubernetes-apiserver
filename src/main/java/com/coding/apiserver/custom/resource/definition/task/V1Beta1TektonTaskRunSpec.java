package com.coding.apiserver.custom.resource.definition.task;


import com.coding.apiserver.custom.resource.definition.*;
import io.kubernetes.client.openapi.models.V1PodSpec;
import io.kubernetes.client.openapi.models.V1PodTemplate;
import io.kubernetes.client.openapi.models.V1PodTemplateSpec;
import io.kubernetes.client.openapi.models.V1Volume;
import io.kubernetes.client.proto.V1;
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

    private List<V1Beta1TektonRunParam> params;

    private String serviceAccountName;

    private TaskRef taskRef;

    private TaskSpec taskSpec;

    private String status;

    private String statusMessage;

    private String timeout;

    private V1PodSpec podTemplate;

    private List<V1Beta1TektonWorkspaceBinding> workspaces;


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

        private List<V1Beta1TektonParam> params;

        private String description;

        private List<V1Beta1TektonStep> steps;

        private List<V1Volume> volumes;

        private V1Beta1TektonStepTemplate stepTemplate;

        private List<V1Beta1TektonSidecar> sidecars;

        private List<V1Beta1TektonWorkSpaceDeclaration> workspaces;

        private List<V1Beta1TektonTaskResult> results;
    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class TaskRef {
        private String name;

        private String kind;

        private String apiVersion;

        private ResolverRef resolverRef;

    }
}
