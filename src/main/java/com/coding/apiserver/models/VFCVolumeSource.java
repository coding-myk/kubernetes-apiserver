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
 * Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.
 */
@ApiModel(description = "Represents a Fibre Channel volume. Fibre Channel volumes can only be mounted as read/write once. Fibre Channel volumes support ownership management and SELinux relabeling.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VFCVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_LUN = "lun";
  @SerializedName(SERIALIZED_NAME_LUN)
  private Integer lun;

  public static final String SERIALIZED_NAME_READ_ONLY = "readOnly";
  @SerializedName(SERIALIZED_NAME_READ_ONLY)
  private Boolean readOnly;

  public static final String SERIALIZED_NAME_TARGET_W_W_NS = "targetWWNs";
  @SerializedName(SERIALIZED_NAME_TARGET_W_W_NS)
  private List<String> targetWWNs = null;

  public static final String SERIALIZED_NAME_WWIDS = "wwids";
  @SerializedName(SERIALIZED_NAME_WWIDS)
  private List<String> wwids = null;


  public VFCVolumeSource fsType(String fsType) {

    this.fsType = fsType;
    return this;
  }

   /**
   * Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \&quot;ext4\&quot;, \&quot;xfs\&quot;, \&quot;ntfs\&quot;. Implicitly inferred to be \&quot;ext4\&quot; if unspecified.
   * @return fsType
  **/

  @ApiModelProperty(value = "Filesystem type to mount. Must be a filesystem type supported by the host operating system. Ex. \"ext4\", \"xfs\", \"ntfs\". Implicitly inferred to be \"ext4\" if unspecified.")

  public String getFsType() {
    return fsType;
  }


  public void setFsType(String fsType) {
    this.fsType = fsType;
  }


  public VFCVolumeSource lun(Integer lun) {

    this.lun = lun;
    return this;
  }

   /**
   * Optional: FC target lun number
   * @return lun
  **/

  @ApiModelProperty(value = "Optional: FC target lun number")

  public Integer getLun() {
    return lun;
  }


  public void setLun(Integer lun) {
    this.lun = lun;
  }


  public VFCVolumeSource readOnly(Boolean readOnly) {

    this.readOnly = readOnly;
    return this;
  }

   /**
   * Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.
   * @return readOnly
  **/

  @ApiModelProperty(value = "Optional: Defaults to false (read/write). ReadOnly here will force the ReadOnly setting in VolumeMounts.")

  public Boolean getReadOnly() {
    return readOnly;
  }


  public void setReadOnly(Boolean readOnly) {
    this.readOnly = readOnly;
  }


  public VFCVolumeSource targetWWNs(List<String> targetWWNs) {

    this.targetWWNs = targetWWNs;
    return this;
  }

  public VFCVolumeSource addTargetWWNsItem(String targetWWNsItem) {
    if (this.targetWWNs == null) {
      this.targetWWNs = new ArrayList<String>();
    }
    this.targetWWNs.add(targetWWNsItem);
    return this;
  }

   /**
   * Optional: FC target worldwide names (WWNs)
   * @return targetWWNs
  **/

  @ApiModelProperty(value = "Optional: FC target worldwide names (WWNs)")

  public List<String> getTargetWWNs() {
    return targetWWNs;
  }


  public void setTargetWWNs(List<String> targetWWNs) {
    this.targetWWNs = targetWWNs;
  }


  public VFCVolumeSource wwids(List<String> wwids) {

    this.wwids = wwids;
    return this;
  }

  public VFCVolumeSource addWwidsItem(String wwidsItem) {
    if (this.wwids == null) {
      this.wwids = new ArrayList<String>();
    }
    this.wwids.add(wwidsItem);
    return this;
  }

   /**
   * Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.
   * @return wwids
  **/

  @ApiModelProperty(value = "Optional: FC volume world wide identifiers (wwids) Either wwids or combination of targetWWNs and lun must be set, but not both simultaneously.")

  public List<String> getWwids() {
    return wwids;
  }


  public void setWwids(List<String> wwids) {
    this.wwids = wwids;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VFCVolumeSource v1FCVolumeSource = (VFCVolumeSource) o;
    return Objects.equals(this.fsType, v1FCVolumeSource.fsType) &&
        Objects.equals(this.lun, v1FCVolumeSource.lun) &&
        Objects.equals(this.readOnly, v1FCVolumeSource.readOnly) &&
        Objects.equals(this.targetWWNs, v1FCVolumeSource.targetWWNs) &&
        Objects.equals(this.wwids, v1FCVolumeSource.wwids);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, lun, readOnly, targetWWNs, wwids);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1FCVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    lun: ").append(toIndentedString(lun)).append("\n");
    sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
    sb.append("    targetWWNs: ").append(toIndentedString(targetWWNs)).append("\n");
    sb.append("    wwids: ").append(toIndentedString(wwids)).append("\n");
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
