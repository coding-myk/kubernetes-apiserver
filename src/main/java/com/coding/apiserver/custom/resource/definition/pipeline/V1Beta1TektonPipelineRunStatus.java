package com.coding.apiserver.custom.resource.definition.pipeline;

import com.coding.apiserver.custom.resource.definition.V1Beta1TektonWhenExpressions;
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
public class V1Beta1TektonPipelineRunStatus {

    private OffsetDateTime startTime;

    private OffsetDateTime completionTime;

    private List<V1Beta1TektonPipelineRunResult<?>> results;

    private List<V1Beta1TektonPipelineRunSpec.PipelineSpec> pipelineSpec;

    private List<SkippedTask> skippedTasks;

    private List<ChildStatusReference> childStatusReferences;

    private OffsetDateTime finallyStartTime;




    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class SkippedTask {

        private String name;

        private String reason;

        private List<V1Beta1TektonWhenExpressions<?>> whenExpressions;

    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class ChildStatusReference {

        private String name;

        private String pipelineTaskName;

        private List<V1Beta1TektonWhenExpressions<?>> whenExpressions;
    }
}

