package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: V1PipelineRunSpecWorkspace
 * @Description:
 * @author: sihanqiu
 * @date: 2021年01月20日 10:50
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineRunSpecWorkspace {

    @SerializedName("name")
    private String name;

    @SerializedName("persistentVolumeClaim")
    private V1PipelineRunSpecWorkspacePersistentVolumeClaim persistentVolumeClaim = null;
}
