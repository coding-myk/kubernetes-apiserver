package com.coding.apiserver.controller;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.coding.apiserver.custom.resource.definition.*;
import com.coding.apiserver.models.enums.EnumCustomResource;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;
import io.kubernetes.client.openapi.models.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

@RestController
public class K8sApiTestController {


    @Autowired
    private ApiClient apiClient;



    @Autowired
    @Qualifier("jsonObjectMapper")
    private ObjectMapper jsonObjectMapper;

    @Autowired
    @Qualifier("yamlObjectMapper")
    private ObjectMapper yamlObjectMapper;



    @GetMapping("/test")
    public String test() throws ApiException, IOException {

        //查询Pod
        CoreV1Api coreV1Api = new CoreV1Api(apiClient);

        //创建个PVC
//        createPvc(coreV1Api,"tekton-pvc-test");
        //创建task
//        createTektonTask();
//        //创建task run
//        createTektonTaskRun();

        createGitCloneTask();
        createGitCloneTaskRun();


        return yamlObjectMapper.writeValueAsString("hello");

    }


    public void createGitCloneTaskRun() throws JsonProcessingException, ApiException {
        V1Beta1TektonTaskRun taskRun = V1Beta1TektonTaskRun.builder()
                .apiVersion("tekton.dev/v1beta1")
                .kind("TaskRun")
                .metadata(new V1ObjectMeta().name("git-clone-test"))
                .spec(V1Beta1TektonTaskRunSpec.builder()
                        .taskRef(V1Beta1TektonTaskRunSpec.TaskRef.builder().name("git-clone").build())
                        .params(new ArrayList<>(){{add(V1Beta1TektonTaskRunParam.builder()
                                .name("url")
                                .value("https://github.com/coding-myk/kubernetes-apiserver.git")
                                .build());}})
                        .workspaces(new ArrayList<>() {{add(V1Beta1TektonTaskRunOrPipelineRunWorkspace.builder()
                                .persistentVolumeClaim(V1Beta1TektonTaskRunOrPipelineRunWorkspace.PersistentVolumeClaim.builder().claimName("tekton-pvc-test").build())
                                .name("coding")
                                .build()); }})
                        .build())
                .build();

        System.out.println(yamlObjectMapper.writeValueAsString(taskRun));
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        Object result = customObjectsApi.createNamespacedCustomObject(EnumCustomResource.TEKTON_TASK_RUN.getGroup() ,EnumCustomResource.TEKTON_TASK_RUN.getVersion(),
                "test", EnumCustomResource.TEKTON_TASK_RUN.getPlural(),taskRun,null,null,null);

    }

    public void createGitCloneTask() throws JsonProcessingException, ApiException {

        V1Beta1TektonTask task = V1Beta1TektonTask.builder()
                .apiVersion("tekton.dev/v1beta1")
                .kind("Task")
                .metadata(new V1ObjectMeta().name("git-clone"))
                .spec(V1Beta1TektonTaskSpec.builder()
                        .steps(new ArrayList<>() {{
                            add(V1Beta1TektonStep.builder()
                                    .name("git-clone")
                                    .image("docker.io/alpine/git:v2.26.2")
                                    .script("""
                                            #!/usr/bin/env sh
                                            set -eu
                                            git clone $(params.url)
                                            """)
                                    .workingDir("/coding/repository")
                                    .build());
                        }})
                        .workspaces(new ArrayList<>() {{add(V1Beta1TektonTaskWorkspace.builder()
                                .name("coding")
                                .description("代码存放目录")
                                .mountPath("/coding")
                                .build());}})
                        .params(new ArrayList<>() {{add(V1Beta1TektonTaskParam.builder()
                                .name("url")
                                .type("string")
                                .defaultValue("https://github.com/coding-myk/kubernetes-apiserver.git")
                                .build());}})
                        .build())
                .build();



        System.out.println(yamlObjectMapper.writeValueAsString(task));
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        Object result = customObjectsApi.createNamespacedCustomObject(EnumCustomResource.TEKTON_TASK.getGroup() ,EnumCustomResource.TEKTON_TASK.getVersion(),
                "test", EnumCustomResource.TEKTON_TASK.getPlural(),task,null,null,null);
    }


    public void createTektonTask() throws ApiException, JsonProcessingException {

        V1Beta1TektonTask task1 = V1Beta1TektonTask.builder()
                .apiVersion("tekton.dev/v1beta1")
                .kind("Task")
                .metadata(new V1ObjectMeta().name("pvctest"))
                .spec(V1Beta1TektonTaskSpec.builder()
                        .description("测试task 的 PVC")
                        .steps(new ArrayList<>() {{
                            add(V1Beta1TektonStep.builder()
                                    .name("pvcstep")
                                    .image("bitnami/centos-base-buildpack:latest")
                                    .script("""
                                            #!/bin/bash
                                            echo "hello world" > /data/test.txt
                                            """)
                                    .build());
                        }})
                        .workspaces(new ArrayList<>() {{
                            add(V1Beta1TektonTaskWorkspace.builder()
                                    .description("测试pvc workspace")
                                    .name("workspacepvctest")
                                    .mountPath("/data")
                                    .build());
                        }})
                        .build())
                .build();

        System.out.println(yamlObjectMapper.writeValueAsString(task1));
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        Object result = customObjectsApi.createNamespacedCustomObject(EnumCustomResource.TEKTON_TASK.getGroup() ,EnumCustomResource.TEKTON_TASK.getVersion(),
                "test", EnumCustomResource.TEKTON_TASK.getPlural(),task1,null,null,null);

    }



