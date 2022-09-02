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

import com.coding.apiserver.resource.VResource;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.util.ArrayList;
import java.util.List;

/**
 * ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets
 */
@ApiModel(description = "ServiceAccount binds together: * a name, understood by users, and perhaps by peripheral systems, for an identity * a principal that can be authenticated and authorized * a set of secrets")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VServiceAccount extends VResource {

  public static final String resourceName = "serviceaccount";

  public VServiceAccount() {
    super();
    super.k_resource = resourceName;
  }

  public static final String SERIALIZED_NAME_API_VERSION = "apiVersion";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN = "automountServiceAccountToken";
  @SerializedName(SERIALIZED_NAME_AUTOMOUNT_SERVICE_ACCOUNT_TOKEN)
  private Boolean automountServiceAccountToken;

  public static final String SERIALIZED_NAME_IMAGE_PULL_SECRETS = "imagePullSecrets";
  @SerializedName(SERIALIZED_NAME_IMAGE_PULL_SECRETS)
  private List<VLocalObjectReference> imagePullSecrets = null;

  public static final String SERIALIZED_NAME_KIND = "kind";
  @SerializedName(SERIALIZED_NAME_KIND)
  private String kind;

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private VObjectMeta metadata;

  public static final String SERIALIZED_NAME_SECRETS = "secrets";
  @SerializedName(SERIALIZED_NAME_SECRETS)
  private List<VObjectReference> secrets = null;


  public VServiceAccount apiVersion(String apiVersion) {

    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources
   * @return apiVersion
  **/

  @ApiModelProperty(value = "APIVersion defines the versioned schema of this representation of an object. Servers should convert recognized schemas to the latest internal value, and may reject unrecognized values. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#resources")

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public VServiceAccount automountServiceAccountToken(Boolean automountServiceAccountToken) {

    this.automountServiceAccountToken = automountServiceAccountToken;
    return this;
  }

   /**
   * AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.
   * @return automountServiceAccountToken
  **/

  @ApiModelProperty(value = "AutomountServiceAccountToken indicates whether pods running as this service account should have an API token automatically mounted. Can be overridden at the pod level.")

  public Boolean getAutomountServiceAccountToken() {
    return automountServiceAccountToken;
  }


  public void setAutomountServiceAccountToken(Boolean automountServiceAccountToken) {
    this.automountServiceAccountToken = automountServiceAccountToken;
  }


  public VServiceAccount imagePullSecrets(List<VLocalObjectReference> imagePullSecrets) {

    this.imagePullSecrets = imagePullSecrets;
    return this;
  }

  public VServiceAccount addImagePullSecretsItem(VLocalObjectReference imagePullSecretsItem) {
    if (this.imagePullSecrets == null) {
      this.imagePullSecrets = new ArrayList<VLocalObjectReference>();
    }
    this.imagePullSecrets.add(imagePullSecretsItem);
    return this;
  }

   /**
   * ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod
   * @return imagePullSecrets
  **/

  @ApiModelProperty(value = "ImagePullSecrets is a list of references to secrets in the same namespace to use for pulling any images in pods that reference this ServiceAccount. ImagePullSecrets are distinct from Secrets because Secrets can be mounted in the pod, but ImagePullSecrets are only accessed by the kubelet. More info: https://kubernetes.io/docs/concepts/containers/images/#specifying-imagepullsecrets-on-a-pod")

  public List<VLocalObjectReference> getImagePullSecrets() {
    return imagePullSecrets;
  }


  public void setImagePullSecrets(List<VLocalObjectReference> imagePullSecrets) {
    this.imagePullSecrets = imagePullSecrets;
  }


  public VServiceAccount kind(String kind) {

    this.kind = kind;
    return this;
  }

   /**
   * Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds
   * @return kind
  **/

  @ApiModelProperty(value = "Kind is a string value representing the REST resource this object represents. Servers may infer this from the endpoint the client submits requests to. Cannot be updated. In CamelCase. More info: https://git.k8s.io/community/contributors/devel/sig-architecture/api-conventions.md#types-kinds")

  public String getKind() {
    return kind;
  }


  public void setKind(String kind) {
    this.kind = kind;
  }


  public VServiceAccount metadata(VObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/

  @ApiModelProperty(value = "")

  public VObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(VObjectMeta metadata) {
    this.metadata = metadata;
  }


  public VServiceAccount secrets(List<VObjectReference> secrets) {

    this.secrets = secrets;
    return this;
  }

  public VServiceAccount addSecretsItem(VObjectReference secretsItem) {
    if (this.secrets == null) {
      this.secrets = new ArrayList<VObjectReference>();
    }
    this.secrets.add(secretsItem);
    return this;
  }

   /**
   * Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret
   * @return secrets
  **/

  @ApiModelProperty(value = "Secrets is the list of secrets allowed to be used by pods running using this ServiceAccount. More info: https://kubernetes.io/docs/concepts/configuration/secret")

  public List<VObjectReference> getSecrets() {
    return secrets;
  }


  public void setSecrets(List<VObjectReference> secrets) {
    this.secrets = secrets;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VServiceAccount v1ServiceAccount = (VServiceAccount) o;
    return Objects.equals(this.apiVersion, v1ServiceAccount.apiVersion) &&
        Objects.equals(this.automountServiceAccountToken, v1ServiceAccount.automountServiceAccountToken) &&
        Objects.equals(this.imagePullSecrets, v1ServiceAccount.imagePullSecrets) &&
        Objects.equals(this.kind, v1ServiceAccount.kind) &&
        Objects.equals(this.metadata, v1ServiceAccount.metadata) &&
        Objects.equals(this.secrets, v1ServiceAccount.secrets);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, automountServiceAccountToken, imagePullSecrets, kind, metadata, secrets);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1ServiceAccount {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    automountServiceAccountToken: ").append(toIndentedString(automountServiceAccountToken)).append("\n");
    sb.append("    imagePullSecrets: ").append(toIndentedString(imagePullSecrets)).append("\n");
    sb.append("    kind: ").append(toIndentedString(kind)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    secrets: ").append(toIndentedString(secrets)).append("\n");
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

