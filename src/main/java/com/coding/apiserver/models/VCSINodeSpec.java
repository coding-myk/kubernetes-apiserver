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
 * CSINodeSpec holds information about the specification of all CSI drivers installed on a node
 */
@ApiModel(description = "CSINodeSpec holds information about the specification of all CSI drivers installed on a node")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VCSINodeSpec {
  public static final String SERIALIZED_NAME_DRIVERS = "drivers";
  @SerializedName(SERIALIZED_NAME_DRIVERS)
  private List<VCSINodeDriver> drivers = new ArrayList<VCSINodeDriver>();


  public VCSINodeSpec drivers(List<VCSINodeDriver> drivers) {

    this.drivers = drivers;
    return this;
  }

  public VCSINodeSpec addDriversItem(VCSINodeDriver driversItem) {
    this.drivers.add(driversItem);
    return this;
  }

   /**
   * drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.
   * @return drivers
  **/
  @ApiModelProperty(required = true, value = "drivers is a list of information of all CSI Drivers existing on a node. If all drivers in the list are uninstalled, this can become empty.")

  public List<VCSINodeDriver> getDrivers() {
    return drivers;
  }


  public void setDrivers(List<VCSINodeDriver> drivers) {
    this.drivers = drivers;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VCSINodeSpec v1beta1CSINodeSpec = (VCSINodeSpec) o;
    return Objects.equals(this.drivers, v1beta1CSINodeSpec.drivers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(drivers);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CSINodeSpec {\n");
    sb.append("    drivers: ").append(toIndentedString(drivers)).append("\n");
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
