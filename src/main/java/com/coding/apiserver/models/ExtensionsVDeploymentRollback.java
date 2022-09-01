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

import java.util.HashMap;
import java.util.Map;

/**
 * DEPRECATED. DeploymentRollback stores the information required to rollback a deployment.
 */
@ApiModel(description = "DEPRECATED. DeploymentRollback stores the information required to rollback a deployment.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class ExtensionsVDeploymentRollback {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ROLLBACK_TO = "rollbackTo";
  @SerializedName(SERIALIZED_NAME_ROLLBACK_TO)
  private ExtensionsVRollbackConfig rollbackTo;

  public static final String SERIALIZED_NAME_UPDATED_ANNOTATIONS = "updatedAnnotations";
  @SerializedName(SERIALIZED_NAME_UPDATED_ANNOTATIONS)
  private Map<String, String> updatedAnnotations = null;


  public ExtensionsVDeploymentRollback apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/

  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public ExtensionsVDeploymentRollback kind(String kind) {

    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/

  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public ExtensionsVDeploymentRollback name(String name) {

    this.name = name;
    return this;
  }

   /**
   * Required: This must match the Name of a deployment.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Required: This must match the Name of a deployment.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ExtensionsVDeploymentRollback rollbackTo(ExtensionsVRollbackConfig rollbackTo) {

    this.rollbackTo = rollbackTo;
    return this;
  }

   /**
   * Get rollbackTo
   * @return rollbackTo
  **/
  @ApiModelProperty(required = true, value = "")

  public ExtensionsVRollbackConfig getRollbackTo() {
    return rollbackTo;
  }


  public void setRollbackTo(ExtensionsVRollbackConfig rollbackTo) {
    this.rollbackTo = rollbackTo;
  }


  public ExtensionsVDeploymentRollback updatedAnnotations(Map<String, String> updatedAnnotations) {

    this.updatedAnnotations = updatedAnnotations;
    return this;
  }

  public ExtensionsVDeploymentRollback putUpdatedAnnotationsItem(String key, String updatedAnnotationsItem) {
    if (this.updatedAnnotations == null) {
      this.updatedAnnotations = new HashMap<String, String>();
    }
    this.updatedAnnotations.put(key, updatedAnnotationsItem);
    return this;
  }

   /**
   * The annotations to be updated to a deployment
   * @return updatedAnnotations
  **/

  @ApiModelProperty(value = "The annotations to be updated to a deployment")

  public Map<String, String> getUpdatedAnnotations() {
    return updatedAnnotations;
  }


  public void setUpdatedAnnotations(Map<String, String> updatedAnnotations) {
    this.updatedAnnotations = updatedAnnotations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtensionsVDeploymentRollback extensionsV1beta1DeploymentRollback = (ExtensionsVDeploymentRollback) o;
    return Objects.equals(this.apiVersion, extensionsV1beta1DeploymentRollback.apiVersion) &&
        Objects.equals(this.kind, extensionsV1beta1DeploymentRollback.kind) &&
        Objects.equals(this.name, extensionsV1beta1DeploymentRollback.name) &&
        Objects.equals(this.rollbackTo, extensionsV1beta1DeploymentRollback.rollbackTo) &&
        Objects.equals(this.updatedAnnotations, extensionsV1beta1DeploymentRollback.updatedAnnotations);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, name, rollbackTo, updatedAnnotations);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtensionsV1beta1DeploymentRollback {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    rollbackTo: ").append(toIndentedString(rollbackTo)).append("\n");
    sb.append("    updatedAnnotations: ").append(toIndentedString(updatedAnnotations)).append("\n");
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

