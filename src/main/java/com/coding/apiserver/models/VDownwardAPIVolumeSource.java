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
 * DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.
 */
@ApiModel(description = "DownwardAPIVolumeSource represents a volume containing downward API info. Downward API volumes support ownership management and SELinux relabeling.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VDownwardAPIVolumeSource {
  public static final String SERIALIZED_NAME_DEFAULT_MODE = "defaultMode";
  @SerializedName(SERIALIZED_NAME_DEFAULT_MODE)
  private Integer defaultMode;

  public static final String SERIALIZED_NAME_ITEMS = "items";
  @SerializedName(SERIALIZED_NAME_ITEMS)
  private List<VDownwardAPIVolumeFile> items = null;


  public VDownwardAPIVolumeSource defaultMode(Integer defaultMode) {

    this.defaultMode = defaultMode;
    return this;
  }

   /**
   * Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.
   * @return defaultMode
  **/

  @ApiModelProperty(value = "Optional: mode bits to use on created files by default. Must be a value between 0 and 0777. Defaults to 0644. Directories within the path are not affected by this setting. This might be in conflict with other options that affect the file mode, like fsGroup, and the result can be other mode bits set.")

  public Integer getDefaultMode() {
    return defaultMode;
  }


  public void setDefaultMode(Integer defaultMode) {
    this.defaultMode = defaultMode;
  }


  public VDownwardAPIVolumeSource items(List<VDownwardAPIVolumeFile> items) {

    this.items = items;
    return this;
  }

  public VDownwardAPIVolumeSource addItemsItem(VDownwardAPIVolumeFile itemsItem) {
    if (this.items == null) {
      this.items = new ArrayList<VDownwardAPIVolumeFile>();
    }
    this.items.add(itemsItem);
    return this;
  }

   /**
   * Items is a list of downward API volume file
   * @return items
  **/

  @ApiModelProperty(value = "Items is a list of downward API volume file")

  public List<VDownwardAPIVolumeFile> getItems() {
    return items;
  }


  public void setItems(List<VDownwardAPIVolumeFile> items) {
    this.items = items;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VDownwardAPIVolumeSource v1DownwardAPIVolumeSource = (VDownwardAPIVolumeSource) o;
    return Objects.equals(this.defaultMode, v1DownwardAPIVolumeSource.defaultMode) &&
        Objects.equals(this.items, v1DownwardAPIVolumeSource.items);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMode, items);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1DownwardAPIVolumeSource {\n");
    sb.append("    defaultMode: ").append(toIndentedString(defaultMode)).append("\n");
    sb.append("    items: ").append(toIndentedString(items)).append("\n");
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

