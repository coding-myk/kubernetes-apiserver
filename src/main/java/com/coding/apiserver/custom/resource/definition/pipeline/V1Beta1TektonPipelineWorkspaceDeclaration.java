package com.coding.apiserver.custom.resource.definition.pipeline;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonPipelineWorkspaceDeclaration {


    private String name;

    private String description;

    private boolean optional;

}
