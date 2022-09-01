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
 * RuntimeClassStrategyOptions define the strategy that will dictate the allowable RuntimeClasses for a pod.
 */
@ApiModel(description = "RuntimeClassStrategyOptions define the strategy that will dictate the allowable RuntimeClasses for a pod.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class PolicyVRuntimeClassStrategyOptions {
  public static final String SERIALIZED_NAME_ALLOWED_RUNTIME_CLASS_NAMES = "allowedRuntimeClassNames";
  @SerializedName(SERIALIZED_NAME_ALLOWED_RUNTIME_CLASS_NAMES)
  private List<String> allowedRuntimeClassNames = new ArrayList<String>();

  public static final String SERIALIZED_NAME_DEFAULT_RUNTIME_CLASS_NAME = "defaultRuntimeClassName";
  @SerializedName(SERIALIZED_NAME_DEFAULT_RUNTIME_CLASS_NAME)
  private String defaultRuntimeClassName;


  public PolicyVRuntimeClassStrategyOptions allowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {

    this.allowedRuntimeClassNames = allowedRuntimeClassNames;
    return this;
  }

  public PolicyVRuntimeClassStrategyOptions addAllowedRuntimeClassNamesItem(String allowedRuntimeClassNamesItem) {
    this.allowedRuntimeClassNames.add(allowedRuntimeClassNamesItem);
    return this;
  }

   /**
   * allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of \&quot;*\&quot; means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.
   * @return allowedRuntimeClassNames
  **/
  @ApiModelProperty(required = true, value = "allowedRuntimeClassNames is a whitelist of RuntimeClass names that may be specified on a pod. A value of \"*\" means that any RuntimeClass name is allowed, and must be the only item in the list. An empty list requires the RuntimeClassName field to be unset.")

  public List<String> getAllowedRuntimeClassNames() {
    return allowedRuntimeClassNames;
  }


  public void setAllowedRuntimeClassNames(List<String> allowedRuntimeClassNames) {
    this.allowedRuntimeClassNames = allowedRuntimeClassNames;
  }


  public PolicyVRuntimeClassStrategyOptions defaultRuntimeClassName(String defaultRuntimeClassName) {

    this.defaultRuntimeClassName = defaultRuntimeClassName;
    return this;
  }

   /**
   * defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.
   * @return defaultRuntimeClassName
  **/

  @ApiModelProperty(value = "defaultRuntimeClassName is the default RuntimeClassName to set on the pod. The default MUST be allowed by the allowedRuntimeClassNames list. A value of nil does not mutate the Pod.")

  public String getDefaultRuntimeClassName() {
    return defaultRuntimeClassName;
  }


  public void setDefaultRuntimeClassName(String defaultRuntimeClassName) {
    this.defaultRuntimeClassName = defaultRuntimeClassName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PolicyVRuntimeClassStrategyOptions policyV1beta1RuntimeClassStrategyOptions = (PolicyVRuntimeClassStrategyOptions) o;
    return Objects.equals(this.allowedRuntimeClassNames, policyV1beta1RuntimeClassStrategyOptions.allowedRuntimeClassNames) &&
        Objects.equals(this.defaultRuntimeClassName, policyV1beta1RuntimeClassStrategyOptions.defaultRuntimeClassName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedRuntimeClassNames, defaultRuntimeClassName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PolicyV1beta1RuntimeClassStrategyOptions {\n");
    sb.append("    allowedRuntimeClassNames: ").append(toIndentedString(allowedRuntimeClassNames)).append("\n");
    sb.append("    defaultRuntimeClassName: ").append(toIndentedString(defaultRuntimeClassName)).append("\n");
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

