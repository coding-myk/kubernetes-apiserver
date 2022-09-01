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
 * MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object.
 */
@ApiModel(description = "MutatingWebhookConfiguration describes the configuration of and admission webhook that accept or reject and may change the object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VMutatingWebhookConfiguration {
  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private VObjectMeta metadata;

  public static final String SERIALIZED_NAME_WEBHOOKS = "webhooks";
  @SerializedName(SERIALIZED_NAME_WEBHOOKS)
  private List<VMutatingWebhook> webhooks = null;


  public VMutatingWebhookConfiguration apiVersion(String apiVersion) {

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


  public VMutatingWebhookConfiguration kind(String kind) {

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


  public VMutatingWebhookConfiguration metadata(VObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/

  @ApiModelProperty(value = "")

  public VObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(VObjectMeta metadata) {
    this.metadata = metadata;
  }


  public VMutatingWebhookConfiguration webhooks(List<VMutatingWebhook> webhooks) {

    this.webhooks = webhooks;
    return this;
  }

  public VMutatingWebhookConfiguration addWebhooksItem(VMutatingWebhook webhooksItem) {
    if (this.webhooks == null) {
      this.webhooks = new ArrayList<VMutatingWebhook>();
    }
    this.webhooks.add(webhooksItem);
    return this;
  }

   /**
   * Webhooks is a list of webhooks and the affected resources and operations.
   * @return webhooks
  **/

  @ApiModelProperty(value = "Webhooks is a list of webhooks and the affected resources and operations.")

  public List<VMutatingWebhook> getWebhooks() {
    return webhooks;
  }


  public void setWebhooks(List<VMutatingWebhook> webhooks) {
    this.webhooks = webhooks;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VMutatingWebhookConfiguration v1MutatingWebhookConfiguration = (VMutatingWebhookConfiguration) o;
    return Objects.equals(this.apiVersion, v1MutatingWebhookConfiguration.apiVersion) &&
        Objects.equals(this.kind, v1MutatingWebhookConfiguration.kind) &&
        Objects.equals(this.metadata, v1MutatingWebhookConfiguration.metadata) &&
        Objects.equals(this.webhooks, v1MutatingWebhookConfiguration.webhooks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, kind, metadata, webhooks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1MutatingWebhookConfiguration {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    webhooks: ").append(toIndentedString(webhooks)).append("\n");
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

