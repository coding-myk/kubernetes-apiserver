package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description TEKTON中流水线执行(pipelinerun)参数
 * @Date 2020/4/15 15:54
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineRunSpecParam {

    /**
     * 参数名称
     */
    @SerializedName("name")
    private String name;

    /**
     * 参数取值
     */
    @SerializedName("value")
    private String value;

}
