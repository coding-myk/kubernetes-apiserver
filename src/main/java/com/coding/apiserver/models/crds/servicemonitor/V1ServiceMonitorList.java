package com.coding.apiserver.models.crds.servicemonitor;

import com.coding.apiserver.models.VObjectMeta;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName V1ServiceMonitorList
 * @Description ServcieMonitorList资源对象
 * @date 2021/6/9 14:26
 */
@ApiModel(
        description = "ServcieMonitorList资源对象"
)
public class V1ServiceMonitorList {

    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("kind")
    private String kind;

    @SerializedName("metadata")
    private VObjectMeta metadata;

    @SerializedName("items")
    private List<V1ServiceMonitor> items = new ArrayList();

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

    public List<V1ServiceMonitor> getItems() {
        return items;
    }

    public void setItems(List<V1ServiceMonitor> items) {
        this.items = items;
    }
}
