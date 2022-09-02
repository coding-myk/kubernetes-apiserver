package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 流水线任务执行资源状态步骤信息
 * @Date 2020/3/19 16:01
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskRunStatusStep {

    /**
     * 步骤名称
     */
    @SerializedName("name")
    private String name = null;

    /**
     * 关联镜像ID
     */
    @SerializedName("imageID")
    private String imageID = null;

    /**
     * 容名称
     */
    @SerializedName("container")
    private String container = null;

    /**
     * 结束信息
     */
    @SerializedName("terminated")
    private V1TaskRunStatusStepTerminated terminated = null;

}
