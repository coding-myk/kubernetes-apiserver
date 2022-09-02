package com.coding.apiserver.custom.resource.definition;


import com.google.gson.annotations.SerializedName;
import io.kubernetes.client.openapi.models.*;
import io.kubernetes.client.proto.V1;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Data
@ApiModel(description = "TektonTaskSpec workspaces")
@javax.annotation.Generated(
        value = "org.openapitools.codegen.languages.JavaClientCodegen",
        date = "2022-08-30T16:45:00.555Z[Etc/UTC]")
public class V1Beta1TektonTaskWorkspace{

    private String name;

    private String description;

    private boolean readOnly;

    private boolean optional;

    private String mountPath;


}
