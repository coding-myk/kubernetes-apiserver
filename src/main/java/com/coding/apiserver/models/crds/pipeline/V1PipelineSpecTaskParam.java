package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TEKTON中流水线(pipeline)特殊参数
 * @Date 2020/4/10 17:44
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineSpecTaskParam {

    /**
     * 参数名称
     */
    @SerializedName("name")
    private String name;

    /**
     * 参数名称
     */
    @SerializedName("value")
    private String value;

}
