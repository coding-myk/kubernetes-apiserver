package com.coding.apiserver.controller;

import com.coding.apiserver.custom.resource.definition.task.V1Beta1TektonTask;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {


    @GetMapping("/task")
    public void task (@RequestBody V1Beta1TektonTask task) {
        System.out.println(1);
    }

}
