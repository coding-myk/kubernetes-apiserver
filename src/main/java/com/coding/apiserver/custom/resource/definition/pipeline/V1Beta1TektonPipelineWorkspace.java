package com.coding.apiserver.custom.resource.definition.pipeline;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonPipelineWorkspace {


    private String name;

    private String description;

    private boolean optional;

}
