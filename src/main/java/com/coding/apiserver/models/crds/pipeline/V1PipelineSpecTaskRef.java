package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TEKTON中流水线(pipeline)特殊参数
 * @Date 2020/4/10 16:43
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineSpecTaskRef {

    /**
     * 关联任务名称
     */
    @SerializedName("name")
    private String name;

}
