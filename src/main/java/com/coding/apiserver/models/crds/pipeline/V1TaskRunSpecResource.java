package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description 流水线任务执行资源输入资源
 * @Date 2020/3/16 15:12
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskRunSpecResource {

    /**
     * 输入资源参数
     */
    @SerializedName("inputs")
    private List<V1TaskRunSpecInput> inputs = null;

    /**
     * 输出资源参数
     */
    @SerializedName("outputs")
    private List<V1TaskRunSpecOutput> outputs = null;



}
