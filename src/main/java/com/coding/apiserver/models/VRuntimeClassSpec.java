/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.16
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.coding.apiserver.models;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are required to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as any other components that need to understand how the pod will be run. The RuntimeClassSpec is immutable.
 */
@ApiModel(description = "RuntimeClassSpec is a specification of a RuntimeClass. It contains parameters that are required to describe the RuntimeClass to the Container Runtime Interface (CRI) implementation, as well as any other components that need to understand how the pod will be run. The RuntimeClassSpec is immutable.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VRuntimeClassSpec {
  public static final String SERIALIZED_NAME_OVERHEAD = "overhead";
  @SerializedName(SERIALIZED_NAME_OVERHEAD)
  private VOverhead overhead;

  public static final String SERIALIZED_NAME_RUNTIME_HANDLER = "runtimeHandler";
  @SerializedName(SERIALIZED_NAME_RUNTIME_HANDLER)
  private String runtimeHandler;

  public static final String SERIALIZED_NAME_SCHEDULING = "scheduling";
  @SerializedName(SERIALIZED_NAME_SCHEDULING)
  private VScheduling scheduling;


  public VRuntimeClassSpec overhead(VOverhead overhead) {

    this.overhead = overhead;
    return this;
  }

   /**
   * Get overhead
   * @return overhead
  **/

  @ApiModelProperty(value = "")

  public VOverhead getOverhead() {
    return overhead;
  }


  public void setOverhead(VOverhead overhead) {
    this.overhead = overhead;
  }


  public VRuntimeClassSpec runtimeHandler(String runtimeHandler) {

    this.runtimeHandler = runtimeHandler;
    return this;
  }

   /**
   * RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node &amp; CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called \&quot;runc\&quot; might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.
   * @return runtimeHandler
  **/
  @ApiModelProperty(required = true, value = "RuntimeHandler specifies the underlying runtime and configuration that the CRI implementation will use to handle pods of this class. The possible values are specific to the node & CRI configuration.  It is assumed that all handlers are available on every node, and handlers of the same name are equivalent on every node. For example, a handler called \"runc\" might specify that the runc OCI runtime (using native Linux containers) will be used to run the containers in a pod. The RuntimeHandler must conform to the DNS Label (RFC 1123) requirements and is immutable.")

  public String getRuntimeHandler() {
    return runtimeHandler;
  }


  public void setRuntimeHandler(String runtimeHandler) {
    this.runtimeHandler = runtimeHandler;
  }


  public VRuntimeClassSpec scheduling(VScheduling scheduling) {

    this.scheduling = scheduling;
    return this;
  }

   /**
   * Get scheduling
   * @return scheduling
  **/

  @ApiModelProperty(value = "")

  public VScheduling getScheduling() {
    return scheduling;
  }


  public void setScheduling(VScheduling scheduling) {
    this.scheduling = scheduling;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VRuntimeClassSpec v1alpha1RuntimeClassSpec = (VRuntimeClassSpec) o;
    return Objects.equals(this.overhead, v1alpha1RuntimeClassSpec.overhead) &&
        Objects.equals(this.runtimeHandler, v1alpha1RuntimeClassSpec.runtimeHandler) &&
        Objects.equals(this.scheduling, v1alpha1RuntimeClassSpec.scheduling);
  }

  @Override
  public int hashCode() {
    return Objects.hash(overhead, runtimeHandler, scheduling);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1RuntimeClassSpec {\n");
    sb.append("    overhead: ").append(toIndentedString(overhead)).append("\n");
    sb.append("    runtimeHandler: ").append(toIndentedString(runtimeHandler)).append("\n");
    sb.append("    scheduling: ").append(toIndentedString(scheduling)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}
