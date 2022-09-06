package com.coding.apiserver.custom.resource.definition.pipeline;


import com.coding.apiserver.custom.resource.definition.V1Beta1TektonParam;
import com.coding.apiserver.custom.resource.definition.task.V1Beta1TektonTaskRunSpec;
import com.google.gson.annotations.SerializedName;
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

    private String description;

    private V1Beta1TektonTaskRunSpec.TaskRef taskRef;

    private List<V1Beta1TektonPipelineTask> tasks;

    private List<V1Beta1TektonParam<?>> params;

    private List<V1Beta1TektonPipelineWorkspaceDeclaration> workspaces;

    private List<V1Beta1TektonPipelineResult<?>> results;

    @SerializedName("finally")
    private List<V1Beta1TektonPipelineTask> finallyTask;


}
