package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TEKTON中流水线(pipeline)特殊参数
 * @Date 2020/4/13 16:05
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineSpecTaskResourceOutput {

    /**
     * 任务资源输出名称
     */
    @SerializedName("name")
    private String name;

    /**
     * 相关任务资源名称
     */
    @SerializedName("resource")
    private String resource;
}
