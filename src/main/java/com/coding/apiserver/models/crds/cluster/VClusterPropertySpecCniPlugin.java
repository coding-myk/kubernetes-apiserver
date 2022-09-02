package com.coding.apiserver.models.crds.cluster;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName VClusterPropertySpecCniPlugin
 * @Description java类作用描述
 * @date 2022/6/14 10:38
 */
public class VClusterPropertySpecCniPlugin {

    private String provider;

    private String version;

    private Double majorversion;

    private Integer patchversion;

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
}
