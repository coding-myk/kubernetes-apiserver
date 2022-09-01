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
 * volumeDevice describes a mapping of a raw block device within a container.
 */
@ApiModel(description = "volumeDevice describes a mapping of a raw block device within a container.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VVolumeDevice {
  public static final String SERIALIZED_NAME_DEVICE_PATH = "devicePath";
  @SerializedName(SERIALIZED_NAME_DEVICE_PATH)
  private String devicePath;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;


  public VVolumeDevice devicePath(String devicePath) {

    this.devicePath = devicePath;
    return this;
  }

   /**
   * devicePath is the path inside of the container that the device will be mapped to.
   * @return devicePath
  **/
  @ApiModelProperty(required = true, value = "devicePath is the path inside of the container that the device will be mapped to.")

  public String getDevicePath() {
    return devicePath;
  }


  public void setDevicePath(String devicePath) {
    this.devicePath = devicePath;
  }


  public VVolumeDevice name(String name) {

    this.name = name;
    return this;
  }

   /**
   * name must match the name of a persistentVolumeClaim in the pod
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name must match the name of a persistentVolumeClaim in the pod")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VVolumeDevice v1VolumeDevice = (VVolumeDevice) o;
    return Objects.equals(this.devicePath, v1VolumeDevice.devicePath) &&
        Objects.equals(this.name, v1VolumeDevice.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(devicePath, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1VolumeDevice {\n");
    sb.append("    devicePath: ").append(toIndentedString(devicePath)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

