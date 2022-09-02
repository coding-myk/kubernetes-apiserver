package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 流水线任务执行资源输入参数
 * @Date 2020/3/16 15:12
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskRunSpecInputParam {

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
