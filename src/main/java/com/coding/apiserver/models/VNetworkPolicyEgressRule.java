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
 * NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec&#39;s podSelector. The traffic must match both ports and to. This type is beta-level in 1.8
 */
@ApiModel(description = "NetworkPolicyEgressRule describes a particular set of traffic that is allowed out of pods matched by a NetworkPolicySpec's podSelector. The traffic must match both ports and to. This type is beta-level in 1.8")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VNetworkPolicyEgressRule {
  public static final String SERIALIZED_NAME_PORTS = "ports";
  @SerializedName(SERIALIZED_NAME_PORTS)
  private List<VNetworkPolicyPort> ports = null;

  public static final String SERIALIZED_NAME_TO = "to";
  @SerializedName(SERIALIZED_NAME_TO)
  private List<VNetworkPolicyPeer> to = null;


  public VNetworkPolicyEgressRule ports(List<VNetworkPolicyPort> ports) {

    this.ports = ports;
    return this;
  }

  public VNetworkPolicyEgressRule addPortsItem(VNetworkPolicyPort portsItem) {
    if (this.ports == null) {
      this.ports = new ArrayList<VNetworkPolicyPort>();
    }
    this.ports.add(portsItem);
    return this;
  }

   /**
   * List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.
   * @return ports
  **/

  @ApiModelProperty(value = "List of destination ports for outgoing traffic. Each item in this list is combined using a logical OR. If this field is empty or missing, this rule matches all ports (traffic not restricted by port). If this field is present and contains at least one item, then this rule allows traffic only if the traffic matches at least one port in the list.")

  public List<VNetworkPolicyPort> getPorts() {
    return ports;
  }


  public void setPorts(List<VNetworkPolicyPort> ports) {
    this.ports = ports;
  }


  public VNetworkPolicyEgressRule to(List<VNetworkPolicyPeer> to) {

    this.to = to;
    return this;
  }

  public VNetworkPolicyEgressRule addToItem(VNetworkPolicyPeer toItem) {
    if (this.to == null) {
      this.to = new ArrayList<VNetworkPolicyPeer>();
    }
    this.to.add(toItem);
    return this;
  }

   /**
   * List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.
   * @return to
  **/

  @ApiModelProperty(value = "List of destinations for outgoing traffic of pods selected for this rule. Items in this list are combined using a logical OR operation. If this field is empty or missing, this rule matches all destinations (traffic not restricted by destination). If this field is present and contains at least one item, this rule allows traffic only if the traffic matches at least one item in the to list.")

  public List<VNetworkPolicyPeer> getTo() {
    return to;
  }


  public void setTo(List<VNetworkPolicyPeer> to) {
    this.to = to;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VNetworkPolicyEgressRule v1NetworkPolicyEgressRule = (VNetworkPolicyEgressRule) o;
    return Objects.equals(this.ports, v1NetworkPolicyEgressRule.ports) &&
        Objects.equals(this.to, v1NetworkPolicyEgressRule.to);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ports, to);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1NetworkPolicyEgressRule {\n");
    sb.append("    ports: ").append(toIndentedString(ports)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
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

