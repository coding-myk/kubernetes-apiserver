package com.coding.apiserver.custom.resource.definition;


import io.kubernetes.client.openapi.models.*;
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

    private Map<String, String> nodeSelector;

    private List<V1Toleration> tolerations;

    private V1Affinity affinity;

    private V1PodSecurityContext securityContext;

    private List<V1Volume> volumes;

    private String runtimeClassName;

    private Boolean automountServiceAccountToken;

    private String dnsPolicy;

    private V1PodDNSConfig dnsConfig;

    private Boolean enableServiceLinks;

    private String priorityClassName;

    private String schedulerName;

    private List<V1LocalObjectReference> imagePullSecrets;

    private Boolean hostNetwork;

    private List<V1HostAlias> hostAliases;

    private List<V1TopologySpreadConstraint> topologySpreadConstraints;


}
