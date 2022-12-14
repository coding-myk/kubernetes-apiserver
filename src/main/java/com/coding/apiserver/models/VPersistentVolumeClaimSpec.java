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
 * PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes
 */
@ApiModel(description = "PersistentVolumeClaimSpec describes the common attributes of storage devices and allows a Source for provider-specific attributes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VPersistentVolumeClaimSpec {
  public static final String SERIALIZED_NAME_ACCESS_MODES = "accessModes";
  @SerializedName(SERIALIZED_NAME_ACCESS_MODES)
  private List<String> accessModes = null;

  public static final String SERIALIZED_NAME_DATA_SOURCE = "dataSource";
  @SerializedName(SERIALIZED_NAME_DATA_SOURCE)
  private VTypedLocalObjectReference dataSource;

  public static final String SERIALIZED_NAME_RESOURCES = "resources";
  @SerializedName(SERIALIZED_NAME_RESOURCES)
  private VResourceRequirements resources;

  public static final String SERIALIZED_NAME_SELECTOR = "selector";
  @SerializedName(SERIALIZED_NAME_SELECTOR)
  private VLabelSelector selector;

  public static final String SERIALIZED_NAME_STORAGE_CLASS_NAME = "storageClassName";
  @SerializedName(SERIALIZED_NAME_STORAGE_CLASS_NAME)
  private String storageClassName;

  public static final String SERIALIZED_NAME_VOLUME_MODE = "volumeMode";
  @SerializedName(SERIALIZED_NAME_VOLUME_MODE)
  private String volumeMode;

  public static final String SERIALIZED_NAME_VOLUME_NAME = "volumeName";
  @SerializedName(SERIALIZED_NAME_VOLUME_NAME)
  private String volumeName;


  public VPersistentVolumeClaimSpec accessModes(List<String> accessModes) {

    this.accessModes = accessModes;
    return this;
  }

  public VPersistentVolumeClaimSpec addAccessModesItem(String accessModesItem) {
    if (this.accessModes == null) {
      this.accessModes = new ArrayList<String>();
    }
    this.accessModes.add(accessModesItem);
    return this;
  }

   /**
   * AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1
   * @return accessModes
  **/

  @ApiModelProperty(value = "AccessModes contains the desired access modes the volume should have. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#access-modes-1")

  public List<String> getAccessModes() {
    return accessModes;
  }


  public void setAccessModes(List<String> accessModes) {
    this.accessModes = accessModes;
  }


  public VPersistentVolumeClaimSpec dataSource(VTypedLocalObjectReference dataSource) {

    this.dataSource = dataSource;
    return this;
  }

   /**
   * Get dataSource
   * @return dataSource
  **/

  @ApiModelProperty(value = "")

  public VTypedLocalObjectReference getDataSource() {
    return dataSource;
  }


  public void setDataSource(VTypedLocalObjectReference dataSource) {
    this.dataSource = dataSource;
  }


  public VPersistentVolumeClaimSpec resources(VResourceRequirements resources) {

    this.resources = resources;
    return this;
  }

   /**
   * Get resources
   * @return resources
  **/

  @ApiModelProperty(value = "")

  public VResourceRequirements getResources() {
    return resources;
  }


  public void setResources(VResourceRequirements resources) {
    this.resources = resources;
  }


  public VPersistentVolumeClaimSpec selector(VLabelSelector selector) {

    this.selector = selector;
    return this;
  }

   /**
   * Get selector
   * @return selector
  **/

  @ApiModelProperty(value = "")

  public VLabelSelector getSelector() {
    return selector;
  }


  public void setSelector(VLabelSelector selector) {
    this.selector = selector;
  }


  public VPersistentVolumeClaimSpec storageClassName(String storageClassName) {

    this.storageClassName = storageClassName;
    return this;
  }

   /**
   * Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1
   * @return storageClassName
  **/

  @ApiModelProperty(value = "Name of the StorageClass required by the claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#class-1")

  public String getStorageClassName() {
    return storageClassName;
  }


  public void setStorageClassName(String storageClassName) {
    this.storageClassName = storageClassName;
  }


  public VPersistentVolumeClaimSpec volumeMode(String volumeMode) {

    this.volumeMode = volumeMode;
    return this;
  }

   /**
   * volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec. This is a beta feature.
   * @return volumeMode
  **/

  @ApiModelProperty(value = "volumeMode defines what type of volume is required by the claim. Value of Filesystem is implied when not included in claim spec. This is a beta feature.")

  public String getVolumeMode() {
    return volumeMode;
  }


  public void setVolumeMode(String volumeMode) {
    this.volumeMode = volumeMode;
  }


  public VPersistentVolumeClaimSpec volumeName(String volumeName) {

    this.volumeName = volumeName;
    return this;
  }

   /**
   * VolumeName is the binding reference to the PersistentVolume backing this claim.
   * @return volumeName
  **/

  @ApiModelProperty(value = "VolumeName is the binding reference to the PersistentVolume backing this claim.")

  public String getVolumeName() {
    return volumeName;
  }


  public void setVolumeName(String volumeName) {
    this.volumeName = volumeName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPersistentVolumeClaimSpec v1PersistentVolumeClaimSpec = (VPersistentVolumeClaimSpec) o;
    return Objects.equals(this.accessModes, v1PersistentVolumeClaimSpec.accessModes) &&
        Objects.equals(this.dataSource, v1PersistentVolumeClaimSpec.dataSource) &&
        Objects.equals(this.resources, v1PersistentVolumeClaimSpec.resources) &&
        Objects.equals(this.selector, v1PersistentVolumeClaimSpec.selector) &&
        Objects.equals(this.storageClassName, v1PersistentVolumeClaimSpec.storageClassName) &&
        Objects.equals(this.volumeMode, v1PersistentVolumeClaimSpec.volumeMode) &&
        Objects.equals(this.volumeName, v1PersistentVolumeClaimSpec.volumeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessModes, dataSource, resources, selector, storageClassName, volumeMode, volumeName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeClaimSpec {\n");
    sb.append("    accessModes: ").append(toIndentedString(accessModes)).append("\n");
    sb.append("    dataSource: ").append(toIndentedString(dataSource)).append("\n");
    sb.append("    resources: ").append(toIndentedString(resources)).append("\n");
    sb.append("    selector: ").append(toIndentedString(selector)).append("\n");
    sb.append("    storageClassName: ").append(toIndentedString(storageClassName)).append("\n");
    sb.append("    volumeMode: ").append(toIndentedString(volumeMode)).append("\n");
    sb.append("    volumeName: ").append(toIndentedString(volumeName)).append("\n");
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

