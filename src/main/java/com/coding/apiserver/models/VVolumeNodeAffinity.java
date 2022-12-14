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
 * VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.
 */
@ApiModel(description = "VolumeNodeAffinity defines constraints that limit what nodes this volume can be accessed from.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VVolumeNodeAffinity {
  public static final String SERIALIZED_NAME_REQUIRED = "required";
  @SerializedName(SERIALIZED_NAME_REQUIRED)
  private VNodeSelector required;


  public VVolumeNodeAffinity required(VNodeSelector required) {

    this.required = required;
    return this;
  }

   /**
   * Get required
   * @return required
  **/

  @ApiModelProperty(value = "")

  public VNodeSelector getRequired() {
    return required;
  }


  public void setRequired(VNodeSelector required) {
    this.required = required;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VVolumeNodeAffinity v1VolumeNodeAffinity = (VVolumeNodeAffinity) o;
    return Objects.equals(this.required, v1VolumeNodeAffinity.required);
  }

  @Override
  public int hashCode() {
    return Objects.hash(required);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeNodeAffinity {\n");
    sb.append("    required: ").append(toIndentedString(required)).append("\n");
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

