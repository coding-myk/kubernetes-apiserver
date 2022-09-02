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
 * NodeSpec describes the attributes that a node is created with.
 */
@ApiModel(description = "NodeSpec describes the attributes that a node is created with.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VNodeSpec {
  public static final String SERIALIZED_NAME_CONFIG_SOURCE = "configSource";
  @SerializedName(SERIALIZED_NAME_CONFIG_SOURCE)
  private VNodeConfigSource configSource;

  public static final String SERIALIZED_NAME_EXTERNAL_I_D = "externalID";
  @SerializedName(SERIALIZED_NAME_EXTERNAL_I_D)
  private String externalID;

  public static final String SERIALIZED_NAME_POD_C_I_D_R = "podCIDR";
  @SerializedName(SERIALIZED_NAME_POD_C_I_D_R)
  private String podCIDR;

  public static final String SERIALIZED_NAME_POD_C_I_D_RS = "podCIDRs";
  @SerializedName(SERIALIZED_NAME_POD_C_I_D_RS)
  private List<String> podCIDRs = null;

  public static final String SERIALIZED_NAME_PROVIDER_I_D = "providerID";
  @SerializedName(SERIALIZED_NAME_PROVIDER_I_D)
  private String providerID;

  public static final String SERIALIZED_NAME_TAINTS = "taints";
  @SerializedName(SERIALIZED_NAME_TAINTS)
  private List<VTaint> taints = null;

  public static final String SERIALIZED_NAME_UNSCHEDULABLE = "unschedulable";
  @SerializedName(SERIALIZED_NAME_UNSCHEDULABLE)
  private Boolean unschedulable;


  public VNodeSpec configSource(VNodeConfigSource configSource) {

    this.configSource = configSource;
    return this;
  }

   /**
   * Get configSource
   * @return configSource
  **/

  @ApiModelProperty(value = "")

  public VNodeConfigSource getConfigSource() {
    return configSource;
  }


  public void setConfigSource(VNodeConfigSource configSource) {
    this.configSource = configSource;
  }


  public VNodeSpec externalID(String externalID) {

    this.externalID = externalID;
    return this;
  }

   /**
   * Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966
   * @return externalID
  **/

  @ApiModelProperty(value = "Deprecated. Not all kubelets will set this field. Remove field after 1.13. see: https://issues.k8s.io/61966")

  public String getExternalID() {
    return externalID;
  }


  public void setExternalID(String externalID) {
    this.externalID = externalID;
  }


  public VNodeSpec podCIDR(String podCIDR) {

    this.podCIDR = podCIDR;
    return this;
  }

   /**
   * PodCIDR represents the pod IP range assigned to the node.
   * @return podCIDR
  **/

  @ApiModelProperty(value = "PodCIDR represents the pod IP range assigned to the node.")

  public String getPodCIDR() {
    return podCIDR;
  }


  public void setPodCIDR(String podCIDR) {
    this.podCIDR = podCIDR;
  }


  public VNodeSpec podCIDRs(List<String> podCIDRs) {

    this.podCIDRs = podCIDRs;
    return this;
  }

  public VNodeSpec addPodCIDRsItem(String podCIDRsItem) {
    if (this.podCIDRs == null) {
      this.podCIDRs = new ArrayList<String>();
    }
    this.podCIDRs.add(podCIDRsItem);
    return this;
  }

   /**
   * podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.
   * @return podCIDRs
  **/

  @ApiModelProperty(value = "podCIDRs represents the IP ranges assigned to the node for usage by Pods on that node. If this field is specified, the 0th entry must match the podCIDR field. It may contain at most 1 value for each of IPv4 and IPv6.")

  public List<String> getPodCIDRs() {
    return podCIDRs;
  }


  public void setPodCIDRs(List<String> podCIDRs) {
    this.podCIDRs = podCIDRs;
  }


  public VNodeSpec providerID(String providerID) {

    this.providerID = providerID;
    return this;
  }

   /**
   * ID of the node assigned by the cloud provider in the format: &lt;ProviderName&gt;://&lt;ProviderSpecificNodeID&gt;
   * @return providerID
  **/

  @ApiModelProperty(value = "ID of the node assigned by the cloud provider in the format: <ProviderName>://<ProviderSpecificNodeID>")

  public String getProviderID() {
    return providerID;
  }


  public void setProviderID(String providerID) {
    this.providerID = providerID;
  }


  public VNodeSpec taints(List<VTaint> taints) {

    this.taints = taints;
    return this;
  }

  public VNodeSpec addTaintsItem(VTaint taintsItem) {
    if (this.taints == null) {
      this.taints = new ArrayList<VTaint>();
    }
    this.taints.add(taintsItem);
    return this;
  }

   /**
   * If specified, the node&#39;s taints.
   * @return taints
  **/

  @ApiModelProperty(value = "If specified, the node's taints.")

  public List<VTaint> getTaints() {
    return taints;
  }


  public void setTaints(List<VTaint> taints) {
    this.taints = taints;
  }


  public VNodeSpec unschedulable(Boolean unschedulable) {

    this.unschedulable = unschedulable;
    return this;
  }

   /**
   * Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration
   * @return unschedulable
  **/

  @ApiModelProperty(value = "Unschedulable controls node schedulability of new pods. By default, node is schedulable. More info: https://kubernetes.io/docs/concepts/nodes/node/#manual-node-administration")

  public Boolean getUnschedulable() {
    return unschedulable;
  }


  public void setUnschedulable(Boolean unschedulable) {
    this.unschedulable = unschedulable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VNodeSpec v1NodeSpec = (VNodeSpec) o;
    return Objects.equals(this.configSource, v1NodeSpec.configSource) &&
        Objects.equals(this.externalID, v1NodeSpec.externalID) &&
        Objects.equals(this.podCIDR, v1NodeSpec.podCIDR) &&
        Objects.equals(this.podCIDRs, v1NodeSpec.podCIDRs) &&
        Objects.equals(this.providerID, v1NodeSpec.providerID) &&
        Objects.equals(this.taints, v1NodeSpec.taints) &&
        Objects.equals(this.unschedulable, v1NodeSpec.unschedulable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(configSource, externalID, podCIDR, podCIDRs, providerID, taints, unschedulable);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NodeSpec {\n");
    sb.append("    configSource: ").append(toIndentedString(configSource)).append("\n");
    sb.append("    externalID: ").append(toIndentedString(externalID)).append("\n");
    sb.append("    podCIDR: ").append(toIndentedString(podCIDR)).append("\n");
    sb.append("    podCIDRs: ").append(toIndentedString(podCIDRs)).append("\n");
    sb.append("    providerID: ").append(toIndentedString(providerID)).append("\n");
    sb.append("    taints: ").append(toIndentedString(taints)).append("\n");
    sb.append("    unschedulable: ").append(toIndentedString(unschedulable)).append("\n");
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
