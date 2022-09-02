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
 * AuditSinkSpec holds the spec for the audit sink
 */
@ApiModel(description = "AuditSinkSpec holds the spec for the audit sink")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VAuditSinkSpec {
  public static final String SERIALIZED_NAME_POLICY = "policy";
  @SerializedName(SERIALIZED_NAME_POLICY)
  private VPolicy policy;

  public static final String SERIALIZED_NAME_WEBHOOK = "webhook";
  @SerializedName(SERIALIZED_NAME_WEBHOOK)
  private VWebhook webhook;


  public VAuditSinkSpec policy(VPolicy policy) {

    this.policy = policy;
    return this;
  }

   /**
   * Get policy
   * @return policy
  **/
  @ApiModelProperty(required = true, value = "")

  public VPolicy getPolicy() {
    return policy;
  }


  public void setPolicy(VPolicy policy) {
    this.policy = policy;
  }


  public VAuditSinkSpec webhook(VWebhook webhook) {

    this.webhook = webhook;
    return this;
  }

   /**
   * Get webhook
   * @return webhook
  **/
  @ApiModelProperty(required = true, value = "")

  public VWebhook getWebhook() {
    return webhook;
  }


  public void setWebhook(VWebhook webhook) {
    this.webhook = webhook;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VAuditSinkSpec v1alpha1AuditSinkSpec = (VAuditSinkSpec) o;
    return Objects.equals(this.policy, v1alpha1AuditSinkSpec.policy) &&
        Objects.equals(this.webhook, v1alpha1AuditSinkSpec.webhook);
  }

  @Override
  public int hashCode() {
    return Objects.hash(policy, webhook);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1alpha1AuditSinkSpec {\n");
    sb.append("    policy: ").append(toIndentedString(policy)).append("\n");
    sb.append("    webhook: ").append(toIndentedString(webhook)).append("\n");
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

