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
public class V1Beta1TektonSidecar {

    @ApiModelProperty(value = "步骤名称")
    private String name;

    @ApiModelProperty(value = "镜像")
    private String image;

    @ApiModelProperty(value = "镜像的执行命令", notes = "如果没有则使用镜像内部的 ENTRYPOINT。更多详情：https://kubernetes.io/docs/tasks/inject-data-application/define-command-argument-container/#running-a-command-in-a-shell")
    private List<String> command;

    @ApiModelProperty(value = "命令参数", notes = "如果没有则使用镜像中的 CMD ")
    private List<String> args;

    @ApiModelProperty(value = "工作空间", notes = "该步骤的工作目录，没有则创建文件夹。未提供则使用容器默认的")
    private String workingDir;

    @ApiModelProperty(value = "sidecar 端口 暴漏列表")
    private List<V1ContainerPort> ports;

    @ApiModelProperty(value = "环境变量来源列表，例如configmap", notes = "详情见：https://kubernetes.io/docs/reference/generated/kubernetes-api/v1.23/#envfromsource-v1-core")
    private List<V1EnvFromSource> envFrom;

    @ApiModelProperty(value = "环境变量列表")
    private List<V1EnvVar> env;

    @ApiModelProperty(value = "资源配额")
    private V1ResourceRequirements resources;

    @ApiModelProperty(value = "step 的 文件卷")
    private List<V1VolumeMount> volumeMounts;

    @ApiModelProperty(value = "step 使用的块设备列表")
    private List<V1VolumeDevice> volumeDevices;

    @ApiModelProperty(value = "健康探针")
    private V1Probe livenessProbe;

    @ApiModelProperty(value = "就绪探针")
    private V1Probe readinessProbe;

    @ApiModelProperty(value = "启动探针",notes = "kubernetes 1.16新增的，如果提供了启动探测，则禁用其他所有探针，直到他它成功为止。如果启动探测失败，容器则重启")
    private V1Probe startupProbe;

    @ApiModelProperty(value = "生命周期")
    private V1Lifecycle lifecycle;

    @ApiModelProperty(value = "sidecar 终止消息写入本地文件地址，默认/dev/termination-log",notes = "消息大于 4096 bytes会被截断，所有容器的限制是12kb")
    private String terminationMessagePath;

    @ApiModelProperty(value = "sidecar 终止消息策略", notes = "File ；FallbackToLogsOnError。默认是 File," +
            " File 将使用terminationMessagePath，适用于无论sidecar成功还是失败。" +
            " FallbackToLogsOnError 将使用 Sidecar 日志输出的最后一块。日志输出限制为 2048 字节或 80 行，以较小者为准。适用于sidecar因错误退出 ")
    private String terminationMessagePolicy;

    @ApiModelProperty(value = "镜像拉去策略")
    private String imagePullPolicy;

    @ApiModelProperty(value = "SecurityContext 定义了 Step 应该运行的安全选项" ,notes = "如果设置，SecurityContext 的字段将覆盖 PodSecurityContext 的等效字")
    private V1SecurityContext securityContext;

    @ApiModelProperty(value = "此 Sidecar 是否应在容器运行时中为 stdin 分配缓冲区" , notes = "如果未设置，从 Sidecar 中的标准输入读取将始终导致 EOF。默认为 false")
    private Boolean stdin;

    @ApiModelProperty(value = "容器运行时是否应在单个附加打开标准输入通道后关闭它", notes = "当 stdin 为 true 时，stdin 流将在多个附加会话中保持打开状态。如果 stdinOnce 设置为 true，则 stdin 在 Sidecar 启动时打开，为空直到第一个客户端连接到 stdin，然后保持打开并接受数据直到客户端断开连接，此时 stdin 关闭并保持关闭直到 Sidecar 重新启动." +
            "如果此标志为 false，则从标准输入读取的容器进程将永远不会收到 EOF。默认为 false")
    private Boolean stdinOnce;

    @ApiModelProperty(value = "sidecar是否也为自己分配个 TTY ，默认false")
    private Boolean tty;

    @ApiModelProperty(value = "sidecar 执行脚本")
    private String script;

    @ApiModelProperty(value = "step独占的 workspace 列表" ,notes = "该字段是alpha的字段，必须设置 enable")
    private List<V1Beta1TektonWorkspaceUsage> workspaces;
}
