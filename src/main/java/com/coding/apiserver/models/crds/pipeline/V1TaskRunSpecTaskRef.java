package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 流水线任务执行资源关联任务资源信息
 * @Date 2020/3/16 15:07
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskRunSpecTaskRef {

    /**
     * 名称
     */
    @SerializedName("name")
    private String name = null;

    /**
     * 类型
     */
    @SerializedName("kind")
    private String kind = null;

}
