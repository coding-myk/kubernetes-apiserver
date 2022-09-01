package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 流水线任务执行资源输出参数资源信息
 * @Date 2020/3/16 15:45
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskRunSpecOutputResource {

    /**
     * 资源名称
     */
    @SerializedName("name")
    private String name = null;

    /**
     * 关联输出资源信息
     */
    @SerializedName("resourceRef")
    private V1TaskRunSpecOutputResourceRef resourceRef = null;

}
