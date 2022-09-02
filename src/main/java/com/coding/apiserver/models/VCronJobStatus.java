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
import org.joda.time.DateTime;

/**
 * CronJobStatus represents the current state of a cron job.
 */
@ApiModel(description = "CronJobStatus represents the current state of a cron job.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VCronJobStatus {
  public static final String SERIALIZED_NAME_ACTIVE = "active";
  @SerializedName(SERIALIZED_NAME_ACTIVE)
  private List<VObjectReference> active = null;

  public static final String SERIALIZED_NAME_LAST_SCHEDULE_TIME = "lastScheduleTime";
  @SerializedName(SERIALIZED_NAME_LAST_SCHEDULE_TIME)
  private DateTime lastScheduleTime;


  public VCronJobStatus active(List<VObjectReference> active) {

    this.active = active;
    return this;
  }

  public VCronJobStatus addActiveItem(VObjectReference activeItem) {
    if (this.active == null) {
      this.active = new ArrayList<VObjectReference>();
    }
    this.active.add(activeItem);
    return this;
  }

   /**
   * A list of pointers to currently running jobs.
   * @return active
  **/

  @ApiModelProperty(value = "A list of pointers to currently running jobs.")

  public List<VObjectReference> getActive() {
    return active;
  }


  public void setActive(List<VObjectReference> active) {
    this.active = active;
  }


  public VCronJobStatus lastScheduleTime(DateTime lastScheduleTime) {

    this.lastScheduleTime = lastScheduleTime;
    return this;
  }

   /**
   * Information when was the last time the job was successfully scheduled.
   * @return lastScheduleTime
  **/

  @ApiModelProperty(value = "Information when was the last time the job was successfully scheduled.")

  public DateTime getLastScheduleTime() {
    return lastScheduleTime;
  }


  public void setLastScheduleTime(DateTime lastScheduleTime) {
    this.lastScheduleTime = lastScheduleTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VCronJobStatus v1beta1CronJobStatus = (VCronJobStatus) o;
    return Objects.equals(this.active, v1beta1CronJobStatus.active) &&
        Objects.equals(this.lastScheduleTime, v1beta1CronJobStatus.lastScheduleTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(active, lastScheduleTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1CronJobStatus {\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
    sb.append("    lastScheduleTime: ").append(toIndentedString(lastScheduleTime)).append("\n");
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
