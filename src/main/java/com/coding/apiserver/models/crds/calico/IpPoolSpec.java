package com.coding.apiserver.models.crds.calico;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

/**
 * @ClassName: IpPoolSpec
 * @Description: 地址池配置
 * Author:  liangjingming
 * Date: 2020/8/7 15:36
 */
@Data
public class IpPoolSpec {

    /**
     * 地址池块
     */
    @SerializedName("blockSize")
    private Integer blockSize;

    /**
     * 地址段/网络地址位数
     */
    @SerializedName("cidr")
    private String cidr;

    /**
     * ipip模式
     */
    @SerializedName("ipipMode")
    private String ipipMode;

    /**
     * 是否外网
     */
    @SerializedName("natOutgoing")
    private Boolean natOutgoing;
}
