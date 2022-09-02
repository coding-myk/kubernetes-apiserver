package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: V1PipelineRunSpecWorkspacePersistentVolumeClaim
 * @Description:
 * @author: sihanqiu
 * @date: 2021年01月20日 11:17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1PipelineRunSpecWorkspacePersistentVolumeClaim {

    /**
     * 挂载的pvc名称
     */
    @SerializedName("claimName")
    private String claimName;
}
