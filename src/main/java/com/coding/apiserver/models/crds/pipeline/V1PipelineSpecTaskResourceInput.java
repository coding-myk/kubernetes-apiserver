package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description TEKTON中流水线(pipeline)特殊参数
 * @Date 2020/4/13 16:04
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineSpecTaskResourceInput {

    /**
     * 输入资源名称
     */
    @SerializedName("name")
    private String name;

    /**
     * 关联资源名称
     */
    @SerializedName("resource")
    private String resource;

    /**
     * 从其他任务获取资源的任务名称
     */
    @SerializedName("from")
    private List<String> from;

}
