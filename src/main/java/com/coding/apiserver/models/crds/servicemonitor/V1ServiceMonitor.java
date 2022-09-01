package com.coding.apiserver.models.crds.servicemonitor;

import com.coding.apiserver.resource.VResource;
import com.coding.apiserver.models.VObjectMeta;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName V1ServiceMonitor
 * @Description ServcieMonitor资源对象
 * @date 2021/6/8 17:06
 */
@ApiModel(
        description = "ServcieMonitor资源对象"
)
public class V1ServiceMonitor extends VResource {

    public static final String resourceName = "servciemonitor";

    public V1ServiceMonitor() {
        super();
        super.k_resource = resourceName;
    }

    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("kind")
    private String kind;

    @SerializedName("metadata")
    private VObjectMeta metadata;

    @SerializedName("spec")
    private V1ServiceMonitorSpec spec;

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

    public V1ServiceMonitorSpec getSpec() {
        return spec;
    }

    public void setSpec(V1ServiceMonitorSpec spec) {
        this.spec = spec;
    }
}
