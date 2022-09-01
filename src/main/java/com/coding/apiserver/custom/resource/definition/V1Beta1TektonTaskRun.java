package com.coding.apiserver.custom.resource.definition;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.kubernetes.client.openapi.models.V1PodCondition;
import io.kubernetes.client.openapi.models.V1beta1EndpointConditions;
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

        private String completionTime;

        private List<TaskRunStatusCondition> conditions;

        private String podName;

        private String startTime;



        public static class TaskRunStatusCondition {

            private String lastTransitionTime;

            private String message;

            private String reason;

            private String status;

            private String type;

        }

    }

}
