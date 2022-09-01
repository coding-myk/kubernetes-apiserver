package com.coding.apiserver.models.crds.pipeline;

import com.coding.apiserver.resource.VResource;
import com.coding.apiserver.models.VObjectMeta;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description k8s交互流水线资源
 * @Date 2020/3/11 16:58
 * @Created by 景海波
 */

@Data
public class V1PipelineResource extends VResource {

    public static final String resourceName = "pipelineresource";

    public V1PipelineResource() {
        super();
        super.k_resource = resourceName;
    }

    public V1PipelineResource(String apiVersion, String kind, VObjectMeta metadata, V1PipelineResourceSpec spec) {
        super();
        super.k_resource = resourceName;

        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
    }

    /**
     * api版本
     */
    @SerializedName("apiVersion")
    private String apiVersion = null;

    /**
     * 类型
     */
    @SerializedName("kind")
    private String kind = null;

    /**
     * 基础信息参数
     */
    @SerializedName("metadata")
    private VObjectMeta metadata = null;

    /**
     * 流水线特殊参数
     */
    @SerializedName("spec")
    private V1PipelineResourceSpec spec = null;

}
