package com.coding.apiserver.custom.resource.definition;

import io.kubernetes.client.openapi.models.V1ObjectMeta;
import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(
        description =
                "Tekton 实体类")
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2022-08-30T16:45:00.555Z[Etc/UTC]")
public class V1Beta1TektonTask implements io.kubernetes.client.common.KubernetesObject{

    private String apiVersion;
    private String kind;
    private V1ObjectMeta metadata;

    private V1Beta1TektonTaskSpec spec;



    @Override
    public V1ObjectMeta getMetadata() {
        return metadata;
    }

    @Override
    public String getApiVersion() {
        return apiVersion;
    }

    @Override
    public String getKind() {
        return kind;
    }
}
