package com.coding.apiserver.custom.resource.definition;

import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.openapi.models.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(description = "TektonTaskRunSpec workspaces VolumeSources")
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2022-08-30T16:45:00.555Z[Etc/UTC]")
public class V1Beta1TektonTaskRunOrPipelineRunWorkspace {


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
