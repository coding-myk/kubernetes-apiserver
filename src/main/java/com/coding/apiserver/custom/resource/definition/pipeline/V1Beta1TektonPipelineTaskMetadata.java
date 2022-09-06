package com.coding.apiserver.custom.resource.definition.pipeline;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonPipelineTaskMetadata {

    private Map<String, String> annotations;

    private Map<String, String> labels;

}
