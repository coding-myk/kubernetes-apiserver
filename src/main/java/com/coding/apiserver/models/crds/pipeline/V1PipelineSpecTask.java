package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description TEKTON中流水线(pipeline)特殊参数
 * @Date 2020/4/10 11:55
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineSpecTask {

    /**
     * 任务名称
     */
    @SerializedName("name")
    private String name;

    /**
     * 前置任务
     */
    @SerializedName("runAfter")
    private List<String> runAfter;

    /**
     * 关联任务信息
     */
    @SerializedName("taskRef")
    private V1PipelineSpecTaskRef taskRef;

    /**
     * 任务参数
     */
    @SerializedName("params")
    private List<V1PipelineSpecTaskParam> params;

    /**
     * 任务资源
     */
    @SerializedName("resources")
    private V1PipelineSpecTaskResources resources;

    /**
     * 任务资源
     */
    @SerializedName("workspaces")
    private List<V1PipelineSpecTaskWorkspace> workspaces;
}
