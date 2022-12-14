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
 * MetricStatus describes the last-read state of a single metric.
 */
@ApiModel(description = "MetricStatus describes the last-read state of a single metric.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VMetricStatus {
  public static final String SERIALIZED_NAME_EXTERNAL = "external";
  @SerializedName(SERIALIZED_NAME_EXTERNAL)
  private VExternalMetricStatus external;

  public static final String SERIALIZED_NAME_OBJECT = "object";
  @SerializedName(SERIALIZED_NAME_OBJECT)
  private VObjectMetricStatus _object;

  public static final String SERIALIZED_NAME_PODS = "pods";
  @SerializedName(SERIALIZED_NAME_PODS)
  private VPodsMetricStatus pods;

  public static final String SERIALIZED_NAME_RESOURCE = "resource";
  @SerializedName(SERIALIZED_NAME_RESOURCE)
  private VResourceMetricStatus resource;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public VMetricStatus external(VExternalMetricStatus external) {

    this.external = external;
    return this;
  }

   /**
   * Get external
   * @return external
  **/

  @ApiModelProperty(value = "")

  public VExternalMetricStatus getExternal() {
    return external;
  }


  public void setExternal(VExternalMetricStatus external) {
    this.external = external;
  }


  public VMetricStatus _object(VObjectMetricStatus _object) {

    this._object = _object;
    return this;
  }

   /**
   * Get _object
   * @return _object
  **/

  @ApiModelProperty(value = "")

  public VObjectMetricStatus getObject() {
    return _object;
  }


  public void setObject(VObjectMetricStatus _object) {
    this._object = _object;
  }


  public VMetricStatus pods(VPodsMetricStatus pods) {

    this.pods = pods;
    return this;
  }

   /**
   * Get pods
   * @return pods
  **/

  @ApiModelProperty(value = "")

  public VPodsMetricStatus getPods() {
    return pods;
  }


  public void setPods(VPodsMetricStatus pods) {
    this.pods = pods;
  }


  public VMetricStatus resource(VResourceMetricStatus resource) {

    this.resource = resource;
    return this;
  }

   /**
   * Get resource
   * @return resource
  **/

  @ApiModelProperty(value = "")

  public VResourceMetricStatus getResource() {
    return resource;
  }


  public void setResource(VResourceMetricStatus resource) {
    this.resource = resource;
  }


  public VMetricStatus type(String type) {

    this.type = type;
    return this;
  }

   /**
   * type is the type of metric source.  It will be one of \&quot;Object\&quot;, \&quot;Pods\&quot; or \&quot;Resource\&quot;, each corresponds to a matching field in the object.
   * @return type
  **/
  @ApiModelProperty(required = true, value = "type is the type of metric source.  It will be one of \"Object\", \"Pods\" or \"Resource\", each corresponds to a matching field in the object.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMetricStatus v2beta1MetricStatus = (VMetricStatus) o;
    return Objects.equals(this.external, v2beta1MetricStatus.external) &&
        Objects.equals(this._object, v2beta1MetricStatus._object) &&
        Objects.equals(this.pods, v2beta1MetricStatus.pods) &&
        Objects.equals(this.resource, v2beta1MetricStatus.resource) &&
        Objects.equals(this.type, v2beta1MetricStatus.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(external, _object, pods, resource, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta1MetricStatus {\n");
    sb.append("    external: ").append(toIndentedString(external)).append("\n");
    sb.append("    _object: ").append(toIndentedString(_object)).append("\n");
    sb.append("    pods: ").append(toIndentedString(pods)).append("\n");
    sb.append("    resource: ").append(toIndentedString(resource)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

