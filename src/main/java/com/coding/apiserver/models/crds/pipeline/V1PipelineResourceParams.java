package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description K8s流水线交互资源参数
 * @Date 2020/3/12 18:00
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineResourceParams {

    /**
     * 参数名称
     */
    @SerializedName("name")
    private String name = null;

    /**
     * 参数值
     */
    @SerializedName("value")
    private String value = null;

}
