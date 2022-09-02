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
import java.util.Arrays;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.
 */
@ApiModel(description = "This information is immutable after the request is created. Only the Request and Usages fields can be set on creation, other fields are derived by Kubernetes and cannot be modified by users.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VCertificateSigningRequestSpec {
  public static final String SERIALIZED_NAME_EXTRA = "extra";
  @SerializedName(SERIALIZED_NAME_EXTRA)
  private Map<String, List<String>> extra = null;

  public static final String SERIALIZED_NAME_GROUPS = "groups";
  @SerializedName(SERIALIZED_NAME_GROUPS)
  private List<String> groups = null;

  public static final String SERIALIZED_NAME_REQUEST = "request";
  @SerializedName(SERIALIZED_NAME_REQUEST)
  private byte[] request;

  public static final String SERIALIZED_NAME_UID = "uid";
  @SerializedName(SERIALIZED_NAME_UID)
  private String uid;

  public static final String SERIALIZED_NAME_USAGES = "usages";
  @SerializedName(SERIALIZED_NAME_USAGES)
  private List<String> usages = null;

  public static final String SERIALIZED_NAME_USERNAME = "username";
  @SerializedName(SERIALIZED_NAME_USERNAME)
  private String username;


  public VCertificateSigningRequestSpec extra(Map<String, List<String>> extra) {

    this.extra = extra;
    return this;
  }

  public VCertificateSigningRequestSpec putExtraItem(String key, List<String> extraItem) {
    if (this.extra == null) {
      this.extra = new HashMap<String, List<String>>();
    }
    this.extra.put(key, extraItem);
    return this;
  }

   /**
   * Extra information about the requesting user. See user.Info interface for details.
   * @return extra
  **/

  @ApiModelProperty(value = "Extra information about the requesting user. See user.Info interface for details.")

  public Map<String, List<String>> getExtra() {
    return extra;
  }


  public void setExtra(Map<String, List<String>> extra) {
    this.extra = extra;
  }


  public VCertificateSigningRequestSpec groups(List<String> groups) {

    this.groups = groups;
    return this;
  }

  public VCertificateSigningRequestSpec addGroupsItem(String groupsItem) {
    if (this.groups == null) {
      this.groups = new ArrayList<String>();
    }
    this.groups.add(groupsItem);
    return this;
  }

   /**
   * Group information about the requesting user. See user.Info interface for details.
   * @return groups
  **/

  @ApiModelProperty(value = "Group information about the requesting user. See user.Info interface for details.")

  public List<String> getGroups() {
    return groups;
  }


  public void setGroups(List<String> groups) {
    this.groups = groups;
  }


  public VCertificateSigningRequestSpec request(byte[] request) {

    this.request = request;
    return this;
  }

   /**
   * Base64-encoded PKCS#10 CSR data
   * @return request
  **/
  @ApiModelProperty(required = true, value = "Base64-encoded PKCS#10 CSR data")

  public byte[] getRequest() {
    return request;
  }


  public void setRequest(byte[] request) {
    this.request = request;
  }


  public VCertificateSigningRequestSpec uid(String uid) {

    this.uid = uid;
    return this;
  }

   /**
   * UID information about the requesting user. See user.Info interface for details.
   * @return uid
  **/

  @ApiModelProperty(value = "UID information about the requesting user. See user.Info interface for details.")

  public String getUid() {
    return uid;
  }


  public void setUid(String uid) {
    this.uid = uid;
  }


  public VCertificateSigningRequestSpec usages(List<String> usages) {

    this.usages = usages;
    return this;
  }

  public VCertificateSigningRequestSpec addUsagesItem(String usagesItem) {
    if (this.usages == null) {
      this.usages = new ArrayList<String>();
    }
    this.usages.add(usagesItem);
    return this;
  }

   /**
   * allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3      https://tools.ietf.org/html/rfc5280#section-4.2.1.12
   * @return usages
  **/

  @ApiModelProperty(value = "allowedUsages specifies a set of usage contexts the key will be valid for. See: https://tools.ietf.org/html/rfc5280#section-4.2.1.3      https://tools.ietf.org/html/rfc5280#section-4.2.1.12")

  public List<String> getUsages() {
    return usages;
  }


  public void setUsages(List<String> usages) {
    this.usages = usages;
  }


  public VCertificateSigningRequestSpec username(String username) {

    this.username = username;
    return this;
  }

   /**
   * Information about the requesting user. See user.Info interface for details.
   * @return username
  **/

  @ApiModelProperty(value = "Information about the requesting user. See user.Info interface for details.")

  public String getUsername() {
    return username;
  }


  public void setUsername(String username) {
    this.username = username;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VCertificateSigningRequestSpec v1beta1CertificateSigningRequestSpec = (VCertificateSigningRequestSpec) o;
    return Objects.equals(this.extra, v1beta1CertificateSigningRequestSpec.extra) &&
        Objects.equals(this.groups, v1beta1CertificateSigningRequestSpec.groups) &&
        Arrays.equals(this.request, v1beta1CertificateSigningRequestSpec.request) &&
        Objects.equals(this.uid, v1beta1CertificateSigningRequestSpec.uid) &&
        Objects.equals(this.usages, v1beta1CertificateSigningRequestSpec.usages) &&
        Objects.equals(this.username, v1beta1CertificateSigningRequestSpec.username);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extra, groups, Arrays.hashCode(request), uid, usages, username);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CertificateSigningRequestSpec {\n");
    sb.append("    extra: ").append(toIndentedString(extra)).append("\n");
    sb.append("    groups: ").append(toIndentedString(groups)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    uid: ").append(toIndentedString(uid)).append("\n");
    sb.append("    usages: ").append(toIndentedString(usages)).append("\n");
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
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
