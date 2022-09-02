package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: V1PipelineSpecTaskworkspace
 * @Description:
 * @author: sihanqiu
 * @date: 2021年01月19日 17:49
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineSpecTaskWorkspace {

    @SerializedName("name")
    private String name;


    @SerializedName("workspace")
    private String workspace;
}
