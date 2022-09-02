package com.coding.apiserver.models.crds.pipeline;

import com.coding.apiserver.models.VListMeta;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 流水线任务资源列表
 * @Date 2020/3/13 17:54
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskList {

    /**
     * API版本
     */
    @SerializedName("apiVersion")
    private String apiVersion = null;

    /**
     * 任务参数资源列表
     */
    @SerializedName("items")
    private List<V1Task> items = new ArrayList<>();

    /**
     * 类型
     */
    @SerializedName("kind")
    private String kind = null;

    /**
     * 列表资源基础信息
     */
    @SerializedName("metadata")
    private VListMeta metadata = null;

}
