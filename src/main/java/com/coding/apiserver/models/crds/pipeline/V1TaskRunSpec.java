package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description 流水线任务执行资源特殊参数
 * @Date 2020/3/16 15:03
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskRunSpec {

    /**
     * 关联的服务账户
     */
    @SerializedName("serviceAccount")
    private String serviceAccountName = null;

    /**
     * 关联的流水线任务资源信息
     */
    @SerializedName("taskRef")
    private V1TaskRunSpecTaskRef taskRef = null;

    /**
     * 参数列表
     */
    @SerializedName("params")
    private List<V1TaskRunSpecInputParam> params = null;

    /**
     * 资源列表
     */
    @SerializedName("resources")
    private V1TaskRunSpecResource resources = null;

}
