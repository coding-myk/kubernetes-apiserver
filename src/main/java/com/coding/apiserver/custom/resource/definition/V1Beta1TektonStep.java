package com.coding.apiserver.custom.resource.definition;

import io.kubernetes.client.openapi.models.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonStep {

    @ApiModelProperty(value = "步骤名称" ,position = 0)
    private String name;

    @ApiModelProperty(value = "镜像" ,position = 1)
    private String image;

    @ApiModelProperty(value = "镜像的执行命令", notes = "如果没有则使用镜像内部的 ENTRYPOINT。更多详情：https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell" ,position = 2)
    private List<String> command;

    @ApiModelProperty(value = "命令参数", notes = "如果没有则使用镜像中的 CMD " ,position = 3)
    private List<String> args;

    @ApiModelProperty(value = "工作空间", notes = "该步骤的工作目录，没有则创建文件夹。未提供则使用容器默认的" ,position = 4)
    private String workingDir;

    @ApiModelProperty(value = "环境变量来源列表，例如configmap", notes = "详情见：https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#envfromsource-v1-core" ,position = 5)
    private List<V1EnvFromSource> envFrom;

    @ApiModelProperty(value = "环境变量列表" ,position = 6)
    private List<V1EnvVar> env;

    @ApiModelProperty(value = "资源配额" ,position = 7)
    private V1ResourceRequirements resources;

    @ApiModelProperty(value = "step 的 文件卷" ,position = 8)
    private List<V1VolumeMount> volumeMounts;

    @ApiModelProperty(value = "step 使用的块设备列表" ,position = 9)
    private List<V1VolumeDevice> volumeDevices;

    @ApiModelProperty(value = "镜像拉取策略", notes = "Always, Never, IfNotPresent,默认 Always" ,position = 10)
    private String imagePullPolicy;

    @ApiModelProperty(value = "SecurityContext 定义了 Step 应该运行的安全选项" ,notes = "如果设置，SecurityContext 的字段将覆盖 PodSecurityContext 的等效字" ,position = 11)
    private V1SecurityContext securityContext;

    @ApiModelProperty(value = "step 执行脚本" ,position = 12)
    private String script;

    @ApiModelProperty(value = "step超时时间" ,position = 13)
    private String timeout;

    @ApiModelProperty(value = "step独占的 workspace 列表" ,notes = "该字段是alpha的字段，必须设置 enable" ,position = 14)
    private List<V1Beta1TektonWorkspaceUsage> workspaces;

    @ApiModelProperty(value = "onError", notes = "value: continue or stopAndFail" ,position = 15)
    private String onError;

    @ApiModelProperty(value = "标准step输出流配置" ,position = 16)
    private StepOutputConfig stdoutConfig;

    @ApiModelProperty(value = "stp错误输出流配置" ,position = 17)
    private StepOutputConfig stderrConfig;


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class StepOutputConfig {

        @ApiModelProperty(value = "容器本地文件系统的路径")
        private String path;

    }



}
