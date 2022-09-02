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

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * specification of a horizontal pod autoscaler.
 */
@ApiModel(description = "specification of a horizontal pod autoscaler.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VHorizontalPodAutoscalerSpec {
  public static final String SERIALIZED_NAME_MAX_REPLICAS = "maxReplicas";
  @SerializedName(SERIALIZED_NAME_MAX_REPLICAS)
  private Integer maxReplicas;

  public static final String SERIALIZED_NAME_METRICS = "metrics";
  @SerializedName(SERIALIZED_NAME_METRICS)
  private List<VMetricSpec> metrics = null;

  public static final String SERIALIZED_NAME_MIN_REPLICAS = "minReplicas";
  @SerializedName(SERIALIZED_NAME_MIN_REPLICAS)
  private Integer minReplicas;

  public static final String SERIALIZED_NAME_SCALE_TARGET_REF = "scaleTargetRef";
  @SerializedName(SERIALIZED_NAME_SCALE_TARGET_REF)
  private VCrossVersionObjectReference scaleTargetRef;


  public VHorizontalPodAutoscalerSpec maxReplicas(Integer maxReplicas) {

    this.maxReplicas = maxReplicas;
    return this;
  }

  /**
   * maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.
   * @return maxReplicas
   **/
  @ApiModelProperty(required = true, value = "maxReplicas is the upper limit for the number of replicas to which the autoscaler can scale up. It cannot be less that minReplicas.")

  public Integer getMaxReplicas() {
    return maxReplicas;
  }


  public void setMaxReplicas(Integer maxReplicas) {
    this.maxReplicas = maxReplicas;
  }


  public VHorizontalPodAutoscalerSpec metrics(List<VMetricSpec> metrics) {

    this.metrics = metrics;
    return this;
  }

  public VHorizontalPodAutoscalerSpec addMetricsItem(VMetricSpec metricsItem) {
    if (this.metrics == null) {
      this.metrics = new ArrayList<VMetricSpec>();
    }
    this.metrics.add(metricsItem);
    return this;
  }

  /**
   * metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization.
   * @return metrics
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "metrics contains the specifications for which to use to calculate the desired replica count (the maximum replica count across all metrics will be used).  The desired replica count is calculated multiplying the ratio between the target value and the current value by the current number of pods.  Ergo, metrics used must decrease as the pod count is increased, and vice-versa.  See the individual metric source types for more information about how each type of metric must respond. If not set, the default metric will be set to 80% average CPU utilization.")

  public List<VMetricSpec> getMetrics() {
    return metrics;
  }


  public void setMetrics(List<VMetricSpec> metrics) {
    this.metrics = metrics;
  }


  public VHorizontalPodAutoscalerSpec minReplicas(Integer minReplicas) {

    this.minReplicas = minReplicas;
    return this;
  }

  /**
   * minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.
   * @return minReplicas
   **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "minReplicas is the lower limit for the number of replicas to which the autoscaler can scale down.  It defaults to 1 pod.  minReplicas is allowed to be 0 if the alpha feature gate HPAScaleToZero is enabled and at least one Object or External metric is configured.  Scaling is active as long as at least one metric value is available.")

  public Integer getMinReplicas() {
    return minReplicas;
  }


  public void setMinReplicas(Integer minReplicas) {
    this.minReplicas = minReplicas;
  }


  public VHorizontalPodAutoscalerSpec scaleTargetRef(VCrossVersionObjectReference scaleTargetRef) {

    this.scaleTargetRef = scaleTargetRef;
    return this;
  }

  /**
   * Get scaleTargetRef
   * @return scaleTargetRef
   **/
  @ApiModelProperty(required = true, value = "")

  public VCrossVersionObjectReference getScaleTargetRef() {
    return scaleTargetRef;
  }


  public void setScaleTargetRef(VCrossVersionObjectReference scaleTargetRef) {
    this.scaleTargetRef = scaleTargetRef;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VHorizontalPodAutoscalerSpec vHorizontalPodAutoscalerSpec = (VHorizontalPodAutoscalerSpec) o;
    return Objects.equals(this.maxReplicas, vHorizontalPodAutoscalerSpec.maxReplicas) &&
            Objects.equals(this.metrics, vHorizontalPodAutoscalerSpec.metrics) &&
            Objects.equals(this.minReplicas, vHorizontalPodAutoscalerSpec.minReplicas) &&
            Objects.equals(this.scaleTargetRef, vHorizontalPodAutoscalerSpec.scaleTargetRef);
  }

  @Override
  public int hashCode() {
    return Objects.hash(maxReplicas, metrics, minReplicas, scaleTargetRef);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V2beta2HorizontalPodAutoscalerSpec {\n");
    sb.append("    maxReplicas: ").append(toIndentedString(maxReplicas)).append("\n");
    sb.append("    metrics: ").append(toIndentedString(metrics)).append("\n");
    sb.append("    minReplicas: ").append(toIndentedString(minReplicas)).append("\n");
    sb.append("    scaleTargetRef: ").append(toIndentedString(scaleTargetRef)).append("\n");
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
