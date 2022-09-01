package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: V1PipelineRunStatusTaskRun
 * @Description:
 * @author: sihanqiu
 * @date: 2021年01月22日 18:16
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineRunStatusTaskRun {

    /**
     * 状态对应的任务名
     */
    @SerializedName("pipelineTaskName")
    private String pipelineTaskName;

    /**
     * 对应任务的状态
     */
    @SerializedName("status")
    private V1TaskRunStatus status;
}
