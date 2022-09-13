package com.coding.apiserver.custom.resource.definition;


import io.kubernetes.client.openapi.models.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonPodTemplate {

    @ApiModelProperty(value = "node 选择器", position = 0)
    private Map<String, String> nodeSelector;

    @ApiModelProperty(value = "pod 容忍策略" ,position = 1)
    private List<V1Toleration> tolerations;

    @ApiModelProperty(value = "pod 节点亲和", position = 2)
    private V1Affinity affinity;

    @ApiModelProperty(value = "SecurityContext 定义了 pod 应该运行的安全选项",position = 3)
    private V1PodSecurityContext securityContext;

    @ApiModelProperty(value = "卷",notes = "pod 所使用 volume 集合" ,position = 3)
    private List<V1Volume> volumes;

    @ApiModelProperty(value = "指定 Pod 的运行时类", position = 4)
    private String runtimeClassName;

    @ApiModelProperty(value = "确定 Tekton 是否自动为容器内 Pod 在预定义路径中使用的服务帐户提供令牌;默认是 true", position = 5)
    private Boolean automountServiceAccountToken;

    @ApiModelProperty(value = "。指定 Pod 的 DNS 策略。合法值为 ClusterFirst、Default 和 None; 默认是ClusterFirst", position = 6)
    private String dnsPolicy;

    @ApiModelProperty(value = "为 Pod 指定额外的 DNS 配置，例如名称服务器和搜索域", position = 7)
    private V1PodDNSConfig dnsConfig;

    @ApiModelProperty(value = "确定 Pod 命名空间中的服务是否作为环境变量暴露给 Pod，类似于 Docker 服务链接。默认：true",position = 8)
    private Boolean enableServiceLinks;

    @ApiModelProperty(value = "指定 Pod 的优先级。允许您有选择地对较低优先级的工作负载启用抢占。", position = 9)
    private String priorityClassName;

    @ApiModelProperty(value = "指定调度 Pod 时使用的调度程序。您可以为不同类型的工作负载指定不同的调度程序", position = 10)
    private String schedulerName;

    @ApiModelProperty(value = "指定拉取容器映像时要使用的密钥", position = 11)
    private List<V1LocalObjectReference> imagePullSecrets;

    @ApiModelProperty(value = "确定是否使用主机网络命名空间. 默认： false", position = 12)
    private Boolean hostNetwork;

    @ApiModelProperty(value = "将条目添加到 Pod 的 `/etc/hosts` 以提供 Pod 级别的主机名覆盖",position = 13)
    private List<V1HostAlias> hostAliases;

    @ApiModelProperty(value = "指定 Pod 如何在拓扑域之间的集群中分布。", position = 14)
    private List<V1TopologySpreadConstraint> topologySpreadConstraints;


}
