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
public class V1Beta1TektonSidecar {

    private String name;

    private String image;

    private List<String> command;

    private List<String> args;

    private String workingDir;

    private List<V1ContainerPort> ports;

    private List<V1EnvFromSource> envFrom;

    private List<V1EnvVar> env;

    private V1ResourceRequirements resources;

    private List<V1VolumeMount> volumeMounts;

    private List<V1VolumeDevice> volumeDevices;

    private V1Probe livenessProbe;

    private V1Probe readinessProbe;

    private V1Probe startupProbe;

    private V1Lifecycle lifecycle;

    private String terminationMessagePath;

    private String terminationMessagePolicy;

    private String imagePullPolicy;

    private V1SecurityContext securityContext;

    private Boolean stdin;

    private Boolean stdinOnce;

    private Boolean tty;

    private String script;

    private List<V1Beta1TektonWorkspaceUsage> workspaces;
}
