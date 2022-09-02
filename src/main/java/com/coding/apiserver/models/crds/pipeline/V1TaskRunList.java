package com.coding.apiserver.models.crds.pipeline;

import com.coding.apiserver.models.VListMeta;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 流水线任务执行资源列表
 * @Date 2020/3/16 15:49
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskRunList {

    /**
     * API版本
     */
    @SerializedName("apiVersion")
    private String apiVersion = null;

    /**
     * 资源列表
     */
    @SerializedName("items")
    private List<V1TaskRun> items = new ArrayList<>();

    /**
     * 资源类型
     */
    @SerializedName("kind")
    private String kind = null;

    /**
     * 列表资源基本信息
     */
    @SerializedName("metadata")
    private VListMeta metadata = null;

}
