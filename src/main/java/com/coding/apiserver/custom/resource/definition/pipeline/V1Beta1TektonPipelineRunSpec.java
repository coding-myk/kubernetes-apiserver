package com.coding.apiserver.custom.resource.definition.pipeline;

import com.coding.apiserver.custom.resource.definition.*;
import com.google.gson.annotations.SerializedName;
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
public class V1Beta1TektonPipelineRunSpec {


    @ApiModelProperty(value = "已存在 pipeline 引用", position = 0)
    private PipelineRef pipelineRef;

    @ApiModelProperty(value = "使用自定义pipeline配置", position = 1 )
    private V1Beta1TektonPipelineSpec pipelineSpec;

    @ApiModelProperty(value = "pipeline 运行所需参数", position = 2)
    private List<V1Beta1TektonRunParam<?>> params;

    @ApiModelProperty(value = "定义了用户可以提供的 pipelinerun 规范状态", position = 4)
    private String status;

    @ApiModelProperty(value = "超时时间", position = 5)
    private Timeouts timeouts;

    @ApiModelProperty(value = "podTemplate",position = 6)
    private V1Beta1TektonPodTemplate podTemplate;

    @ApiModelProperty(value = "创建workspace实例", position = 7)
    private List<V1Beta1TektonWorkspaceBinding> workspaces;

    @ApiModelProperty(value = "用于为具体任务配置特定规范", position = 8)
    private List<V1Beta1TektonPipelineTaskRunSpec> taskRunSpecs;



    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class Timeouts {


        @ApiModelProperty(value = "设置执行整个管道的最大允许持续时间。tasks 和 finally 的单个超时总和不得超过此",position = 0)
        @SerializedName("pipeline")
        private OffsetDateTime pipelineTime;

        @ApiModelProperty(value = "task 的最大允许持续时间", position = 1)
        @SerializedName("tasks")
        private OffsetDateTime tasksTime;

        @ApiModelProperty(value = "finally 的最大允许持续时间", position = 2)
        @SerializedName("finally")
        private OffsetDateTime finallyTime;

    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class PipelineRef {

        @ApiModelProperty(value = "pipeline name", position = 0)
        private String name;

        @ApiModelProperty(value = "apiVersion", position = 1)
        private String apiVersion;

        @ApiModelProperty(value = "ResolverRef 允许在远程位置引用管道，如 git repo。仅当启用 alpha 功能门时才支持此字段", position = 2)
        private V1Beta1TektonResolverRef v1Beta1TektonResolverRef;

    }



}
