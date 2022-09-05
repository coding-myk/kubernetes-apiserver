package com.coding.apiserver.custom.resource.definition.task;

import com.coding.apiserver.custom.resource.definition.V1Beta1TektonStep;
import com.coding.apiserver.custom.resource.definition.V1Beta1TektonStepTemplate;
import com.coding.apiserver.custom.resource.definition.V1Beta1TektonParam;
import com.coding.apiserver.custom.resource.definition.V1Beta1TektonWorkSpaceDeclaration;
import io.kubernetes.client.openapi.models.V1Volume;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonTaskSpec {



    private String description;

    private List<V1Beta1TektonParam> params;

    private List<V1Beta1TektonTaskResult> results;

    private List<V1Beta1TektonWorkSpaceDeclaration> workspaces;

    private V1Beta1TektonStepTemplate stepTemplate;

    private List<V1Beta1TektonStep> steps;

    private List<V1Beta1TektonTaskSpec> sidecars;

    private List<V1Volume> volumes;


}
