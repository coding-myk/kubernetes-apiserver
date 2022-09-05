package com.coding.apiserver.custom.resource.definition.pipeline;


import com.coding.apiserver.custom.resource.definition.V1Beta1TektonParam;
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

    private List<V1Beta1TektonPipelineWorkspace> workspaces;

    private List<V1Beta1TektonParam> params;

    private List<V1Beta1TektonPipelineTask> tasks;

    private List<V1Beta1TektonPipelineResult> results;

    @SerializedName("finally")
    private List<V1Beta1TektonPipelineTask> finallyTask;


}
