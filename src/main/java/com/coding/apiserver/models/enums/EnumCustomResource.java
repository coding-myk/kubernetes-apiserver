package com.coding.apiserver.models.enums;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EnumCustomResource {


    TEKTON_TASK("tekton.dev","v1beta1","tasks") ,
    TEKTON_TASK_RUN("tekton.dev","v1beta1","taskruns"),


    TEKTON_PIPELINE("tekton.dev","v1beta1","pipelines"),
    TEKTON_PIPELINE_RUN("tekton.dev","v1beta1","pipelineruns")
    ;

    private final String group;

    private final String version;

    private final String plural;


}
