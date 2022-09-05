package com.coding.apiserver.custom.resource.definition;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResolverRef {

    private String resolverName;

    private List<V1Beta1TektonRunParam> params;


}
