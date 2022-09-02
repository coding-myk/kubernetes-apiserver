package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 流水线任务资源输入参数
 * @Date 2020/3/13 17:17
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskSpecInput {

    /**
     * 名称
     */
    @SerializedName("name")
    private String name = null;

    /**
     * 类型
     */
    @SerializedName("type")
    private String type = null;

}
