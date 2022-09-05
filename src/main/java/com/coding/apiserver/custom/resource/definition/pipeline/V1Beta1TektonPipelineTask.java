package com.coding.apiserver.custom.resource.definition.pipeline;

import com.coding.apiserver.custom.resource.definition.V1Beta1TektonParam;
import com.coding.apiserver.custom.resource.definition.V1Beta1TektonWhen;
import com.coding.apiserver.custom.resource.definition.task.V1Beta1TektonTaskRunSpec;
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
@ApiModel(description = "Tekton 实体类")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-08-30T16:45:00.555Z[Etc/UTC]")
public class V1Beta1TektonPipelineTask {

    private String name;

    private V1Beta1TektonWhen when;

    private V1Beta1TektonTaskRunSpec.TaskRef taskRef;

    private V1Beta1TektonTaskRunSpec.TaskSpec taskSpec;

    private List<String> runAfter;

    private Integer retries;

    private String timeout;

    private List<V1Beta1TektonParam> params;

    private List<V1Beta1TektonParam> matrix;

    private List<V1Beta1TektonPipelineTask.WorkspacePipelineTaskBinding> workspaces;




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