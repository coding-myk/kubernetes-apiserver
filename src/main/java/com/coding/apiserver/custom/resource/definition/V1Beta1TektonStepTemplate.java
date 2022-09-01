package com.coding.apiserver.custom.resource.definition;

import io.kubernetes.client.openapi.models.V1EnvVar;
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
@ApiModel(description = "TektonTaskSpec TektonStepTemplate")
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2022-08-30T16:45:00.555Z[Etc/UTC]")
public class V1Beta1TektonStepTemplate {

    private List<V1EnvVar> env;

}
