package com.coding.apiserver.models.crds.cluster;

import com.google.gson.annotations.SerializedName;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName VClusterPropertySpecClusterInfo
 * @Description java类作用描述
 * @date 2022/6/14 10:27
 */
public class VClusterPropertySpecClusterInfo {

    @SerializedName("name")
    private String name;

    @SerializedName("provider")
    private String provider;

    @SerializedName("version")
    private String version;

    @SerializedName("majorversion")
    private Double majorversion;

    @SerializedName("patchversion")
    private Integer patchversion;

    @SerializedName("service-domain")
    private String service_domain;

    @SerializedName("service-ip-range")
    private String service_ip_range;

    @SerializedName("cluster-cidr")
    private String cluster_cidr;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Double getMajorversion() {
        return majorversion;
    }

    public void setMajorversion(Double majorversion) {
        this.majorversion = majorversion;
    }

    public Integer getPatchversion() {
        return patchversion;
    }

    public void setPatchversion(Integer patchversion) {
        this.patchversion = patchversion;
    }

    public String getService_domain() {
        return service_domain;
    }

    public void setService_domain(String service_domain) {
        this.service_domain = service_domain;
    }

    public String getService_ip_range() {
        return service_ip_range;
    }

    public void setService_ip_range(String service_ip_range) {
        this.service_ip_range = service_ip_range;
    }

    public String getCluster_cidr() {
        return cluster_cidr;
    }

    public void setCluster_cidr(String cluster_cidr) {
        this.cluster_cidr = cluster_cidr;
    }
}
