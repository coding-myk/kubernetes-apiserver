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
 * SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it&#39;s safe to assume the subject has that permission, even if that list is incomplete.
 */
@ApiModel(description = "SubjectRulesReviewStatus contains the result of a rules check. This check can be incomplete depending on the set of authorizers the server is configured with and any errors experienced during evaluation. Because authorization rules are additive, if a rule appears in a list it's safe to assume the subject has that permission, even if that list is incomplete.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VSubjectRulesReviewStatus {
  public static final String SERIALIZED_NAME_EVALUATION_ERROR = "evaluationError";
  @SerializedName(SERIALIZED_NAME_EVALUATION_ERROR)
  private String evaluationError;

  public static final String SERIALIZED_NAME_INCOMPLETE = "incomplete";
  @SerializedName(SERIALIZED_NAME_INCOMPLETE)
  private Boolean incomplete;

  public static final String SERIALIZED_NAME_NON_RESOURCE_RULES = "nonResourceRules";
  @SerializedName(SERIALIZED_NAME_NON_RESOURCE_RULES)
  private List<VNonResourceRule> nonResourceRules = new ArrayList<VNonResourceRule>();

  public static final String SERIALIZED_NAME_RESOURCE_RULES = "resourceRules";
  @SerializedName(SERIALIZED_NAME_RESOURCE_RULES)
  private List<VResourceRule> resourceRules = new ArrayList<VResourceRule>();


  public VSubjectRulesReviewStatus evaluationError(String evaluationError) {

    this.evaluationError = evaluationError;
    return this;
  }

   /**
   * EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn&#39;t support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.
   * @return evaluationError
  **/

  @ApiModelProperty(value = "EvaluationError can appear in combination with Rules. It indicates an error occurred during rule evaluation, such as an authorizer that doesn't support rule evaluation, and that ResourceRules and/or NonResourceRules may be incomplete.")

  public String getEvaluationError() {
    return evaluationError;
  }


  public void setEvaluationError(String evaluationError) {
    this.evaluationError = evaluationError;
  }


  public VSubjectRulesReviewStatus incomplete(Boolean incomplete) {

    this.incomplete = incomplete;
    return this;
  }

   /**
   * Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn&#39;t support rules evaluation.
   * @return incomplete
  **/
  @ApiModelProperty(required = true, value = "Incomplete is true when the rules returned by this call are incomplete. This is most commonly encountered when an authorizer, such as an external authorizer, doesn't support rules evaluation.")

  public Boolean getIncomplete() {
    return incomplete;
  }


  public void setIncomplete(Boolean incomplete) {
    this.incomplete = incomplete;
  }


  public VSubjectRulesReviewStatus nonResourceRules(List<VNonResourceRule> nonResourceRules) {

    this.nonResourceRules = nonResourceRules;
    return this;
  }

  public VSubjectRulesReviewStatus addNonResourceRulesItem(VNonResourceRule nonResourceRulesItem) {
    this.nonResourceRules.add(nonResourceRulesItem);
    return this;
  }

   /**
   * NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
   * @return nonResourceRules
  **/
  @ApiModelProperty(required = true, value = "NonResourceRules is the list of actions the subject is allowed to perform on non-resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.")

  public List<VNonResourceRule> getNonResourceRules() {
    return nonResourceRules;
  }


  public void setNonResourceRules(List<VNonResourceRule> nonResourceRules) {
    this.nonResourceRules = nonResourceRules;
  }


  public VSubjectRulesReviewStatus resourceRules(List<VResourceRule> resourceRules) {

    this.resourceRules = resourceRules;
    return this;
  }

  public VSubjectRulesReviewStatus addResourceRulesItem(VResourceRule resourceRulesItem) {
    this.resourceRules.add(resourceRulesItem);
    return this;
  }

   /**
   * ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn&#39;t significant, may contain duplicates, and possibly be incomplete.
   * @return resourceRules
  **/
  @ApiModelProperty(required = true, value = "ResourceRules is the list of actions the subject is allowed to perform on resources. The list ordering isn't significant, may contain duplicates, and possibly be incomplete.")

  public List<VResourceRule> getResourceRules() {
    return resourceRules;
  }


  public void setResourceRules(List<VResourceRule> resourceRules) {
    this.resourceRules = resourceRules;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VSubjectRulesReviewStatus v1SubjectRulesReviewStatus = (VSubjectRulesReviewStatus) o;
    return Objects.equals(this.evaluationError, v1SubjectRulesReviewStatus.evaluationError) &&
        Objects.equals(this.incomplete, v1SubjectRulesReviewStatus.incomplete) &&
        Objects.equals(this.nonResourceRules, v1SubjectRulesReviewStatus.nonResourceRules) &&
        Objects.equals(this.resourceRules, v1SubjectRulesReviewStatus.resourceRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(evaluationError, incomplete, nonResourceRules, resourceRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1SubjectRulesReviewStatus {\n");
    sb.append("    evaluationError: ").append(toIndentedString(evaluationError)).append("\n");
    sb.append("    incomplete: ").append(toIndentedString(incomplete)).append("\n");
    sb.append("    nonResourceRules: ").append(toIndentedString(nonResourceRules)).append("\n");
    sb.append("    resourceRules: ").append(toIndentedString(resourceRules)).append("\n");
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

