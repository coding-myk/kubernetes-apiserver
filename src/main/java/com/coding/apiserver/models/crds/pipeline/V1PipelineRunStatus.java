package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

/**
 * @ClassName: V1PipelineRunStatus
 * @Description:
 * @author: sihanqiu
 * @date: 2021年01月22日 17:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineRunStatus {

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
     * 状态资源详细信息
     */
    @SerializedName("conditions")
    private List<V1TaskRunStatusCondition> conditions = null;

    /**
     *  pipeline 内容
     */
    @SerializedName("pipelineSpec")
    private V1PipelineSpec pipelineSpec;

    @SerializedName("taskRuns")
    private Map<String, V1PipelineRunStatusTaskRun> taskRuns;
}
