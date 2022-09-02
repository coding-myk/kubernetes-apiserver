package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description TEKTON中流水线(pipeline)特殊参数
 * @Date 2020/4/10 10:27
 * @Created by 景海波
 */
@Data
public class V1PipelineSpec {

    public V1PipelineSpec() {
    }

    public V1PipelineSpec(List<V1PipelineSpecParam> params, List<V1PipelineSpecResource> resources, List<V1PipelineSpecTask> tasks, List<V1PipelineSpecWorkspace> workspaces) {
        this.params = params;
        this.resources = resources;
        this.tasks = tasks;
        this.workspaces = workspaces;
    }

    /**
     * 参数列表
     */
    @SerializedName("params")
    private List<V1PipelineSpecParam> params;

    /**
     * 资源列表
     */
    @SerializedName("resources")
    private List<V1PipelineSpecResource> resources;

    /**
     * 任务列表
     */
    @SerializedName("tasks")
    private List<V1PipelineSpecTask> tasks;

    /**
     * 工作空间绑定
     */
    @SerializedName("workspaces")
    private List<V1PipelineSpecWorkspace> workspaces;

    public List<V1PipelineSpecParam> getParams() {
        return params;
    }

    public void setParams(List<V1PipelineSpecParam> params) {
        this.params = params;
    }

    public List<V1PipelineSpecResource> getResources() {
        return resources;
    }

    public void setResources(List<V1PipelineSpecResource> resources) {
        this.resources = resources;
    }

    public List<V1PipelineSpecTask> getTasks() {
        return tasks;
    }

    public void setTasks(List<V1PipelineSpecTask> tasks) {
        this.tasks = tasks;
    }

    public List<V1PipelineSpecWorkspace> getWorkspaces() {
        return workspaces;
    }

    public void setWorkspaces(List<V1PipelineSpecWorkspace> workspaces) {
        this.workspaces = workspaces;
    }
}
