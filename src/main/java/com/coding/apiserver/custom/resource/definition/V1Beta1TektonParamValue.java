package com.coding.apiserver.custom.resource.definition;


import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class V1Beta1TektonParamValue {

    @ApiModelProperty(value = "类型", notes = "array,object,string")
    private String type;

    private String stringVal;

    private List<String> arrayVal;

    private Map<String,String> objectVal;

}
