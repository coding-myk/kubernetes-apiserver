package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description 流水线任务执行资源状态信息
 * @Date 2020/3/16 17:48
 * @Created by 景海波
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskRunStatus {

    /**
     * 开始执行时间
     */
    @SerializedName("startTime")
    private String startTime = null;

    /**
     * 结束执行时间
     */
    @SerializedName("completionTime")
    private String completionTime = null;

    /**
     * 关联pod资源名称
     */
    @SerializedName("podName")
    private String podName = null;

    /**
     * 状态资源详细信息
     */
    @SerializedName("conditions")
    private List<V1TaskRunStatusCondition> conditions = null;

    /**
     * 执行步骤信息
     */
    @SerializedName("steps")
    private List<V1TaskRunStatusStep> steps = null;

}
