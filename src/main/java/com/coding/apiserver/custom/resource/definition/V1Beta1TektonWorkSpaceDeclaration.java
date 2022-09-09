package com.coding.apiserver.custom.resource.definition;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
public class V1Beta1TektonWorkSpaceDeclaration {

    private String name;

    private String description;

    private Boolean readOnly;

    private Boolean optional;

    private String mountPath;


}
