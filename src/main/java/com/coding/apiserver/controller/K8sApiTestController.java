package com.coding.apiserver.controller;


import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONSerializer;
import com.alibaba.fastjson.serializer.ObjectSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.coding.apiserver.custom.resource.definition.*;
import com.coding.apiserver.models.VContainer;
import com.coding.apiserver.models.VPod;
import com.coding.apiserver.models.enums.EnumCustomResource;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;
import com.fasterxml.jackson.databind.ser.SerializerFactory;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.custom.IntOrString;
import io.kubernetes.client.custom.Quantity;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.AppsV1Api;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.apis.CustomObjectsApi;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.proto.V1;
import io.kubernetes.client.util.Yaml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.YamlMapFactoryBean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;

@RestController
public class K8sApiTestController {


    @Autowired
    private ApiClient apiClient;


//
//    @Autowired
//    @Qualifier("jsonObjectMapper")
//    private ObjectMapper jsonObjectMapper;

    @Autowired
    @Qualifier("yamlObjectMapper")
    private ObjectMapper yamlObjectMapper;

    @Autowired
    private ObjectMapper objectMapper;


    private String sendScript = """
            #!/usr/bin/env python3
            import smtplib, ssl, os
            port = os.getenv('PORT')
            smtp_server = os.getenv('SERVER')
            sender_email = "$(params.sender)"
            receiver_emails = "$(params.recipients)"
            user = os.getenv('USER')
            password = os.getenv('PASSWORD')
            tls = os.getenv('TLS')
            message = f""\"\\
            Subject: $(params.subject)
            To: {receiver_emails}
            From: {sender_email}

            $(params.body)""\"
            print(message)
            if tls == 'True':
                context = ssl.create_default_context()
                server = smtplib.SMTP_SSL(smtp_server, port, context=context)
            else:
                server = smtplib.SMTP(smtp_server, port)
            if password != '':
                server.login(user, password)
            for receiver in [item for item in receiver_emails.split(' ') if item]:
                server.sendmail(sender_email, receiver, message.encode('utf-8'))
            server.quit()""";

