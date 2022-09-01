package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description TEKTON中流水线执行(pipelinerun)特殊参数
 * @Date 2020/4/15 15:47
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineRunSpec {

    public V1PipelineRunSpec(V1PipelineRunSpecPipelineRef pipelineRef, List<V1PipelineRunSpecResource> resources, List<V1PipelineRunSpecParam> params, V1PipelineRunSpecTrigger trigger, String serviceAccountName, List<V1PipelineRunSpecWorkspace> workspaces) {
        this.pipelineRef = pipelineRef;
        this.resources = resources;
        this.params = params;
        this.trigger = trigger;
        this.serviceAccountName = serviceAccountName;
        this.workspaces = workspaces;
    }

    /**
     * 关联流水线信息
     */
    @SerializedName("pipelineRef")
    private V1PipelineRunSpecPipelineRef pipelineRef;

    /**
     * 资源信息列表
     */
    @SerializedName("resources")
    private List<V1PipelineRunSpecResource> resources;

    /**
     * 参数信息列表
     */
    @SerializedName("params")
    private List<V1PipelineRunSpecParam> params;

    /**
     * 触发器
     */
    @SerializedName("trigger")
    private V1PipelineRunSpecTrigger trigger;

    /**
     * 关联服务账号
     */
    @SerializedName("serviceAccountName")
    private String serviceAccountName;

    @SerializedName("workspaces")
    private List<V1PipelineRunSpecWorkspace> workspaces;

    @SerializedName("podTemplate")
    private V1PipelineRunPodTemplate podTemplate;

}
