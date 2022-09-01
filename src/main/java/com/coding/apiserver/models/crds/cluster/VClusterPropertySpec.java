package com.coding.apiserver.models.crds.cluster;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName VClusterPropertySpec
 * @Description java类作用描述
 * @date 2022/6/14 10:24
 */
public class VClusterPropertySpec {

    @SerializedName("clusterinfo")
    private List<VClusterPropertySpecClusterInfo> clusterinfo;

    @SerializedName("cniplugin")
    private List<VClusterPropertySpecCniPlugin> cniplugin;

    @SerializedName("criplugin")
    private List<VClusterPropertySpecCriPlugin> criplugin;

    @SerializedName("ipstack")
    private String ipstack;

    @SerializedName("f5bigip")
    private List<VClusterPropertySpecF5bigip> f5bigip;

    @SerializedName("oam")
    private List<VClusterPropertySpecOam> oam;

    @SerializedName("serivcemesh")
    private List<VClusterPropertySpecServicemesh> serivcemesh;

    public List<VClusterPropertySpecClusterInfo> getClusterinfo() {
        return clusterinfo;
    }

    public void setClusterinfo(List<VClusterPropertySpecClusterInfo> clusterinfo) {
        this.clusterinfo = clusterinfo;
    }

    public List<VClusterPropertySpecCniPlugin> getCniplugin() {
        return cniplugin;
    }

    public void setCniplugin(List<VClusterPropertySpecCniPlugin> cniplugin) {
        this.cniplugin = cniplugin;
    }

    public List<VClusterPropertySpecCriPlugin> getCriplugin() {
        return criplugin;
    }

    public void setCriplugin(List<VClusterPropertySpecCriPlugin> criplugin) {
        this.criplugin = criplugin;
    }

    public String getIpstack() {
        return ipstack;
    }

    public void setIpstack(String ipstack) {
        this.ipstack = ipstack;
    }

    public List<VClusterPropertySpecF5bigip> getF5bigip() {
        return f5bigip;
    }

    public void setF5bigip(List<VClusterPropertySpecF5bigip> f5bigip) {
        this.f5bigip = f5bigip;
    }

    public List<VClusterPropertySpecOam> getOam() {
        return oam;
    }

    public void setOam(List<VClusterPropertySpecOam> oam) {
        this.oam = oam;
    }

    public List<VClusterPropertySpecServicemesh> getSerivcemesh() {
        return serivcemesh;
    }

    public void setSerivcemesh(List<VClusterPropertySpecServicemesh> serivcemesh) {
        this.serivcemesh = serivcemesh;
    }
}
