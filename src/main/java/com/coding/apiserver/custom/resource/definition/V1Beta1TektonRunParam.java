package com.coding.apiserver.custom.resource.definition;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class V1Beta1TektonRunParam<T> {

    private String name;

    private T value;

}
