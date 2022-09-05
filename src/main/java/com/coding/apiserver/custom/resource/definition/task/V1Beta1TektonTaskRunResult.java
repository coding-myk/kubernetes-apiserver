package com.coding.apiserver.custom.resource.definition.task;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonTaskRunResult<T> {

    private String name;

    private String type;

    private T value;

}
