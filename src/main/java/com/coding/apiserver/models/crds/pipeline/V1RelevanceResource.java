package com.coding.apiserver.models.crds.pipeline;

import com.coding.apiserver.resource.VResource;
import com.coding.apiserver.models.VObjectMeta;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName: V1ToolChainRefProject
 * @Description: 工具链和项目关联资源
 * @author: sihanqiu
 * @date: 2021年04月19日 10:41
 */
@Data
public class V1RelevanceResource extends VResource {

    public static final String resourceName = "relevanceresource";

    public V1RelevanceResource() {
        super();
        super.k_resource = resourceName;
    }

    public V1RelevanceResource(String apiVersion, String kind, VObjectMeta metadata) {
        super();
        super.k_resource = resourceName;

        this.apiVersion = apiVersion;
        this.kind = kind;
        this.metadata = metadata;
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
}
