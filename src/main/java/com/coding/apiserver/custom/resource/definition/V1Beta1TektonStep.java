package com.coding.apiserver.custom.resource.definition;

import io.kubernetes.client.openapi.models.V1EnvVar;
import io.kubernetes.client.openapi.models.V1LimitRangeItem;
import io.kubernetes.client.openapi.models.V1PodSecurityContext;
import io.kubernetes.client.openapi.models.V1VolumeMount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(description = "Tekton Step")
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2022-08-30T16:45:00.555Z[Etc/UTC]")
public class V1Beta1TektonStep {

    private String name;

    private String image;

    private String workingDir;

    private String script;

    private List<String> command;

    private List<String> args;

    private List<V1EnvVar> env;

    private V1LimitRangeItem resources;

    private String timeout;

    @ApiModelProperty(value = "onError", notes = "value: continue or stopAndFail")
    private String onError;

    private Map<String,Object> stdoutConfig;

    private Map<String,Object> stderrConfig;

    private List<V1VolumeMount> volumeMounts;

    private V1PodSecurityContext securityContext;

}
