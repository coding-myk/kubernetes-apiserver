package com.coding.apiserver.models.crds.pipeline;

import com.coding.apiserver.resource.VResource;
import com.coding.apiserver.models.VObjectMeta;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 流水线任务执行资源
 * @Date 2020/3/16 15:02
 * @Created by 景海波
 */

@Data
public class V1TaskRun extends VResource {

    public static final String resourceName = "pipelinetaskrun";

    public V1TaskRun() {
        super();
        super.k_resource = resourceName;
    }

    public V1TaskRun(String apiVersion, String kind, VObjectMeta metadata, V1TaskRunSpec spec, V1TaskRunStatus status) {
        super();
        super.k_resource = resourceName;

        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
    }

    /**
     * API版本
     */
    @SerializedName("apiVersion")
    private String apiVersion = null;

    /**
     * 类型
     */
    @SerializedName("kind")
    private String kind = null;

    /**
     * 资源基本信息
     */
    @SerializedName("metadata")
    private VObjectMeta metadata = null;

    /**
     * 资源特殊参数
     */
    @SerializedName("spec")
    private V1TaskRunSpec spec = null;

    /**
     * 资源状态信息
     */
    @SerializedName("status")
    private V1TaskRunStatus status = null;

}
