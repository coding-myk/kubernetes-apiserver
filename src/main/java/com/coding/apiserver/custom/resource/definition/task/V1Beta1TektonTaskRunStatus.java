package com.coding.apiserver.custom.resource.definition.task;

import com.coding.apiserver.custom.resource.definition.V1Beta1TektonSidecarState;
import io.kubernetes.client.openapi.models.V1ContainerStateRunning;
import io.kubernetes.client.openapi.models.V1ContainerStateTerminated;
import io.kubernetes.client.openapi.models.V1ContainerStateWaiting;
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
public class V1Beta1TektonTaskRunStatus {


    @ApiModelProperty(value = "pod 名称", position = 0)
    private String podName;

    @ApiModelProperty(value = "task 实际启动时间", position = 1)
    private OffsetDateTime startTime;

    @ApiModelProperty(value = "task 结束时间",position = 2)
    private OffsetDateTime completionTime;

    @ApiModelProperty(value = "task step 状态列表",position = 3)
    private List<StepState> steps;

    @ApiModelProperty(value = "task run 状态变更记录", position = 4)
    private List<TaskRunStatusCondition> conditions;

    @ApiModelProperty(value = "task run 的历史记录", position = 5)
    private List<V1Beta1TektonTaskRunStatus> retriesStatus;

    @ApiModelProperty(value = "task container 输出的结果列表", position = 6)
    private List<V1Beta1TektonTaskRunResult<?>> results;

    @ApiModelProperty(value = "sidecar 的状态记录", position = 7)
    private List<V1Beta1TektonSidecarState> sidecars;

    @ApiModelProperty(value = "taskrun 中 task 的 spec", position = 8)
    private V1Beta1TektonTaskSpec taskSpec;





    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class StepState {

        /**
         * 容器三种状态
         */
        @ApiModelProperty(value = "running 状态", position = 0)
        private V1ContainerStateRunning running;

        @ApiModelProperty(value = "terminated 状态",position = 1)
        private V1ContainerStateTerminated terminated;

        @ApiModelProperty(value = "waiting 状态", position = 2)
        private V1ContainerStateWaiting waiting;

        @ApiModelProperty(value = "step name", position = 3)
        private String name;

        @ApiModelProperty(value = "step container",position = 4)
        private String container;

        @ApiModelProperty(value = "镜像id", position = 5)
        private String imageID;

    }


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class TaskRunStatusCondition {

        @ApiModelProperty(value = "最后变更时间",position = 0)
        private String lastTransitionTime;

        @ApiModelProperty(value = "变更信息", position = 1)
        private String message;

        @ApiModelProperty(value = "原因: Started / Pending / Running / TaskRunCalled / Succeeded / Failed / [Error message] / TaskRunTimeout / TaskRunImagePullFailed" ,position = 2)
        private String reason;

        @ApiModelProperty(value = "状态：Unknown / True / False ", position = 3)
        private String status;

        @ApiModelProperty(value = "类型",example = "Succeeded",position = 4)
        private String type;

    }

}