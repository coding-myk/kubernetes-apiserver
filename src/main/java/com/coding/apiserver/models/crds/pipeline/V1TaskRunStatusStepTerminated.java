package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 流水线任务执行资源状态步骤结束信息
 * @Date 2020/3/19 16:05
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskRunStatusStepTerminated {

    /**
     * 容器ID
     */
    @SerializedName("containerID")
    private String containerID = null;

    /**
     * 退出结果码
     */
    @SerializedName("exitCode")
    private String exitCode = null;

    /**
     * 结果原因标识
     */
    @SerializedName("reason")
    private String reason = null;

    /**
     * 结果信息
     */
    @SerializedName("message")
    private String message = null;

    /**
     * 开始时间
     */
    @SerializedName("startedAt")
    private String startedAt = null;

    /**
     * 结束时间
     */
    @SerializedName("finishedAt")
    private String finishedAt = null;

}
