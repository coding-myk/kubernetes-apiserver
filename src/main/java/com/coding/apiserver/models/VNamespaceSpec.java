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

import java.util.ArrayList;
import java.util.List;

/**
 * NamespaceSpec describes the attributes on a Namespace.
 */
@ApiModel(description = "NamespaceSpec describes the attributes on a Namespace.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VNamespaceSpec {
  public static final String SERIALIZED_NAME_FINALIZERS = "finalizers";
  @SerializedName(SERIALIZED_NAME_FINALIZERS)
  private List<String> finalizers = null;


  public VNamespaceSpec finalizers(List<String> finalizers) {

    this.finalizers = finalizers;
    return this;
  }

  public VNamespaceSpec addFinalizersItem(String finalizersItem) {
    if (this.finalizers == null) {
      this.finalizers = new ArrayList<String>();
    }
    this.finalizers.add(finalizersItem);
    return this;
  }

   /**
   * Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/
   * @return finalizers
  **/

  @ApiModelProperty(value = "Finalizers is an opaque list of values that must be empty to permanently remove object from storage. More info: https://kubernetes.io/docs/tasks/administer-cluster/namespaces/")

  public List<String> getFinalizers() {
    return finalizers;
  }


  public void setFinalizers(List<String> finalizers) {
    this.finalizers = finalizers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VNamespaceSpec v1NamespaceSpec = (VNamespaceSpec) o;
    return Objects.equals(this.finalizers, v1NamespaceSpec.finalizers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(finalizers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NamespaceSpec {\n");
    sb.append("    finalizers: ").append(toIndentedString(finalizers)).append("\n");
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

