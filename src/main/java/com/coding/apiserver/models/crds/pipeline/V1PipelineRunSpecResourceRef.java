package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TEKTON中流水线执行(pipelinerun)特殊参数
 * @Date 2020/4/15 15:53
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineRunSpecResourceRef {

    /**
     * 关联资源的名称
     */
    @SerializedName("name")
    private String name;

}
