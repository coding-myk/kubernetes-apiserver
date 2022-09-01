package com.coding.apiserver.models.crds.pipeline;

import com.coding.apiserver.resource.VResource;
import com.coding.apiserver.models.VObjectMeta;

/**
 * @Description TEKTON中流水线(pipeline)
 * @Date 2020/4/10 10:26
 * @Created by 景海波
 */
public class V1Pipeline extends VResource {

    public static final String resourceName = "pipeline";

    public V1Pipeline(){
        super();
        super.k_resource = resourceName;
    }

    public V1Pipeline(String apiVersion, String kind, VObjectMeta metadata, V1PipelineSpec spec) {
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
    private String apiVersion = null;

    /**
     * 类型
     */
    private String kind = null;

    /**
     * 基础信息参数
     */
    private VObjectMeta metadata = null;

    /**
     * 流水线特殊参数
     */
    private V1PipelineSpec spec = null;

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

    public V1PipelineSpec getSpec() {
        return spec;
    }

    public void setSpec(V1PipelineSpec spec) {
        this.spec = spec;
    }
}
