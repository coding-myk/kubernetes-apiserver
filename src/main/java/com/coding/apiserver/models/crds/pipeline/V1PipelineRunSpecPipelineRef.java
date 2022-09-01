package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TEKTON中流水线执行(pipelinerun)特殊参数
 * @Date 2020/4/15 15:49
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineRunSpecPipelineRef {

    /**
     * 关联的流水线名称
     */
    @SerializedName("name")
    private String name;

}
