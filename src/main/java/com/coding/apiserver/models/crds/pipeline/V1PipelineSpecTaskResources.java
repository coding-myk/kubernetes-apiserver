package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description TEKTON中流水线(pipeline)特殊参数
 * @Date 2020/4/10 17:47
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineSpecTaskResources {

    /**
     * 任务资源输入
     */
    @SerializedName("inputs")
    private List<V1PipelineSpecTaskResourceInput> inputs;

    /**
     * 任务输出资源
     */
    @SerializedName("outputs")
    private List<V1PipelineSpecTaskResourceOutput> outputs;


}
