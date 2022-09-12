package com.coding.apiserver.custom.resource.definition.pipeline;

import com.coding.apiserver.custom.resource.definition.*;
import com.coding.apiserver.custom.resource.definition.task.V1Beta1TektonTaskResult;
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
public class V1Beta1TektonPipelineTask {

    private String name;

    private V1Beta1TektonPipelineTaskRef taskRef;

    private EmbeddedTask taskSpec;

    private V1Beta1TektonWhenExpressions<?> when;

    private Integer retries;

    private List<String> runAfter;

    private List<V1Beta1TektonRunParam<?>> params;

    private List<V1Beta1TektonRunParam<?>> matrix;

    private List<WorkspacePipelineTaskBinding> workspaces;

    private String timeout;



    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class EmbeddedTask {

        private Object spec;

        private V1Beta1TektonPipelineTaskMetadata metadata;

        private List<V1Beta1TektonParam<?>> params;

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
    @javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:45:00.555Z[Etc/UTC]")
    public static class WorkspacePipelineTaskBinding {

        private String name;

        private String workspace;

        private String subPath;

    }

}