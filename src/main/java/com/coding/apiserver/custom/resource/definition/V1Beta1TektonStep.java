package com.coding.apiserver.custom.resource.definition;

import io.kubernetes.client.openapi.models.*;
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
public class V1Beta1TektonStep {

    private String name;

    private String image;

    private List<String> command;

    private List<String> args;

    private String workingDir;

    private List<V1EnvFromSource> envFrom;

    private List<V1EnvVar> env;

    private V1ResourceRequirements resources;

    private List<V1VolumeMount> volumeMounts;

    private List<V1VolumeDevice> volumeDevices;

    @ApiModelProperty(value = "镜像拉取策略", notes = "Always, Never, IfNotPresent,默认 Always")
    private String imagePullPolicy;

    private V1SecurityContext securityContext;

    private String script;

    private String timeout;

    private List<V1Beta1TektonWorkspaceUsage> workspaces;

    @ApiModelProperty(value = "onError", notes = "value: continue or stopAndFail")
    private String onError;

    private StepOutputConfig stdoutConfig;

    private StepOutputConfig stderrConfig;


    @Builder
    @NoArgsConstructor
    @AllArgsConstructor
    @Data
    public static class StepOutputConfig {

        private String path;

    }



}
