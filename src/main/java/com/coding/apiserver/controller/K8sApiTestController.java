package com.coding.apiserver.controller;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.coding.apiserver.custom.resource.definition.*;
import com.coding.apiserver.custom.resource.definition.pipeline.*;
import com.coding.apiserver.custom.resource.definition.task.*;
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
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.StandardCharsets;
import java.time.LocalDateTime;
import java.util.*;
import java.util.stream.Stream;

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


    private static String mavensetting = """
            <?xml version="1.0" encoding="UTF-8"?>
            <settings xmlns="http://maven.apache.org/SETTINGS/1.0.0"
                      xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
                      xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.0.0 http://maven.apache.org/xsd/settings-1.0.0.xsd">  
              <localRepository>/workspace/source/maven/repository</localRepository>
              <profiles>
                <profile>
                  <id>alimaven</id>
                  <repositories>
                    <repository>
                    <id>central</id>
                    <url>https://maven.aliyun.com/repository/public</url>
                    <releases>
                      <enabled>true</enabled>
                    </releases>
                    <snapshots>
                      <enabled>true</enabled>
                    </snapshots>
                    </repository>
                  </repositories>
                  <pluginRepositories>
                    <pluginRepository>
                      <id>central</id>
                      <url>https://maven.aliyun.com/repository/public</url>
                      <releases>
                        <enabled>true</enabled>
                      </releases>
                      <snapshots>
                        <enabled>true</enabled>
                      </snapshots>
                    </pluginRepository>
                  </pluginRepositories>
                </profile>
              </profiles>
                <activeProfiles>
                       <activeProfile>alimaven</activeProfile>
                </activeProfiles>
            </settings>""";


    @GetMapping("/test")
    public String test() throws ApiException, IOException, InvocationTargetException, NoSuchMethodException, IllegalAccessException {

        //查询Pod
        CoreV1Api coreV1Api = new CoreV1Api(apiClient);


        //创建个PVC
//        createPvc(coreV1Api,"tekton-pvc-test");
        //创建task
//        createTektonTask();
//        //创建task run
//        createTektonTaskRun();

//        createGitCloneTask();
//        createGitCloneTaskRun();
//
//        //创建maven settings
//        createMavenSettingConfigMap(apiClient);
//
//        createBuildPackagePipeline(apiClient);
//
        createBuildPackagePipelineRun(apiClient);




        return yamlObjectMapper.writeValueAsString("hello");

    }

    public void createBuildPackagePipelineRun (ApiClient apiClient) throws JsonProcessingException, ApiException {

        V1Beta1TektonPipelineRun pipelineRun = V1Beta1TektonPipelineRun.builder()
                .apiVersion("tekton.dev/v1beta1")
                .kind("PipelineRuns")
                .metadata(new V1ObjectMeta().name("devops" + System.currentTimeMillis()))
                .spec(V1Beta1TektonPipelineRunSpec.builder()
                        .pipelineRef(V1Beta1TektonPipelineRunSpec.PipelineRef.builder().name("test-pipeline").build())
                        .podTemplate(V1Beta1TektonPodTemplate.builder()
                                .nodeSelector(new HashMap<>() {{ put("coding","myk"); }})
                                .build())

                        .workspaces(new ArrayList<>() {{

                            add(V1Beta1TektonWorkspaceBinding.builder()
                                    .name("maven-settings")
                                    .configMap(new V1ConfigMapVolumeSource().name("configmap-maven-settings"))
                                    .build());
                            add(V1Beta1TektonWorkspaceBinding.builder()
                                    .name("source")
                                    .persistentVolumeClaim(new V1PersistentVolumeClaimVolumeSource()
                                            .claimName("tekton-pvc-test"))
                                    .build());

                        }})
                        .build())

                .build();

        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        Object result = customObjectsApi.createNamespacedCustomObject(EnumCustomResource.TEKTON_PIPELINE_RUN.getGroup() ,EnumCustomResource.TEKTON_PIPELINE_RUN.getVersion(),
                "test", EnumCustomResource.TEKTON_PIPELINE_RUN.getPlural(),pipelineRun,null,null,null);
        System.out.println(yamlObjectMapper.writeValueAsString(result));
    }

    public void createBuildPackagePipeline(ApiClient apiClient) throws ApiException, JsonProcessingException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {

        V1Beta1TektonPipeline pipeline = V1Beta1TektonPipeline.builder()
                .apiVersion("tekton.dev/v1beta1")
                .kind("Pipeline")
                .metadata(new V1ObjectMeta().name("test-pipeline"))
                .spec(V1Beta1TektonPipelineSpec.builder()
                        .workspaces(new ArrayList<>() {{
                            add(V1Beta1TektonPipelineWorkspaceDeclaration.builder()
                                    .name("maven-settings")
                                    .build());
                            add(V1Beta1TektonPipelineWorkspaceDeclaration.builder()
                                    .name("source")
                                    .build());

                        }})
                        .tasks(new ArrayList<>() {{
                            add(V1Beta1TektonPipelineTask.builder()
                                    .name("git-clone-test")
                                    .taskRef(V1Beta1TektonPipelineTaskRef.builder().name("git-clone-test").build())
                                    .workspaces(new ArrayList<>() {{
                                        add(V1Beta1TektonPipelineTask.WorkspacePipelineTaskBinding.builder()
                                                .name("source")
                                                .workspace("source")
                                                .build());
                                    }})
                                    .build());
                            add(V1Beta1TektonPipelineTask.builder()
                                    .name("maven-package")
                                    .taskRef(V1Beta1TektonPipelineTaskRef.builder()
                                            .name("maven")
                                            .build())
                                    .params(new ArrayList<>() {{
                                        add(V1Beta1TektonRunParam.<String>builder()
                                                .name("CONTEXT_DIR")
                                                .value("repository/psychology")
                                                .build());
                                        add(V1Beta1TektonRunParam.<List<String>>builder()
                                                .name("GOALS")
                                                .value(Stream.of("-DskipTests","clean","package").toList())
                                                .build());
                                    }})
                                    .workspaces(new ArrayList<>() {{
                                        add(V1Beta1TektonPipelineTask.WorkspacePipelineTaskBinding.builder()
                                                .name("maven-settings")
                                                .workspace("maven-settings")
                                                .build());
                                        add(V1Beta1TektonPipelineTask.WorkspacePipelineTaskBinding.builder()
                                                .name("source")
                                                .workspace("source")
                                                .build());
                                    }})

                                    .build());
                        }})
                        .build())
                .build();



        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);

        Object result = customObjectsApi.createNamespacedCustomObject(EnumCustomResource.TEKTON_PIPELINE.getGroup() ,EnumCustomResource.TEKTON_PIPELINE.getVersion(),
                "test", EnumCustomResource.TEKTON_PIPELINE.getPlural(),pipeline,null,null,null);
        System.out.println(yamlObjectMapper.writeValueAsString(result));
    }

    public void createMavenSettingConfigMap(ApiClient apiClient) throws ApiException, JsonProcessingException {

        CoreV1Api coreV1Api = new CoreV1Api(apiClient);

        V1ConfigMap configMap = new V1ConfigMap();
        configMap.setApiVersion("v1");
        configMap.setKind("ConfigMap");
        configMap.setMetadata(new V1ObjectMeta().name("configmap-maven-settings"));
        configMap.setBinaryData(new HashMap<>() {{
            put("settings.xml",mavensetting.getBytes(StandardCharsets.UTF_8));
        }});

        V1ConfigMap v1ConfigMap = coreV1Api.createNamespacedConfigMap("test",configMap, null,null,null,null);

        System.out.println(yamlObjectMapper.writeValueAsString(v1ConfigMap));
    }


    public void createGitCloneTaskRun() throws JsonProcessingException, ApiException {
        V1Beta1TektonTaskRun taskRun = V1Beta1TektonTaskRun.builder()
                .apiVersion("tekton.dev/v1beta1")
                .kind("TaskRun")
                .metadata(new V1ObjectMeta().name("git-clone-test"))
                .spec(V1Beta1TektonTaskRunSpec.builder()
                        .taskRef(V1Beta1TektonPipelineTaskRef.builder().name("git-clone").build())
                        .params(new ArrayList<>(){{add(V1Beta1TektonRunParam.builder()
                                .name("url")
                                .value("https://github.com/coding-myk/kubernetes-apiserver.git")
                                .build());}})
                        .workspaces(new ArrayList<>() {{add(V1Beta1TektonWorkspaceBinding.builder()
                                .persistentVolumeClaim(new V1PersistentVolumeClaimVolumeSource().claimName("tekton-pvc-test"))
                                .name("coding")
                                .build()); }})
                        .build())
                .build();

        System.out.println(yamlObjectMapper.writeValueAsString(taskRun));
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        Object result = customObjectsApi.createNamespacedCustomObject(EnumCustomResource.TEKTON_TASK_RUN.getGroup() ,EnumCustomResource.TEKTON_TASK_RUN.getVersion(),
                "test", EnumCustomResource.TEKTON_TASK_RUN.getPlural(),taskRun,null,null,null);

        System.out.println(yamlObjectMapper.writeValueAsString(result));

    }

    public void createGitCloneTask() throws JsonProcessingException, ApiException {

        V1Beta1TektonTask task = V1Beta1TektonTask.builder()
                .apiVersion("tekton.dev/v1beta1")
                .kind("Task")
                .metadata(new V1ObjectMeta().name("git-clone-test"))
                .spec(V1Beta1TektonTaskSpec.builder()
                        .workspaces(new ArrayList<>() {{add(V1Beta1TektonWorkSpaceDeclaration.builder()
                                .name("source")
                                .description("代码存放目录")
                                .build());}})
                        .steps(new ArrayList<>() {{
                            add(V1Beta1TektonStep.builder()
                                    .name("git-clone")
                                    .image("docker.io/alpine/git:v2.26.2")
                                    .script("""
                                            #!/usr/bin/env sh
                                            set -eu
                                            [[ -d psychology ]] && \
                                            cd psychology && git pull && exit 0
                                            echo $PWD > path.txt
                                            git clone $(params.url)
                                            """)
                                    .workingDir("$(workspaces.source.path)/repository")
                                    .build());
                        }})
                        .params(new ArrayList<>() {{add(V1Beta1TektonParamSpec.<String>builder()
                                .name("url")
                                .type("string")
                                .defaultValue("https://gitee.com/loita/psychology.git")
                                .build());}})
                        .build())

                .build();




        System.out.println(yamlObjectMapper.writeValueAsString(task));
        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        Object result = customObjectsApi.createNamespacedCustomObject(EnumCustomResource.TEKTON_TASK.getGroup() ,EnumCustomResource.TEKTON_TASK.getVersion(),
                "test", EnumCustomResource.TEKTON_TASK.getPlural(),task,null,null,null);

        System.out.println(yamlObjectMapper.writeValueAsString(result));
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
                                    .image("docker.io/centos:latest")
                                    .script("""
                                            #!/bin/bash
                                            echo $(workspaces.workspacepvctest.path) > /data/test.txt
                                            """)
                                    .build());
                        }})
                        .workspaces(new ArrayList<>() {{
                            add(V1Beta1TektonWorkSpaceDeclaration.builder()
                                    .description("测试pvc workspace")
                                    .name("workspacepvctest")
                                    .mountPath("/data")
                                    .build());
                        }})
                        .build())
                .build();

        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        Object result = customObjectsApi.createNamespacedCustomObject(EnumCustomResource.TEKTON_TASK.getGroup() ,EnumCustomResource.TEKTON_TASK.getVersion(),
                "test", EnumCustomResource.TEKTON_TASK.getPlural(),task1,null,null,null);

        System.out.println(yamlObjectMapper.writeValueAsString(result));

    }



    public void createTektonTaskRun() throws JsonProcessingException, ApiException {

        V1Beta1TektonTaskRun taskRun = V1Beta1TektonTaskRun.builder()
                .apiVersion("tekton.dev/v1beta1")
                .kind("TaskRun")
                .metadata(new V1ObjectMeta().name("pvctesttaskrun"))
                .spec(V1Beta1TektonTaskRunSpec.builder()
                        .taskRef(V1Beta1TektonPipelineTaskRef.builder()
                                .name("pvctest")
                                .build())
                        .workspaces(Collections.singletonList(V1Beta1TektonWorkspaceBinding.builder()
//                                .volumeClaimTemplate(V1Beta1TektonTaskRunOrPipelineRunWorkspace.VolumeClaimTemplate.builder()
//                                        .spec(new V1PersistentVolumeClaimSpec()
//                                                .storageClassName("nfs-client")
//                                                .accessModes(new ArrayList<>(){{add("ReadWriteOnce");}})
//                                                .resources(new V1ResourceRequirements().requests(new HashMap<>() {{put("storage",new Quantity("1Gi"));}})))
//                                        .build())
                                .persistentVolumeClaim(new V1PersistentVolumeClaimVolumeSource()
                                        .claimName("tekton-pvc-test"))
                                .name("workspacepvctest")
                                .build()))
                        .build())
                .build();


        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        Object obj = customObjectsApi.createNamespacedCustomObject(EnumCustomResource.TEKTON_TASK_RUN.getGroup(), EnumCustomResource.TEKTON_TASK_RUN.getVersion(),
                "test", EnumCustomResource.TEKTON_TASK_RUN.getPlural(),taskRun,null,null,null);
        System.out.println(yamlObjectMapper.writeValueAsString(obj));
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