    public void createTektonTaskRun() throws JsonProcessingException, ApiException {

        V1Beta1TektonTaskRun taskRun = V1Beta1TektonTaskRun.builder()
                .apiVersion("tekton.dev/v1beta1")
                .kind("TaskRun")
                .metadata(new V1ObjectMeta().name("pvctesttaskrun"))
                .spec(V1Beta1TektonTaskRunSpec.builder()
                        .taskRef(V1Beta1TektonTaskRunSpec.TaskRef.builder()
                                .name("pvctest")
                                .build())
                        .workspaces(Collections.singletonList(V1Beta1TektonTaskRunOrPipelineRunWorkspace.builder()
//                                .volumeClaimTemplate(V1Beta1TektonTaskRunOrPipelineRunWorkspace.VolumeClaimTemplate.builder()
//                                        .spec(new V1PersistentVolumeClaimSpec()
//                                                .storageClassName("nfs-client")
//                                                .accessModes(new ArrayList<>(){{add("ReadWriteOnce");}})
//                                                .resources(new V1ResourceRequirements().requests(new HashMap<>() {{put("storage",new Quantity("1Gi"));}})))
//                                        .build())
                                .persistentVolumeClaim(V1Beta1TektonTaskRunOrPipelineRunWorkspace.PersistentVolumeClaim.builder()
                                        .claimName("tekton-pvc-test").build())
                                .name("workspacepvctest")
                                .build()))
                        .build())
                .build();

        System.out.println(yamlObjectMapper.writeValueAsString(taskRun));
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        customObjectsApi.createNamespacedCustomObject(EnumCustomResource.TEKTON_TASK_RUN.getGroup(), EnumCustomResource.TEKTON_TASK_RUN.getVersion(),
                "test", EnumCustomResource.TEKTON_TASK_RUN.getPlural(),taskRun,null,null,null);
    }

    public void getPod(CoreV1Api coreV1Api) throws ApiException {
        V1Pod pod = coreV1Api.readNamespacedPod("mysql-0","test",null);
        pod.getSpec().getContainers().get(0).setLifecycle(new V1Lifecycle().postStart(new V1LifecycleHandler().httpGet(new V1HTTPGetAction().port(new IntOrString(9090)))));
        FastJsonConfig fastJsonConfig = new FastJsonConfig();
        fastJsonConfig.setSerializerFeatures(
                SerializerFeature.WriteMapNullValue,
                SerializerFeature.DisableCircularReferenceDetect);
        SerializeConfig serializationConfig = fastJsonConfig.getSerializeConfig();
        serializationConfig.put(IntOrString.class, (serializer, object, fieldName, fieldType, features) -> {
            IntOrString intOrString = (IntOrString) object;
            if (intOrString.isInteger()) {
                serializer.out.writeString("{\"intValue\": " + intOrString.getIntValue() + ",\"isInt\":true,\"strValue\":\"\"}");
            }else {
                serializer.out.writeString("{\"intValue\": "+null+",\"isInt\":false,\"strValue\": \"" + intOrString.getStrValue() +"\"}");
            }
        });
        System.out.println(JSONObject.toJSONString(pod.getSpec().getContainers().get(0).getLifecycle(),  SerializerFeature.WRITE_MAP_NULL_FEATURES,SerializerFeature.DisableCircularReferenceDetect));
    }

    public void createLimitRange(CoreV1Api coreV1Api) throws ApiException {


        V1LimitRange limitRange = new V1LimitRange();

        limitRange.setApiVersion("v1");
        limitRange.setKind("LimitRange");
        limitRange.setMetadata(new V1ObjectMeta().name("testlimit").namespace("limit"));

        V1LimitRangeItem limitsItem  = new V1LimitRangeItem();
        limitsItem.setMax(new HashMap<String, Quantity>(){{

            put("cpu",new Quantity("500m"));
            put("memory",new Quantity("512Mi"));

        }});
        limitsItem.setType("Container");

        limitRange.setSpec(new V1LimitRangeSpec().addLimitsItem(limitsItem));

        coreV1Api.createNamespacedLimitRange("limit",limitRange,null,null,null,null);



    }

    public void createPvc(CoreV1Api coreV1Api,String pvcName) throws ApiException {

        V1PersistentVolumeClaim persistentVolumeClaim = new V1PersistentVolumeClaim()
        .apiVersion("v1")
        .kind("PersistentVolumeClaim")
        .metadata(new V1ObjectMeta().name(pvcName))
        .spec(new V1PersistentVolumeClaimSpec().storageClassName("nfs-client")
                .accessModes(new ArrayList<>(){{add("ReadWriteMany");}})
                .resources(new V1ResourceRequirements().limits(new HashMap<>() {{
                    put("storage",new Quantity("1Gi"));
                }}).requests(new HashMap<>() {{
                    put("storage",new Quantity("1Gi"));
                        }})));

        coreV1Api.createNamespacedPersistentVolumeClaim("test",persistentVolumeClaim,null,null,null,null);

    }


    

}
