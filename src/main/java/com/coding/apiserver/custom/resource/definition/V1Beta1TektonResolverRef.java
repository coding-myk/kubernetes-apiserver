package com.coding.apiserver.custom.resource.definition;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonResolverRef {

    @ApiModelProperty(value = "resolverName", position = 0)
    private String resolverName;

    @ApiModelProperty(value = "远程pipeline参数", position = 1)
    private List<V1Beta1TektonRunParam<?>> params;


}
