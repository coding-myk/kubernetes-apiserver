package com.coding.apiserver.models.crds.pipeline;

import com.coding.apiserver.models.VVolume;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description 流水线任务资源特殊参数
 * @Date 2020/3/13 17:14
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskSpec {



    /**
     * 输入参数
     */
    @SerializedName("params")
    private List<V1TaskSpecInputParam> params = null;

    /**
     * 输入资源
     */
    @SerializedName("resources")
    private V1TaskSpecResource resources = null;

    /**
     * 步骤信息
     */
    @SerializedName("steps")
    private List<V1TaskSpecStep> steps = null;

    /**
     * workspaces
     */
    @SerializedName("workspaces")
    private List<V1TaskSpecWorkspace> workspaces = null;

    /**
     * 挂载卷
     */
    @SerializedName("volumes")
    private List<VVolume> volumes;
}
