package com.coding.apiserver.custom.resource.definition;


import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(
        description =
                "Tekton 实体类")
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2022-08-30T16:45:00.555Z[Etc/UTC]")
public class V1Beta1TektonTaskRunSpec {


    private List<V1Beta1TektonTaskRunParam> params;

    private String serviceAccountName;

    private List<V1Beta1TektonTaskRunOrPipelineRunWorkspace> workspaces;

    private TaskRef taskRef;

    private TaskSpec taskSpec;


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class TaskSpec {
        private String description;

        private List<V1Beta1TektonStep> steps;

        private List<V1Beta1TektonTaskWorkspace> workspaces;
    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class TaskRef {
        private String name;
    }
}
