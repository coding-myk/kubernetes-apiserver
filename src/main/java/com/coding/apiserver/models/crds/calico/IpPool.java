package com.coding.apiserver.models.crds.calico;


import com.coding.apiserver.models.VObjectMeta;
import com.coding.apiserver.resource.VResource;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @ClassName: IpPool
 * @Description: 地址池
 * Author:  liangjingming
 * Date: 2020/8/7 15:34
 */
@Data
public class IpPool extends VResource {

    public static final String resourceName = "ippool";

    public IpPool() {
        super();
        super.k_resource = resourceName;
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
     * 地址池配置
     */
    @SerializedName("spec")
    private IpPoolSpec spec = null;
}
