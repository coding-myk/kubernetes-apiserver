package com.coding.apiserver.custom.resource.definition;


import io.kubernetes.client.openapi.models.V1ContainerStateRunning;
import io.kubernetes.client.openapi.models.V1ContainerStateTerminated;
import io.kubernetes.client.openapi.models.V1ContainerStateWaiting;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonSidecarState {

    /**
     * 容器三种状态
     */
    @ApiModelProperty(value = "running 状态", position = 0)
    private V1ContainerStateRunning running;

    @ApiModelProperty(value = "terminated 状态",position = 1)
    private V1ContainerStateTerminated terminated;

    @ApiModelProperty(value = "waiting 状态", position = 2)
    private V1ContainerStateWaiting waiting;

    @ApiModelProperty(value = "step name", position = 3)
    private String name;

    @ApiModelProperty(value = "step container",position = 4)
    private String container;

    @ApiModelProperty(value = "镜像id", position = 5)
    private String imageID;

}
