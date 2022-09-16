package com.coding.apiserver.controller;

import com.coding.apiserver.custom.resource.definition.pipeline.V1Beta1TektonPipeline;
import com.coding.apiserver.custom.resource.definition.pipeline.V1Beta1TektonPipelineRun;
import com.coding.apiserver.custom.resource.definition.task.V1Beta1TektonTask;
import com.coding.apiserver.custom.resource.definition.task.V1Beta1TektonTaskRun;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


    @GetMapping("/task")
    public void task (@RequestBody V1Beta1TektonTask task) {
        System.out.println(1);
    }

    @GetMapping("/taskrun")
    public void taskrun (@RequestBody V1Beta1TektonTaskRun taskRun) {
        System.out.println(1);
    }

    @GetMapping("/pipeline")
    public void pipeline (@RequestBody V1Beta1TektonPipeline pipeline) {
        System.out.println(1);
    }


    @GetMapping("/pipelineRune")
    public void pipelineRune (@RequestBody V1Beta1TektonPipelineRun pipelineRun) {
        System.out.println(1);
    }


}
