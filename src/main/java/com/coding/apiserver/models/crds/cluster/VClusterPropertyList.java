package com.coding.apiserver.models.crds.cluster;

import com.coding.apiserver.models.VListMeta;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName VClusterPropertyList
 * @Description java类作用描述
 * @date 2022/6/14 11:05
 */
public class VClusterPropertyList {

    @SerializedName("apiVersion")
    private String apiVersion;

    @SerializedName("kind")
    private String kind;

    @SerializedName("metadata")
    private VListMeta metadata;

    @SerializedName("items")
    private List<VClusterProperty> items = new ArrayList<>();

}
