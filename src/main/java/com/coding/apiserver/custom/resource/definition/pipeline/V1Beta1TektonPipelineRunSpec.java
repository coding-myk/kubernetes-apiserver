package com.coding.apiserver.custom.resource.definition.pipeline;

import com.coding.apiserver.custom.resource.definition.*;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.OffsetDateTime;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonPipelineRunSpec {


    private PipelineRef pipelineRef;

    private PipelineSpec pipelineSpec;

    private List<V1Beta1TektonRunParam<?>> params;

    private String serviceAccount;

    private V1Beta1TektonPipelineRunStatus status;

    private Timeouts timeouts;

    private V1Beta1TektonPodTemplate podTemplate;

    private List<V1Beta1TektonWorkspaceBinding> workspaces;

    private List<V1Beta1TektonPipelineTaskRunSpec> taskRunSpecs;



    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Timeouts {

        @SerializedName("pipeline")
        private OffsetDateTime pipelineTime;

        @SerializedName("tasks")
        private OffsetDateTime tasksTime;

        @SerializedName("finally")
        private OffsetDateTime finallyTime;

    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class PipelineRef {

        private String name;

        private String apiVersion;

        private V1Beta1TektonResolverRef v1Beta1TektonResolverRef;

    }


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class PipelineSpec {

        private String description;

        private List<V1Beta1TektonPipelineTask> pipelineTask;

        private List<V1Beta1TektonParam<?>> params;

        private List<V1Beta1TektonPipelineWorkspaceDeclaration> workspaces;

        private List<V1Beta1TektonPipelineResult<?>> results;

        @SerializedName("finally")
        private List<V1Beta1TektonPipelineTask> finallyTask;
    }


}
