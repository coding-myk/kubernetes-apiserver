package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description 流水线特殊资源参数
 * @Date 2020/3/11 17:02
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineResourceSpec {

    /**
     * 资源参数列表
     */
    @SerializedName("params")
    private List<V1PipelineResourceParams> params = null;

    /**
     * 资源参数类型
     */
    @SerializedName("type")
    private String type = null;
}
