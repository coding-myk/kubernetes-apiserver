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
 * SELinuxOptions are the labels to be applied to the container
 */
@ApiModel(description = "SELinuxOptions are the labels to be applied to the container")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VSELinuxOptions {
  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private String level;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private String role;

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private String type;

  public static final String SERIALIZED_NAME_USER = "user";
  @SerializedName(SERIALIZED_NAME_USER)
  private String user;


  public VSELinuxOptions level(String level) {

    this.level = level;
    return this;
  }

   /**
   * Level is SELinux level label that applies to the container.
   * @return level
  **/

  @ApiModelProperty(value = "Level is SELinux level label that applies to the container.")

  public String getLevel() {
    return level;
  }


  public void setLevel(String level) {
    this.level = level;
  }


  public VSELinuxOptions role(String role) {

    this.role = role;
    return this;
  }

   /**
   * Role is a SELinux role label that applies to the container.
   * @return role
  **/

  @ApiModelProperty(value = "Role is a SELinux role label that applies to the container.")

  public String getRole() {
    return role;
  }


  public void setRole(String role) {
    this.role = role;
  }


  public VSELinuxOptions type(String type) {

    this.type = type;
    return this;
  }

   /**
   * Type is a SELinux type label that applies to the container.
   * @return type
  **/

  @ApiModelProperty(value = "Type is a SELinux type label that applies to the container.")

  public String getType() {
    return type;
  }


  public void setType(String type) {
    this.type = type;
  }


  public VSELinuxOptions user(String user) {

    this.user = user;
    return this;
  }

   /**
   * User is a SELinux user label that applies to the container.
   * @return user
  **/

  @ApiModelProperty(value = "User is a SELinux user label that applies to the container.")

  public String getUser() {
    return user;
  }


  public void setUser(String user) {
    this.user = user;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VSELinuxOptions v1SELinuxOptions = (VSELinuxOptions) o;
    return Objects.equals(this.level, v1SELinuxOptions.level) &&
        Objects.equals(this.role, v1SELinuxOptions.role) &&
        Objects.equals(this.type, v1SELinuxOptions.type) &&
        Objects.equals(this.user, v1SELinuxOptions.user);
  }

  @Override
  public int hashCode() {
    return Objects.hash(level, role, type, user);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SELinuxOptions {\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
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

