package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 流水线任务执行资源输入资源关联信息
 * @Date 2020/3/16 15:42
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskRunSpecInputResourceRef {

    /**
     * 资源名称
     */
    @SerializedName("name")
    private String name = null;

}
