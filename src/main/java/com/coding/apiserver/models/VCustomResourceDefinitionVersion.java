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
 * CustomResourceDefinitionVersion describes a version for CRD.
 */
@ApiModel(description = "CustomResourceDefinitionVersion describes a version for CRD.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VCustomResourceDefinitionVersion {
  public static final String SERIALIZED_NAME_ADDITIONAL_PRINTER_COLUMNS = "additionalPrinterColumns";
  @SerializedName(SERIALIZED_NAME_ADDITIONAL_PRINTER_COLUMNS)
  private List<VCustomResourceColumnDefinition> additionalPrinterColumns = null;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_SCHEMA = "schema";
  @SerializedName(SERIALIZED_NAME_SCHEMA)
  private VCustomResourceValidation schema;

  public static final String SERIALIZED_NAME_SERVED = "served";
  @SerializedName(SERIALIZED_NAME_SERVED)
  private Boolean served;

  public static final String SERIALIZED_NAME_STORAGE = "storage";
  @SerializedName(SERIALIZED_NAME_STORAGE)
  private Boolean storage;

  public static final String SERIALIZED_NAME_SUBRESOURCES = "subresources";
  @SerializedName(SERIALIZED_NAME_SUBRESOURCES)
  private VCustomResourceSubresources subresources;


  public VCustomResourceDefinitionVersion additionalPrinterColumns(List<VCustomResourceColumnDefinition> additionalPrinterColumns) {

    this.additionalPrinterColumns = additionalPrinterColumns;
    return this;
  }

  public VCustomResourceDefinitionVersion addAdditionalPrinterColumnsItem(VCustomResourceColumnDefinition additionalPrinterColumnsItem) {
    if (this.additionalPrinterColumns == null) {
      this.additionalPrinterColumns = new ArrayList<VCustomResourceColumnDefinition>();
    }
    this.additionalPrinterColumns.add(additionalPrinterColumnsItem);
    return this;
  }

   /**
   * additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If no columns are specified, a single column displaying the age of the custom resource is used.
   * @return additionalPrinterColumns
  **/

  @ApiModelProperty(value = "additionalPrinterColumns specifies additional columns returned in Table output. See https://kubernetes.io/docs/reference/using-api/api-concepts/#receiving-resources-as-tables for details. If no columns are specified, a single column displaying the age of the custom resource is used.")

  public List<VCustomResourceColumnDefinition> getAdditionalPrinterColumns() {
    return additionalPrinterColumns;
  }


  public void setAdditionalPrinterColumns(List<VCustomResourceColumnDefinition> additionalPrinterColumns) {
    this.additionalPrinterColumns = additionalPrinterColumns;
  }


  public VCustomResourceDefinitionVersion name(String name) {

    this.name = name;
    return this;
  }

   /**
   * name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at &#x60;/apis/&lt;group&gt;/&lt;version&gt;/...&#x60; if &#x60;served&#x60; is true.
   * @return name
  **/
  @ApiModelProperty(required = true, value = "name is the version name, e.g. “v1”, “v2beta1”, etc. The custom resources are served under this version at `/apis/<group>/<version>/...` if `served` is true.")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public VCustomResourceDefinitionVersion schema(VCustomResourceValidation schema) {

    this.schema = schema;
    return this;
  }

   /**
   * Get schema
   * @return schema
  **/

  @ApiModelProperty(value = "")

  public VCustomResourceValidation getSchema() {
    return schema;
  }


  public void setSchema(VCustomResourceValidation schema) {
    this.schema = schema;
  }


  public VCustomResourceDefinitionVersion served(Boolean served) {

    this.served = served;
    return this;
  }

   /**
   * served is a flag enabling/disabling this version from being served via REST APIs
   * @return served
  **/
  @ApiModelProperty(required = true, value = "served is a flag enabling/disabling this version from being served via REST APIs")

  public Boolean getServed() {
    return served;
  }


  public void setServed(Boolean served) {
    this.served = served;
  }


  public VCustomResourceDefinitionVersion storage(Boolean storage) {

    this.storage = storage;
    return this;
  }

   /**
   * storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage&#x3D;true.
   * @return storage
  **/
  @ApiModelProperty(required = true, value = "storage indicates this version should be used when persisting custom resources to storage. There must be exactly one version with storage=true.")

  public Boolean getStorage() {
    return storage;
  }


  public void setStorage(Boolean storage) {
    this.storage = storage;
  }


  public VCustomResourceDefinitionVersion subresources(VCustomResourceSubresources subresources) {

    this.subresources = subresources;
    return this;
  }

   /**
   * Get subresources
   * @return subresources
  **/

  @ApiModelProperty(value = "")

  public VCustomResourceSubresources getSubresources() {
    return subresources;
  }


  public void setSubresources(VCustomResourceSubresources subresources) {
    this.subresources = subresources;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VCustomResourceDefinitionVersion v1CustomResourceDefinitionVersion = (VCustomResourceDefinitionVersion) o;
    return Objects.equals(this.additionalPrinterColumns, v1CustomResourceDefinitionVersion.additionalPrinterColumns) &&
        Objects.equals(this.name, v1CustomResourceDefinitionVersion.name) &&
        Objects.equals(this.schema, v1CustomResourceDefinitionVersion.schema) &&
        Objects.equals(this.served, v1CustomResourceDefinitionVersion.served) &&
        Objects.equals(this.storage, v1CustomResourceDefinitionVersion.storage) &&
        Objects.equals(this.subresources, v1CustomResourceDefinitionVersion.subresources);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalPrinterColumns, name, schema, served, storage, subresources);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1CustomResourceDefinitionVersion {\n");
    sb.append("    additionalPrinterColumns: ").append(toIndentedString(additionalPrinterColumns)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    schema: ").append(toIndentedString(schema)).append("\n");
    sb.append("    served: ").append(toIndentedString(served)).append("\n");
    sb.append("    storage: ").append(toIndentedString(storage)).append("\n");
    sb.append("    subresources: ").append(toIndentedString(subresources)).append("\n");
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
