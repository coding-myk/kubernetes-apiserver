package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description 流水线任务资源
 * @Date 2020/3/13 17:29
 * @Created by 景海波
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskSpecResource {

    /**
     * 输入参数
     */
    @SerializedName("inputs")
    private List<V1TaskSpecInput> inputs = null;

    /**
     * 输出参数
     */
    @SerializedName("outputs")
    private List<V1TaskSpecOutput> outputs = null;

}
