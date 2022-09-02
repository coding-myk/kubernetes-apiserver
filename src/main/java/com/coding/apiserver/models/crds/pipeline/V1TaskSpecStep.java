package com.coding.apiserver.models.crds.pipeline;

import com.coding.apiserver.models.VVolumeMount;
import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description 流水线任务资源步骤信息
 * @Date 2020/3/13 17:21
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskSpecStep {

    /**
     * 名称
     */
    @SerializedName("name")
    private String name = null;

    /**
     * 镜像
     */
    @SerializedName("image")
    private String image = null;

    /**
     * 执行路径
     */
    @SerializedName("workingDir")
    private String workingDir = null;

    /**
     * 执行命令行
     */
    @SerializedName("script")
    private String script = null;

    /**
     * 命令列表
     */
    @SerializedName("command")
    private List<String> command = null;

    /**
     * 执行参数
     */
    @SerializedName("args")
    private List<String> args = null;

    /**
     * 环境变量
     */
    @SerializedName("env")
    private List<V1TaskSpecStepEnv> env = null;

    /**
     * 挂载卷
     */
    @SerializedName("volumeMounts")
    private List<VVolumeMount> volumeMounts = null;
}
