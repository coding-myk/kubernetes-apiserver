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
 * LimitRangeSpec defines a min/max usage limit for resources that match on kind.
 */
@ApiModel(description = "LimitRangeSpec defines a min/max usage limit for resources that match on kind.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VLimitRangeSpec {
  public static final String SERIALIZED_NAME_LIMITS = "limits";
  @SerializedName(SERIALIZED_NAME_LIMITS)
  private List<VLimitRangeItem> limits = new ArrayList<VLimitRangeItem>();


  public VLimitRangeSpec limits(List<VLimitRangeItem> limits) {

    this.limits = limits;
    return this;
  }

  public VLimitRangeSpec addLimitsItem(VLimitRangeItem limitsItem) {
    this.limits.add(limitsItem);
    return this;
  }

   /**
   * Limits is the list of LimitRangeItem objects that are enforced.
   * @return limits
  **/
  @ApiModelProperty(required = true, value = "Limits is the list of LimitRangeItem objects that are enforced.")

  public List<VLimitRangeItem> getLimits() {
    return limits;
  }


  public void setLimits(List<VLimitRangeItem> limits) {
    this.limits = limits;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VLimitRangeSpec v1LimitRangeSpec = (VLimitRangeSpec) o;
    return Objects.equals(this.limits, v1LimitRangeSpec.limits);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limits);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1LimitRangeSpec {\n");
    sb.append("    limits: ").append(toIndentedString(limits)).append("\n");
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

