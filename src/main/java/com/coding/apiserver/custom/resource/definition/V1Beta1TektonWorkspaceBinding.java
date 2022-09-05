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


    private String name;

    private String subPath;

    @ApiModelProperty(value = "volumeClaimTemplate",notes = "创建 pvc 所需要的信息")
    private VolumeClaimTemplate volumeClaimTemplate;

    @ApiModelProperty(value = "persistentVolumeClaim", notes = "已经存在的 pvc")
    private PersistentVolumeClaim persistentVolumeClaim;

    private V1EmptyDirVolumeSource emptyDir;

    private V1ConfigMapVolumeSource configMap;

    private V1SecretVolumeSource secret;

    private V1ProjectedVolumeSource projected;

    private V1CSIVolumeSource csi;

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class PersistentVolumeClaim {
        private String claimName;
    }

    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class VolumeClaimTemplate {
       private V1PersistentVolumeClaimSpec spec;
    }


}
