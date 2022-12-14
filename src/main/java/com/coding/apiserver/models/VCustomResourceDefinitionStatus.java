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
 * CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition
 */
@ApiModel(description = "CustomResourceDefinitionStatus indicates the state of the CustomResourceDefinition")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VCustomResourceDefinitionStatus {
  public static final String SERIALIZED_NAME_ACCEPTED_NAMES = "acceptedNames";
  @SerializedName(SERIALIZED_NAME_ACCEPTED_NAMES)
  private VCustomResourceDefinitionNames acceptedNames;

  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<VCustomResourceDefinitionCondition> conditions = null;

  public static final String SERIALIZED_NAME_STORED_VERSIONS = "storedVersions";
  @SerializedName(SERIALIZED_NAME_STORED_VERSIONS)
  private List<String> storedVersions = new ArrayList<String>();


  public VCustomResourceDefinitionStatus acceptedNames(VCustomResourceDefinitionNames acceptedNames) {

    this.acceptedNames = acceptedNames;
    return this;
  }

   /**
   * Get acceptedNames
   * @return acceptedNames
  **/
  @ApiModelProperty(required = true, value = "")

  public VCustomResourceDefinitionNames getAcceptedNames() {
    return acceptedNames;
  }


  public void setAcceptedNames(VCustomResourceDefinitionNames acceptedNames) {
    this.acceptedNames = acceptedNames;
  }


  public VCustomResourceDefinitionStatus conditions(List<VCustomResourceDefinitionCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public VCustomResourceDefinitionStatus addConditionsItem(VCustomResourceDefinitionCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<VCustomResourceDefinitionCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * conditions indicate state for particular aspects of a CustomResourceDefinition
   * @return conditions
  **/

  @ApiModelProperty(value = "conditions indicate state for particular aspects of a CustomResourceDefinition")

  public List<VCustomResourceDefinitionCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<VCustomResourceDefinitionCondition> conditions) {
    this.conditions = conditions;
  }


  public VCustomResourceDefinitionStatus storedVersions(List<String> storedVersions) {

    this.storedVersions = storedVersions;
    return this;
  }

  public VCustomResourceDefinitionStatus addStoredVersionsItem(String storedVersionsItem) {
    this.storedVersions.add(storedVersionsItem);
    return this;
  }

   /**
   * storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from &#x60;spec.versions&#x60; while they exist in this list.
   * @return storedVersions
  **/
  @ApiModelProperty(required = true, value = "storedVersions lists all versions of CustomResources that were ever persisted. Tracking these versions allows a migration path for stored versions in etcd. The field is mutable so a migration controller can finish a migration to another version (ensuring no old objects are left in storage), and then remove the rest of the versions from this list. Versions may not be removed from `spec.versions` while they exist in this list.")

  public List<String> getStoredVersions() {
    return storedVersions;
  }


  public void setStoredVersions(List<String> storedVersions) {
    this.storedVersions = storedVersions;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VCustomResourceDefinitionStatus v1CustomResourceDefinitionStatus = (VCustomResourceDefinitionStatus) o;
    return Objects.equals(this.acceptedNames, v1CustomResourceDefinitionStatus.acceptedNames) &&
        Objects.equals(this.conditions, v1CustomResourceDefinitionStatus.conditions) &&
        Objects.equals(this.storedVersions, v1CustomResourceDefinitionStatus.storedVersions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acceptedNames, conditions, storedVersions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceDefinitionStatus {\n");
    sb.append("    acceptedNames: ").append(toIndentedString(acceptedNames)).append("\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    storedVersions: ").append(toIndentedString(storedVersions)).append("\n");
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

