package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: V1TaskSpecWorkspace
 * @Description:
 * @author: sihanqiu
 * @date: 2021年01月19日 18:15
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskSpecWorkspace {

    @SerializedName("name")
    private String name;

    @SerializedName("description")
    private String description;

    /**
     * 容器内挂载的目录
     */
    @SerializedName("mountPath")
    private String mountPath;

    @SerializedName("optional")
    private Boolean optional;
}