    @GetMapping("/test")
    public String test() throws ApiException, IOException {



        //查询Pod
        CoreV1Api coreV1Api = new CoreV1Api(apiClient);
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




//        System.out.println(JSONObject.toJSONString(pod.getSpec().getContainers().get(0).getLifecycle(),  SerializerFeature.WRITE_MAP_NULL_FEATURES,SerializerFeature.DisableCircularReferenceDetect));

/****************************************** pvc **********************************************/
//        V1PersistentVolumeClaim persistentVolumeClaim = new V1PersistentVolumeClaim()
//                .apiVersion("v1")
//                .kind("PersistentVolumeClaim")
//                .metadata(new V1ObjectMeta().name("tekton-pvc-test"))
//                .spec(new V1PersistentVolumeClaimSpec().storageClassName("nfs-client")
//                        .accessModes(new ArrayList<>(){{add("ReadWriteMany");}})
//                        .resources(new V1ResourceRequirements().limits(new HashMap<>() {{
//                            put("storage",new Quantity("1Gi"));
//                        }}).requests(new HashMap<>() {{
//                            put("storage",new Quantity("1Gi"));
//                                }})));
//
//
//
//        coreV1Api.createNamespacedPersistentVolumeClaim("test",persistentVolumeClaim,null,null,null,null);

/****************************************** pvc **********************************************/


//        V1Beta1TektonTask task = V1Beta1TektonTask.builder().apiVersion("tekton.dev/v1beta1")
//                .kind("Task")
//                .metadata(new V1ObjectMeta()
//                        .name("sendmail")
//                        .labels(new HashMap<>() {{put("app.kubernetes.io/version", "0.1");}})
//                        .annotations(new HashMap<>(){{
//                            put("tekton.dev/pipelines.minVersion", "0.12.1");
//                            put("tekton.dev/categories","Messaging");
//                            put("tekton.dev/tags", "mail");
//                            put("tekton.dev/displayName","send mail");
//                            put("tekton.dev/platforms","linux/amd64,linux/s390x,linux/ppc64le,linux/arm64");
//                        }}))
//                .spec(V1Beta1TektonTaskSpec.builder()
//                        .description("""
//                                >-
//                                    This task sends a simple email to receivers via SMTP server
//                                """)
//                        .params(new ArrayList<>() {{
//                            add(V1Beta1TektonParam.builder()
//                                    .name("server")
//                                    .type("string")
//                                    .description("secret name for SMTP server information (url, port, password)")
//                                    .build());
//                            add(V1Beta1TektonParam.builder()
//                                    .name("subject")
//                                    .type("string")
//                                    .description("plain text email subject")
//                                    .build());
//                            add(V1Beta1TektonParam.builder()
//                                    .name("body")
//                                    .type("string")
//                                    .description("plain text email body")
//                                    .build());
//                            add(V1Beta1TektonParam.builder()
//                                    .name("sender")
//                                    .type("string")
//                                    .description("sender email address")
//                                    .build());
//                            add(V1Beta1TektonParam.builder()
//                                    .name("recipients")
//                                    .type("string")
//                                    .description("recipient email addresses (space delimited list)")
//                                    .build());
//                        }})
//                        .steps(new ArrayList<>(){{
//
//                            add(V1Beta1TektonStep.builder()
//                                    .name("send")
//                                    .image("bitnami/centos-base-buildpack:latest")
////                                    .image("docker.io/library/python:3.8-alpine@sha256:e11bbd37d4371894e954421b85dbe8dd4eb7198d7cb4ed144ab529f19f57c3f1")
//                                    .script("""
//                                      #!/bin/bash
//                                      echo "hello world" > /data/test.txt""")
//                                    .env(new ArrayList<>(){{
//                                        add(new V1EnvVar()
//                                                .name("USER")
//                                                .valueFrom(new V1EnvVarSource().secretKeyRef(new V1SecretKeySelector().key("user").name("$(params.server)")))
//                                        );
//                                        add(new V1EnvVar()
//                                                .name("PASSWORD")
//                                                .valueFrom(new V1EnvVarSource().secretKeyRef(new V1SecretKeySelector().key("password").name("$(params.server)")))
//                                        );
//
//                                        add(new V1EnvVar()
//                                                .name("TLS")
//                                                .valueFrom(new V1EnvVarSource().secretKeyRef(new V1SecretKeySelector().key("tls").name("$(params.server)")))
//                                        );
//
//                                        add(new V1EnvVar()
//                                                .name("SERVER")
//                                                .valueFrom(new V1EnvVarSource().secretKeyRef(new V1SecretKeySelector().key("url").name("$(params.server)")))
//                                        );
//                                        add(new V1EnvVar()
//                                                .name("PORT")
//                                                .valueFrom(new V1EnvVarSource().secretKeyRef(new V1SecretKeySelector().key("port").name("$(params.server)")))
//                                        );
//
//                                    }})
//                                    .volumeMounts(new ArrayList<>() {{add(new V1VolumeMount().name("testpvc").mountPath("/data"));}})
//                                    .build());
//
//                        }})
//                        .volumes(new ArrayList<>(){{
//                            add(new V1Volume().name("testpvc")
//                                    .persistentVolumeClaim(new V1PersistentVolumeClaimVolumeSource().claimName("tekton-pvc-test")));
//                        }})
//                        .build())
//
//                .build();


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

        CustomObjectsApi customObjectsApi = new CustomObjectsApi(apiClient);
        Object result = customObjectsApi.createNamespacedCustomObject(EnumCustomResource.TEKTON_TASK.getGroup() ,EnumCustomResource.TEKTON_TASK.getVersion(),
                "test", EnumCustomResource.TEKTON_TASK.getPlural(),task1,null,null,null);
        System.out.println(yamlObjectMapper.writeValueAsString(result));



        V1Beta1TektonTaskRun taskRun = V1Beta1TektonTaskRun.builder()
                .apiVersion("tekton.dev/v1beta1")
                .kind("TaskRun")
                .metadata(new V1ObjectMeta().name("pvctesttaskrun"))
                .spec(V1Beta1TektonTaskRunSpec.builder()
                        .taskRef(V1Beta1TektonTaskRunSpec.TaskRef.builder()
                                .name("pvctest")
                                .build())
                        .workspaces(Collections.singletonList(V1Beta1TektonTaskRunOrPipelineRunWorkspace.builder()
                                .volumeClaimTemplate(V1Beta1TektonTaskRunOrPipelineRunWorkspace.VolumeClaimTemplate.builder()
                                        .spec(new V1PersistentVolumeClaimSpec()
                                                .storageClassName("nfs-client")
                                                .volumeName("tekton-pvc-test")
                                                .accessModes(Collections.singletonList("ReadWriteMany"))
                                                .resources(new V1ResourceRequirements().requests(new HashMap<>() {{put("storage",new Quantity("1Gi"));}})))
                                        .build())
                                .persistentVolumeClaim(V1Beta1TektonTaskRunOrPipelineRunWorkspace.PersistentVolumeClaim.builder()
                                        .claimName("tekton-pvc-test").build())
                                .name("workspacepvctest")
                                .subPath("/data")
                                .build()))
                        .build())
                .build();


        System.out.println(yamlObjectMapper.writeValueAsString(taskRun));
        customObjectsApi.createNamespacedCustomObject(EnumCustomResource.TEKTON_TASK_RUN.getGroup(), EnumCustomResource.TEKTON_TASK_RUN.getVersion(),
                "test", EnumCustomResource.TEKTON_TASK_RUN.getPlural(),taskRun,null,null,null);


/*************************************************limitrage*****************************************/
//        V1LimitRange limitRange = new V1LimitRange();
//
//        limitRange.setApiVersion("v1");
//        limitRange.setKind("LimitRange");
//        limitRange.setMetadata(new V1ObjectMeta().name("testlimit").namespace("limit"));
//
//        V1LimitRangeItem limitsItem  = new V1LimitRangeItem();
//        limitsItem.setMax(new HashMap<String, Quantity>(){{
//
//            put("cpu",new Quantity("500m"));
//            put("memory",new Quantity("512Mi"));
//
//        }});
//        limitsItem.setType("Container");
//
//        limitRange.setSpec(new V1LimitRangeSpec().addLimitsItem(limitsItem));
//
//        coreV1Api.createNamespacedLimitRange("limit",limitRange,null,null,null,null);
/*************************************************limitrage*****************************************/

//       Gson gson1 = new GsonBuilder().setPrettyPrinting()
//               .setDateFormat("yyyy-MM-dd HH:mm:ss")
//               .registerTypeAdapter(IntOrString.class, new TypeAdapter<IntOrString>() {
//
//                    @Override
//                    public void write(JsonWriter out, IntOrString value) throws IOException {
//                        if (value.isInteger()) {
//                            out.value(value.getIntValue());
//                        }else {
//                            out.value(value.getStrValue());
//                        }
//                    }
//
//                    @Override
//                    public IntOrString read(JsonReader in) throws IOException {
//                        final JsonToken nextToken = in.peek();
//                        if (nextToken == JsonToken.NUMBER) {
//                            return new IntOrString(in.nextInt());
//                        } else {
//                            return new IntOrString(in.nextString());
//                        }
//
//                    }
//                })
//               .registerTypeAdapter(com.coding.apiserver.custom.IntOrString.class, new TypeAdapter<com.coding.apiserver.custom.IntOrString>() {
//                   @Override
//                   public void write(JsonWriter out, com.coding.apiserver.custom.IntOrString value) throws IOException {
//                       if (value.isInteger()) {
//                           out.value(value.getIntValue());
//                       }else {
//                           out.value(value.getStrValue());
//                       }
//                   }
//
//                   @Override
//                   public com.coding.apiserver.custom.IntOrString read(JsonReader in) throws IOException {
//                       final JsonToken nextToken = in.peek();
//                       if (nextToken == JsonToken.NUMBER) {
//                           return new com.coding.apiserver.custom.IntOrString(in.nextInt());
//                       } else {
//                           return new com.coding.apiserver.custom.IntOrString(in.nextString());
//                       }
//                   }
//               })
//               .create();
//
//
////
////        V1Container v1Container = pod.getSpec().getContainers().get(0);
////        System.out.println(gson1.toJson(v1Container));
////
////        System.out.println("-------------------------------------------------------");
////        VContainer container = gson1.fromJson(gson1.toJson(v1Container),VContainer.class);
////        System.out.println(gson1.toJson(container));
//
//
//        System.out.println(gson1.toJson(pod));
//
//        System.out.println("----------------------------------------------------------------");
//        VPod vPod = gson1.fromJson(gson1.toJson(pod),VPod.class);
//        System.out.println(yamlObjectMapper.writeValueAsString(pod));
//        System.out.println(yamlObjectMapper.writeValueAsString(vPod));
//
//        V1Container v1Container = new V1Container();





        //查询deployment
//        AppsV1Api appsV1Api = new AppsV1Api(apiClient);
//        V1Deployment deployment = appsV1Api.readNamespacedDeployment("minio-server","test",null);
//
//        V1Container v1Container = new V1Container();
//
//        v1Container.setLifecycle(new V1Lifecycle().postStart(new V1LifecycleHandler().httpGet(new V1HTTPGetAction().port(new IntOrString(9999)))));
//
//
//        VContainer container = gson.fromJson(gson.toJson(v1Container), VContainer.class) ;
//
//
//        System.out.printf(container.toString());

//        System.out.println(gson.toJson(deployment));


//        V1Deployment v1Deployment = new V1Deployment();
//
//        v1Deployment.setApiVersion(V1Deployment.SERIALIZED_NAME_KIND);
//
//        appsV1Api.createNamespacedDeployment("test",v1Deployment,null,null,null,null);



        return yamlObjectMapper.writeValueAsString(pod);

    }



    

}
