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

    @ApiModelProperty(value = "声明了运行此pipeline时必须提供的输入参数列表", position = 2)
    private List<V1Beta1TektonParamSpec<?>> params;

    @ApiModelProperty(value = "声明了一组命名的工作空间，这些工作空间预计将由 PipelineRun 提供", position = 3)
    private List<V1Beta1TektonPipelineWorkspaceDeclaration> workspaces;

    @ApiModelProperty(value = "pipeline 输出列表", position = 4)
    private List<V1Beta1TektonPipelineResult<?>> results;

    @ApiModelProperty(value = "pipeline结束后运行的人物列表")
    @SerializedName("finally")
    private List<V1Beta1TektonPipelineTask> finallyTask;


}
