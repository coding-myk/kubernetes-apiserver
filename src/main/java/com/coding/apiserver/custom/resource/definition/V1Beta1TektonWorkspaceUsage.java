package com.coding.apiserver.custom.resource.definition;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonWorkspaceUsage {

    @ApiModelProperty(value = "name", position = 0)
    private String name;

    @ApiModelProperty(value = "挂载目录", position = 1)
    private String mountPath;

}
