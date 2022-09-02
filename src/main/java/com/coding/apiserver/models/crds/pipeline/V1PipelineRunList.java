package com.coding.apiserver.models.crds.pipeline;

import com.coding.apiserver.models.VListMeta;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description TEKTON中流水线执行(pipelinerun)列表
 * @Date 2020/4/15 16:03
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineRunList {

    /**
     * API版本
     */
    @SerializedName("apiVersion")
    private String apiVersion = null;

    /**
     * 流水线资源结果列表
     */
    @SerializedName("items")
    private List<V1PipelineRun> items = new ArrayList<>();

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
