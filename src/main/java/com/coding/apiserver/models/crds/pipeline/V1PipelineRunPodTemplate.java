package com.coding.apiserver.models.crds.pipeline;


import com.coding.apiserver.models.*;
import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Map;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName V1PipelineRunPodTemplate
 * @Description PipelineRun - spec - podTemplate
 * @date 2022/3/11 10:57
 */
public class V1PipelineRunPodTemplate {

    @SerializedName("nodeSelector")
    private Map<String, String> nodeSelector = null;

    @SerializedName("tolerations")
    private List<VToleration> tolerations = null;

    @SerializedName("affinity")
    private VAffinity affinity;

    @SerializedName("securityContext")
    private VPodSecurityContext securityContext;

    @SerializedName("volumes")
    private List<VVolume> volumes = null;

    @SerializedName("runtimeClassName")
    private String runtimeClassName;

    @SerializedName("automountServiceAccountToken")
    private Boolean automountServiceAccountToken;

    @SerializedName("dnsPolicy")
    private String dnsPolicy;

    @SerializedName("dnsConfig")
    private VPodDNSConfig dnsConfig;

    @SerializedName("enableServiceLinks")
    private Boolean enableServiceLinks;

    @SerializedName("priorityClassName")
    private String priorityClassName;

    @SerializedName("schedulerName")
    private String schedulerName;

    @SerializedName("imagePullSecrets")
    private List<VLocalObjectReference> imagePullSecrets = null;

    @SerializedName("hostNetwork")
    private Boolean hostNetwork;


    public Map<String, String> getNodeSelector() {
        return nodeSelector;
    }

    public void setNodeSelector(Map<String, String> nodeSelector) {
        this.nodeSelector = nodeSelector;
    }

    public List<VToleration> getTolerations() {
        return tolerations;
    }

    public void setTolerations(List<VToleration> tolerations) {
        this.tolerations = tolerations;
    }

    public VAffinity getAffinity() {
        return affinity;
    }

    public void setAffinity(VAffinity affinity) {
        this.affinity = affinity;
    }

    public VPodSecurityContext getSecurityContext() {
        return securityContext;
    }

    public void setSecurityContext(VPodSecurityContext securityContext) {
        this.securityContext = securityContext;
    }

    public List<VVolume> getVolumes() {
        return volumes;
    }

    public void setVolumes(List<VVolume> volumes) {
        this.volumes = volumes;
    }

    public String getRuntimeClassName() {
        return runtimeClassName;
    }

    public void setRuntimeClassName(String runtimeClassName) {
        this.runtimeClassName = runtimeClassName;
    }

    public Boolean getAutomountServiceAccountToken() {
        return automountServiceAccountToken;
    }

    public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
        this.automountServiceAccountToken = automountServiceAccountToken;
    }

    public String getDnsPolicy() {
        return dnsPolicy;
    }

    public void setDnsPolicy(String dnsPolicy) {
        this.dnsPolicy = dnsPolicy;
    }

    public VPodDNSConfig getDnsConfig() {
        return dnsConfig;
    }

    public void setDnsConfig(VPodDNSConfig dnsConfig) {
        this.dnsConfig = dnsConfig;
    }

    public Boolean getEnableServiceLinks() {
        return enableServiceLinks;
    }

    public void setEnableServiceLinks(Boolean enableServiceLinks) {
        this.enableServiceLinks = enableServiceLinks;
    }

    public String getPriorityClassName() {
        return priorityClassName;
    }

    public void setPriorityClassName(String priorityClassName) {
        this.priorityClassName = priorityClassName;
    }

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }

    public List<VLocalObjectReference> getImagePullSecrets() {
        return imagePullSecrets;
    }

    public void setImagePullSecrets(List<VLocalObjectReference> imagePullSecrets) {
        this.imagePullSecrets = imagePullSecrets;
    }

    public Boolean getHostNetwork() {
        return hostNetwork;
    }

    public void setHostNetwork(Boolean hostNetwork) {
        this.hostNetwork = hostNetwork;
    }
}
