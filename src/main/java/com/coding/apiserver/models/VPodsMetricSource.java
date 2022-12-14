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

/**
 * PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.
 */
@ApiModel(description = "PodsMetricSource indicates how to scale on a metric describing each pod in the current scale target (for example, transactions-processed-per-second). The values will be averaged together before being compared to the target value.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VPodsMetricSource {
  public static final String SERIALIZED_NAME_METRIC = "metric";
  @SerializedName(SERIALIZED_NAME_METRIC)
  private VMetricIdentifier metric;

  public static final String SERIALIZED_NAME_TARGET = "target";
  @SerializedName(SERIALIZED_NAME_TARGET)
  private VMetricTarget target;


  public VPodsMetricSource metric(VMetricIdentifier metric) {

    this.metric = metric;
    return this;
  }

  /**
   * Get metric
   * @return metric
   **/
  @ApiModelProperty(required = true, value = "")

  public VMetricIdentifier getMetric() {
    return metric;
  }


  public void setMetric(VMetricIdentifier metric) {
    this.metric = metric;
  }


  public VPodsMetricSource target(VMetricTarget target) {

    this.target = target;
    return this;
  }

  /**
   * Get target
   * @return target
   **/
  @ApiModelProperty(required = true, value = "")

  public VMetricTarget getTarget() {
    return target;
  }


  public void setTarget(VMetricTarget target) {
    this.target = target;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPodsMetricSource vPodsMetricSource = (VPodsMetricSource) o;
    return Objects.equals(this.metric, vPodsMetricSource.metric) &&
            Objects.equals(this.target, vPodsMetricSource.target);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metric, target);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VPodsMetricSource {\n");
    sb.append("    metric: ").append(toIndentedString(metric)).append("\n");
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

