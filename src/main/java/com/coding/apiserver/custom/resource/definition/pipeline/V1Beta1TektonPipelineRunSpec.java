package com.coding.apiserver.custom.resource.definition.pipeline;

import com.coding.apiserver.custom.resource.definition.*;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
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

    private List<V1Beta1TektonRunParam> params;

    private String serviceAccount;

    private PipelineRunStatus status;

    private Timeouts timeouts;

    private List<V1Beta1TektonWorkspaceBinding> workspaces;


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class PipelineRunStatus {

        private OffsetDateTime startTime;

        private OffsetDateTime completionTime;

        private List<V1Beta1TektonPipelineResult> results;

        private List<PipelineSpec> pipelineSpec;

        private List<V1Beta1TektonParam> params;

        private List<SkippedTask> skippedTasks;

        private OffsetDateTime finallyStartTime;




        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        @Data
        public static class SkippedTask {

            private String name;

            private String reason;

            private List<V1Beta1TektonWhen> whenExpressions;

        }

        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        @Data
        public static class ChildStatusReference {

            private String name;

            private String pipelineTaskName;

            private List<V1Beta1TektonWhen> whenExpressions;
        }
    }

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

        private ResolverRef resolverRef;

    }


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class PipelineSpec {

        private String description;

        private List<V1Beta1TektonPipelineTask> pipelineTask;

        private List<V1Beta1TektonParam> params;

        private List<V1Beta1TektonPipelineWorkspace> workspaces;

        private List<V1Beta1TektonPipelineResult> results;

        @SerializedName("finally")
        private List<V1Beta1TektonPipelineTask> finallyTask;
    }


}
