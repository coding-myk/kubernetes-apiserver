package com.coding.apiserver.models.crds.pipeline;

import com.coding.apiserver.resource.VResource;
import com.coding.apiserver.models.VObjectMeta;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @Description TEKTON中流水线执行(pipelinerun)
 * @Date 2020/4/15 15:45
 * @Created by 景海波
 */

@Data
public class V1PipelineRun extends VResource {

    public static final String resourceName = "pipelinerun";

    public V1PipelineRun() {
        super();
        super.k_resource = resourceName;
    }

    public V1PipelineRun(String apiVersion, String kind, VObjectMeta metadata, V1PipelineRunSpec spec, V1PipelineRunStatus status) {
        super();
        super.k_resource = resourceName;

        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
        this.spec = spec;
        this.status = status;
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
    private V1PipelineRunSpec spec = null;

    @SerializedName("status")
    private V1PipelineRunStatus status = null;

}
