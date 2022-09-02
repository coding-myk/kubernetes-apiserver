package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TEKTON中流水线执行(pipelinerun)特殊参数
 * @Date 2020/4/15 15:50
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineRunSpecResource {

    /**
     * 资源名称
     */
    @SerializedName("name")
    private String name;

    /**
     * 关联的资源信息
     */
    @SerializedName("resourceRef")
    private V1PipelineRunSpecResourceRef resourceRef;

}
