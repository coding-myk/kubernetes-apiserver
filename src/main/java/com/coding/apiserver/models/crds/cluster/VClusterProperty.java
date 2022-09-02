package com.coding.apiserver.models.crds.cluster;

import com.coding.apiserver.resource.VResource;
import com.coding.apiserver.models.VObjectMeta;
import com.google.gson.annotations.SerializedName;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName VClusterProperty
 * @Description java类作用描述
 * @date 2022/6/14 10:23
 */
public class VClusterProperty extends VResource {

    public static final String resourceName = "clusterproperty";

    public VClusterProperty() {
        super();
        super.k_resource = resourceName;
    }

    @SerializedName("apiVersion")
    private String apiVersion = "cce.bobfintech.com/v1";

    @SerializedName("kind")
    private String kind = "ClusterProperty";

    @SerializedName("metadata")
    private VObjectMeta metadata;

    @SerializedName("spec")
    private VClusterPropertySpec spec;

    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public VObjectMeta getMetadata() {
        return metadata;
    }

    public void setMetadata(VObjectMeta metadata) {
        this.metadata = metadata;
    }

    public VClusterPropertySpec getSpec() {
        return spec;
    }

    public void setSpec(VClusterPropertySpec spec) {
        this.spec = spec;
    }
}
