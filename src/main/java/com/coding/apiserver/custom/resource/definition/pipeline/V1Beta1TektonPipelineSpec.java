package com.coding.apiserver.custom.resource.definition.pipeline;


import com.coding.apiserver.custom.resource.definition.V1Beta1TektonParamSpec;
import com.google.gson.annotations.SerializedName;
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
public class V1Beta1TektonPipelineSpec {

    @ApiModelProperty(value = "pipeline 描述", position = 0)
    private String description;


    @ApiModelProperty(value = "pipeline 中的 task", position = 1)
    private List<V1Beta1TektonPipelineTask> tasks;

    @ApiModelProperty(value = "声明了运行此管道时必须提供的输入参数列表", position = 2)
    private List<V1Beta1TektonParamSpec<?>> params;

    private List<V1Beta1TektonPipelineWorkspaceDeclaration> workspaces;

    private List<V1Beta1TektonPipelineResult<?>> results;

    @SerializedName("finally")
    private List<V1Beta1TektonPipelineTask> finallyTask;


}
