package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 流水线任务执行资源输出参数
 * @Date 2020/3/16 15:09
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskRunSpecOutput {

    /**
     * 资源名称
     */
    @SerializedName("name")
    private String name = null;

    /**
     * 关联资源信息
     */
    @SerializedName("resourceRef")
    private V1TaskRunSpecOutputResourceRef resourceRef = null;

}
