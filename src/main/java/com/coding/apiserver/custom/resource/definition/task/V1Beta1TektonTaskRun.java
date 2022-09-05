package com.coding.apiserver.custom.resource.definition.task;

import io.kubernetes.client.openapi.models.V1ContainerStateRunning;
import io.kubernetes.client.openapi.models.V1ContainerStateTerminated;
import io.kubernetes.client.openapi.models.V1ContainerStateWaiting;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
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
public class V1Beta1TektonTaskRun {

    private String apiVersion;

    private String kind;

    private V1ObjectMeta metadata;

    private V1Beta1TektonTaskRunSpec spec;

    private TaskRunStatus status;




    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class TaskRunStatus {

        private OffsetDateTime completionTime;

        private List<TaskRunStatusCondition> conditions;

        private String podName;

        private OffsetDateTime startTime;

        private List<StepState> steps;




        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        @Data
        public static class StepState {

            private V1ContainerStateRunning running;

            private V1ContainerStateTerminated terminated;

            private V1ContainerStateWaiting waiting;

            private String name;

            private String container;

            private String imageID;

        }


        @Builder
        @NoArgsConstructor
        @AllArgsConstructor
        @Data
        public static class TaskRunStatusCondition {

            private String lastTransitionTime;

            private String message;

            private String reason;

            private String status;

            private String type;

        }

    }

}