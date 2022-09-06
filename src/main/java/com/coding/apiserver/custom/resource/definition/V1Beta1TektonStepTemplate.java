package com.coding.apiserver.custom.resource.definition;

import io.kubernetes.client.openapi.models.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonStepTemplate {

    private String image;

    private List<String> command;

    private List<String> args;

    private String workingDir;

    private List<V1EnvFromSource> envFrom;

    private List<V1EnvVar> env;

    private V1ResourceRequirements resources;

    private List<V1VolumeMount> volumeMounts;

    private List<V1VolumeDevice> volumeDevices;

    private String imagePullPolicy;

    private V1SecurityContext securityContext;
}
