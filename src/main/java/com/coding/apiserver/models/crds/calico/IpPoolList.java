package com.coding.apiserver.models.crds.calico;

import com.coding.apiserver.models.VListMeta;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: IpPoolList
 * @Description: 地址池list资源对象
 * Author:  liangjingming
 * Date: 2020/8/7 16:35
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class IpPoolList {

    /**
     * API版本
     */
    @SerializedName("apiVersion")
    private String apiVersion = null;

    /**
     * 流水线资源结果列表
     */
    @SerializedName("items")
    private List<IpPool> items = new ArrayList<>();

    /**
     * 类型
     */
    @SerializedName("kind")
    private String kind = null;

    /**
     * 列表类型基本参数
     */
    @SerializedName("metadata")
    private VListMeta metadata = null;

}
