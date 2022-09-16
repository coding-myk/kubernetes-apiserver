package com.coding.apiserver.custom.resource.definition.pipeline;

import com.coding.apiserver.custom.resource.definition.V1Beta1TektonWhenExpressions;
import io.swagger.annotations.ApiModelProperty;
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

    @ApiModelProperty(value = "pipeline run 实际启动时间", position = 0)
    private OffsetDateTime startTime;

    @ApiModelProperty(value = "pipeline run 完成时间", position = 1)
    private OffsetDateTime completionTime;

    @ApiModelProperty(value = "由 pipeline task的容器写出的结果列表", position = 2)
    private List<V1Beta1TektonPipelineRunResult<?>> results;

    @ApiModelProperty(value = "PipelineRunSpec 包含用于实例化运行的确切规范",position = 3)
    private List<V1Beta1TektonPipelineSpec> pipelineSpec;

    @ApiModelProperty(value = "用于描述由于当 When Expressions 结果为 False 而被跳过的 task", position = 4)
    private List<SkippedTask> skippedTasks;

    @ApiModelProperty(value = "用于指向此 PipelineRun 中各个 TaskRuns 和 Runs 的状态",position = 5)
    private List<ChildStatusReference> childStatusReferences;

    @ApiModelProperty(value = "finally task 启动时间", position = 6)
    private OffsetDateTime finallyStartTime;




    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class SkippedTask {

        @ApiModelProperty(value = "name", position = 0)
        private String name;

        @ApiModelProperty(value = "跳过原因", position = 1)
        private String reason;

        @ApiModelProperty(value = "when expressions 列表", position = 2)
        private List<V1Beta1TektonWhenExpressions<?>> whenExpressions;

    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class ChildStatusReference {

        @ApiModelProperty(value = "name", position = 0)
        private String name;

        @ApiModelProperty(value = "pipeline task name", position = 1)
        private String pipelineTaskName;

        @ApiModelProperty(value = "when expressions 列表" , position = 2)
        private List<V1Beta1TektonWhenExpressions<?>> whenExpressions;
    }
}

