package com.coding.apiserver.custom.resource.definition;

import io.kubernetes.client.openapi.models.V1Volume;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(description = "TektonTaskSpec")
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2022-08-30T16:45:00.555Z[Etc/UTC]")
public class V1Beta1TektonTaskSpec {



    private String description;

    private List<V1Beta1TektonTaskParam> params;

    private List<V1Beta1TektonResult> results;

    private List<V1Beta1TektonTaskWorkspace> workspaces;

    private V1Beta1TektonStepTemplate stepTemplate;

    private List<V1Beta1TektonStep> steps;

    private List<V1Beta1TektonTaskSpec> sidecars;

    private List<V1Volume> volumes;


}
