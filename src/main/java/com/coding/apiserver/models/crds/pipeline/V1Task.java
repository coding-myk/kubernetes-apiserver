package com.coding.apiserver.models.crds.pipeline;

import com.coding.apiserver.resource.VResource;
import com.coding.apiserver.models.VObjectMeta;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @Description 流水线任务资源类型
 * @Date 2020/3/13 17:12
 * @Created by 景海波
 */

@Data
public class V1Task extends VResource {

    public static final String resourceName = "pipelinetask";

    public V1Task() {
        super();
        super.k_resource = resourceName;
    }

    public V1Task(String apiVersion, String kind, VObjectMeta metadata, V1TaskSpec spec) {
        super();
        super.k_resource = resourceName;

        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
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
     * 资源基础信息
     */
    @SerializedName("metadata")
    private VObjectMeta metadata = null;

    /**
     * 特殊资源类型
     */
    @SerializedName("spec")
    private V1TaskSpec spec = null;

}
