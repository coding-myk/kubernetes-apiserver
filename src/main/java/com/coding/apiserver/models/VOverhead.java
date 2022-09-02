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
import com.coding.apiserver.custom.Quantity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.HashMap;
import java.util.Map;

/**
 * Overhead structure represents the resource overhead associated with running a pod.
 */
@ApiModel(description = "Overhead structure represents the resource overhead associated with running a pod.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VOverhead {
  public static final String SERIALIZED_NAME_POD_FIXED = "podFixed";
  @SerializedName(SERIALIZED_NAME_POD_FIXED)
  private Map<String, Quantity> podFixed = null;


  public VOverhead podFixed(Map<String, Quantity> podFixed) {

    this.podFixed = podFixed;
    return this;
  }

  public VOverhead putPodFixedItem(String key, Quantity podFixedItem) {
    if (this.podFixed == null) {
      this.podFixed = new HashMap<String, Quantity>();
    }
    this.podFixed.put(key, podFixedItem);
    return this;
  }

   /**
   * PodFixed represents the fixed resource overhead associated with running a pod.
   * @return podFixed
  **/

  @ApiModelProperty(value = "PodFixed represents the fixed resource overhead associated with running a pod.")

  public Map<String, Quantity> getPodFixed() {
    return podFixed;
  }


  public void setPodFixed(Map<String, Quantity> podFixed) {
    this.podFixed = podFixed;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VOverhead v1beta1Overhead = (VOverhead) o;
    return Objects.equals(this.podFixed, v1beta1Overhead.podFixed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(podFixed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1Overhead {\n");
    sb.append("    podFixed: ").append(toIndentedString(podFixed)).append("\n");
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

