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
import org.joda.time.DateTime;

/**
 * PodCondition contains details for the current condition of this pod.
 */
@ApiModel(description = "PodCondition contains details for the current condition of this pod.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VPodCondition {
  public static final String SERIALIZED_NAME_LAST_PROBE_TIME = "lastProbeTime";
  @SerializedName(SERIALIZED_NAME_LAST_PROBE_TIME)
  private DateTime lastProbeTime;

  public static final String SERIALIZED_NAME_LAST_TRANSITION_TIME = "lastTransitionTime";
  @SerializedName(SERIALIZED_NAME_LAST_TRANSITION_TIME)
  private DateTime lastTransitionTime;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;


  public VPodCondition lastProbeTime(DateTime lastProbeTime) {

    this.lastProbeTime = lastProbeTime;
    return this;
  }

   /**
   * Last time we probed the condition.
   * @return lastProbeTime
  **/

  @ApiModelProperty(value = "Last time we probed the condition.")

  public DateTime getLastProbeTime() {
    return lastProbeTime;
  }


  public void setLastProbeTime(DateTime lastProbeTime) {
    this.lastProbeTime = lastProbeTime;
  }


  public VPodCondition lastTransitionTime(DateTime lastTransitionTime) {

    this.lastTransitionTime = lastTransitionTime;
    return this;
  }

   /**
   * Last time the condition transitioned from one status to another.
   * @return lastTransitionTime
  **/

  @ApiModelProperty(value = "Last time the condition transitioned from one status to another.")

  public DateTime getLastTransitionTime() {
    return lastTransitionTime;
  }


  public void setLastTransitionTime(DateTime lastTransitionTime) {
    this.lastTransitionTime = lastTransitionTime;
  }


  public VPodCondition message(String message) {

    this.message = message;
    return this;
  }

   /**
   * Human-readable message indicating details about last transition.
   * @return message
  **/

  @ApiModelProperty(value = "Human-readable message indicating details about last transition.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public VPodCondition reason(String reason) {

    this.reason = reason;
    return this;
  }

   /**
   * Unique, one-word, CamelCase reason for the condition&#39;s last transition.
   * @return reason
  **/

  @ApiModelProperty(value = "Unique, one-word, CamelCase reason for the condition's last transition.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public VPodCondition status(String status) {

    this.status = status;
    return this;
  }

   /**
   * Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   * @return status
  **/
  @ApiModelProperty(required = true, value = "Status is the status of the condition. Can be True, False, Unknown. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public VPodCondition type(String type) {

    this.type = type;
    return this;
  }

   /**
   * Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   * @return type
  **/
  @ApiModelProperty(required = true, value = "Type is the type of the condition. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")

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
    VPodCondition v1PodCondition = (VPodCondition) o;
    return Objects.equals(this.lastProbeTime, v1PodCondition.lastProbeTime) &&
        Objects.equals(this.lastTransitionTime, v1PodCondition.lastTransitionTime) &&
        Objects.equals(this.message, v1PodCondition.message) &&
        Objects.equals(this.reason, v1PodCondition.reason) &&
        Objects.equals(this.status, v1PodCondition.status) &&
        Objects.equals(this.type, v1PodCondition.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lastProbeTime, lastTransitionTime, message, reason, status, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodCondition {\n");
    sb.append("    lastProbeTime: ").append(toIndentedString(lastProbeTime)).append("\n");
    sb.append("    lastTransitionTime: ").append(toIndentedString(lastTransitionTime)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

