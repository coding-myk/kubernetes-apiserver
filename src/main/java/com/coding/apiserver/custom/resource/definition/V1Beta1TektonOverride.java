package com.coding.apiserver.custom.resource.definition;


import io.kubernetes.client.openapi.models.V1ResourceRequirements;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonOverride {

    private String name;

    private V1ResourceRequirements resources;

}
