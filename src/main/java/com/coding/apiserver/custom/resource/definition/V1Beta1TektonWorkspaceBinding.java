package com.coding.apiserver.custom.resource.definition;

import io.kubernetes.client.openapi.models.*;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonWorkspaceBinding {


    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "挂载文件地址", position = 1)
    private String subPath;

    @ApiModelProperty(value = "volumeClaimTemplate",notes = "创建 pvc 所需要的信息",position = 2)
    private V1PersistentVolumeClaim volumeClaimTemplate;

    @ApiModelProperty(value = "persistentVolumeClaim", notes = "已经存在的 pvc", position = 3)
    private V1PersistentVolumeClaimVolumeSource persistentVolumeClaim;

    @ApiModelProperty(value = "emptyDir", position = 4)
    private V1EmptyDirVolumeSource emptyDir;

    @ApiModelProperty(value = "configMap", position = 5)
    private V1ConfigMapVolumeSource configMap;

    @ApiModelProperty(value = "secret", position = 6)
    private V1SecretVolumeSource secret;

    @ApiModelProperty(value = "projected", position = 7)
    private V1ProjectedVolumeSource projected;

    @ApiModelProperty(value = "csi", position = 8)
    private V1CSIVolumeSource csi;

}
