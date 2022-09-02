package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TEKTON中流水线(pipeline)特殊参数
 * @Date 2020/4/16 10:28
 * @Created by 景海波
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineSpecParam {

    /**
     * 名称
     */
    @SerializedName("name")
    private String name;

    /**
     * 类型
     */
    @SerializedName("type")
    private String type;

}
