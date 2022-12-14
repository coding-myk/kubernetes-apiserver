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
 * Represents a Photon Controller persistent disk resource.
 */
@ApiModel(description = "Represents a Photon Controller persistent disk resource.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VPhotonPersistentDiskVolumeSource {
  public static final String SERIALIZED_NAME_FS_TYPE = "fsType";
  @SerializedName(SERIALIZED_NAME_FS_TYPE)
  private String fsType;

  public static final String SERIALIZED_NAME_PD_I_D = "pdID";
  @SerializedName(SERIALIZED_NAME_PD_I_D)
  private String pdID;


  public VPhotonPersistentDiskVolumeSource fsType(String fsType) {

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


  public VPhotonPersistentDiskVolumeSource pdID(String pdID) {

    this.pdID = pdID;
    return this;
  }

   /**
   * ID that identifies Photon Controller persistent disk
   * @return pdID
  **/
  @ApiModelProperty(required = true, value = "ID that identifies Photon Controller persistent disk")

  public String getPdID() {
    return pdID;
  }


  public void setPdID(String pdID) {
    this.pdID = pdID;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPhotonPersistentDiskVolumeSource v1PhotonPersistentDiskVolumeSource = (VPhotonPersistentDiskVolumeSource) o;
    return Objects.equals(this.fsType, v1PhotonPersistentDiskVolumeSource.fsType) &&
        Objects.equals(this.pdID, v1PhotonPersistentDiskVolumeSource.pdID);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fsType, pdID);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PhotonPersistentDiskVolumeSource {\n");
    sb.append("    fsType: ").append(toIndentedString(fsType)).append("\n");
    sb.append("    pdID: ").append(toIndentedString(pdID)).append("\n");
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

