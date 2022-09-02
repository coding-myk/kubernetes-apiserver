package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: V1PipelineSpecWorkspace
 * @Description:
 * @author: sihanqiu
 * @date: 2021年01月13日 12:06
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineSpecWorkspace {

    @SerializedName("name")
    private String name;
}
