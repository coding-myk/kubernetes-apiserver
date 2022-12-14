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
 * A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.
 */
@ApiModel(description = "A scoped-resource selector requirement is a selector that contains values, a scope name, and an operator that relates the scope name and values.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VScopedResourceSelectorRequirement {
  public static final String SERIALIZED_NAME_OPERATOR = "operator";
  @SerializedName(SERIALIZED_NAME_OPERATOR)
  private String operator;

  public static final String SERIALIZED_NAME_SCOPE_NAME = "scopeName";
  @SerializedName(SERIALIZED_NAME_SCOPE_NAME)
  private String scopeName;

  public static final String SERIALIZED_NAME_VALUES = "values";
  @SerializedName(SERIALIZED_NAME_VALUES)
  private List<String> values = null;


  public VScopedResourceSelectorRequirement operator(String operator) {

    this.operator = operator;
    return this;
  }

   /**
   * Represents a scope&#39;s relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.
   * @return operator
  **/
  @ApiModelProperty(required = true, value = "Represents a scope's relationship to a set of values. Valid operators are In, NotIn, Exists, DoesNotExist.")

  public String getOperator() {
    return operator;
  }


  public void setOperator(String operator) {
    this.operator = operator;
  }


  public VScopedResourceSelectorRequirement scopeName(String scopeName) {

    this.scopeName = scopeName;
    return this;
  }

   /**
   * The name of the scope that the selector applies to.
   * @return scopeName
  **/
  @ApiModelProperty(required = true, value = "The name of the scope that the selector applies to.")

  public String getScopeName() {
    return scopeName;
  }


  public void setScopeName(String scopeName) {
    this.scopeName = scopeName;
  }


  public VScopedResourceSelectorRequirement values(List<String> values) {

    this.values = values;
    return this;
  }

  public VScopedResourceSelectorRequirement addValuesItem(String valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<String>();
    }
    this.values.add(valuesItem);
    return this;
  }

   /**
   * An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.
   * @return values
  **/

  @ApiModelProperty(value = "An array of string values. If the operator is In or NotIn, the values array must be non-empty. If the operator is Exists or DoesNotExist, the values array must be empty. This array is replaced during a strategic merge patch.")

  public List<String> getValues() {
    return values;
  }


  public void setValues(List<String> values) {
    this.values = values;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VScopedResourceSelectorRequirement v1ScopedResourceSelectorRequirement = (VScopedResourceSelectorRequirement) o;
    return Objects.equals(this.operator, v1ScopedResourceSelectorRequirement.operator) &&
        Objects.equals(this.scopeName, v1ScopedResourceSelectorRequirement.scopeName) &&
        Objects.equals(this.values, v1ScopedResourceSelectorRequirement.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(operator, scopeName, values);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ScopedResourceSelectorRequirement {\n");
    sb.append("    operator: ").append(toIndentedString(operator)).append("\n");
    sb.append("    scopeName: ").append(toIndentedString(scopeName)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

