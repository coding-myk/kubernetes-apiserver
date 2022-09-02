package com.coding.apiserver.models.crds.cluster;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName VClusterPropertySpecServicemesh
 * @Description java类作用描述
 * @date 2022/6/14 10:44
 */
public class VClusterPropertySpecServicemesh {

    private Boolean enabled;

    private String version;

    private Double majorversion;

    private Integer patchversion;

    private String provider;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
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

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }
}
