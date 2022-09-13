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
public class V1Beta1TektonWorkSpaceDeclaration {

    @ApiModelProperty(value = "workspace 声明 name" ,position = 1)
    private String name;

    @ApiModelProperty(value = "workspace 描述" ,position = 2)
    private String description;

    @ApiModelProperty(value = "是否只读" ,position = 3)
    private Boolean readOnly;

    @ApiModelProperty(value = "Optional 将工作区标记为在 TaskRuns 中不需要。默认情况下，此字段为 false，因此需要声明的工作空间。" ,position = 4)
    private Boolean optional;

    @ApiModelProperty(value = "挂在到step的目录" ,position = 5)
    private String mountPath;


}
