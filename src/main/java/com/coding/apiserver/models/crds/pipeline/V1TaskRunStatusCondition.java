package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description 流水线任务执行资源状态详细信息
 * @Date 2020/3/16 17:51
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskRunStatusCondition {

    /**
     * 状态
     */
    @SerializedName("status")
    private String status = null;

    /**
     * 执行消息
     */
    @SerializedName("message")
    private String message = null;

    /**
     * 结果原因
     */
    @SerializedName("reason")
    private String reason = null;

    /**
     * 类型
     */
    @SerializedName("type")
    private String type = null;

    /**
     * 最后转换时间
     */
    @SerializedName("lastTransitionTime")
    private String lastTransitionTime = null;

}
