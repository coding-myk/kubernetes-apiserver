package com.coding.apiserver.custom.resource.definition.pipeline;

import com.coding.apiserver.custom.resource.definition.V1Beta1TektonResolverRef;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonPipelineTaskRef {

    private String name;

    private String kind;

    private String apiVersion;

    private V1Beta1TektonResolverRef v1Beta1TektonResolverRef;

}
