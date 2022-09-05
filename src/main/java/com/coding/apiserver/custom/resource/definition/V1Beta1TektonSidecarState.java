package com.coding.apiserver.custom.resource.definition;


import io.kubernetes.client.openapi.models.V1ContainerState;
import io.kubernetes.client.openapi.models.V1ContainerStateRunning;
import io.kubernetes.client.openapi.models.V1ContainerStateTerminated;
import io.kubernetes.client.openapi.models.V1ContainerStateWaiting;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonSidecarState {

    private V1ContainerStateRunning running;

    private V1ContainerStateTerminated terminated;

    private V1ContainerStateWaiting waiting;

    private String name;

    private String container;

    private String imageID;

}
