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
 * PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.
 */
@ApiModel(description = "PodStatus represents information about the status of a pod. Status may trail the actual state of a system, especially if the node that hosts the pod cannot contact the control plane.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-29T07:27:12.312Z[Etc/UTC]")
public class VPodStatus {
  public static final String SERIALIZED_NAME_CONDITIONS = "conditions";
  @SerializedName(SERIALIZED_NAME_CONDITIONS)
  private List<VPodCondition> conditions = null;

  public static final String SERIALIZED_NAME_CONTAINER_STATUSES = "containerStatuses";
  @SerializedName(SERIALIZED_NAME_CONTAINER_STATUSES)
  private List<VContainerStatus> containerStatuses = null;

  public static final String SERIALIZED_NAME_EPHEMERAL_CONTAINER_STATUSES = "ephemeralContainerStatuses";
  @SerializedName(SERIALIZED_NAME_EPHEMERAL_CONTAINER_STATUSES)
  private List<VContainerStatus> ephemeralContainerStatuses = null;

  public static final String SERIALIZED_NAME_HOST_I_P = "hostIP";
  @SerializedName(SERIALIZED_NAME_HOST_I_P)
  private String hostIP;

  public static final String SERIALIZED_NAME_INIT_CONTAINER_STATUSES = "initContainerStatuses";
  @SerializedName(SERIALIZED_NAME_INIT_CONTAINER_STATUSES)
  private List<VContainerStatus> initContainerStatuses = null;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_NOMINATED_NODE_NAME = "nominatedNodeName";
  @SerializedName(SERIALIZED_NAME_NOMINATED_NODE_NAME)
  private String nominatedNodeName;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_POD_I_P = "podIP";
  @SerializedName(SERIALIZED_NAME_POD_I_P)
  private String podIP;

  public static final String SERIALIZED_NAME_POD_I_PS = "podIPs";
  @SerializedName(SERIALIZED_NAME_POD_I_PS)
  private List<VPodIP> podIPs = null;

  public static final String SERIALIZED_NAME_QOS_CLASS = "qosClass";
  @SerializedName(SERIALIZED_NAME_QOS_CLASS)
  private String qosClass;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;

  public static final String SERIALIZED_NAME_START_TIME = "startTime";
  @SerializedName(SERIALIZED_NAME_START_TIME)
  private DateTime startTime;


  public VPodStatus conditions(List<VPodCondition> conditions) {

    this.conditions = conditions;
    return this;
  }

  public VPodStatus addConditionsItem(VPodCondition conditionsItem) {
    if (this.conditions == null) {
      this.conditions = new ArrayList<VPodCondition>();
    }
    this.conditions.add(conditionsItem);
    return this;
  }

   /**
   * Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions
   * @return conditions
  **/

  @ApiModelProperty(value = "Current service state of pod. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-conditions")

  public List<VPodCondition> getConditions() {
    return conditions;
  }


  public void setConditions(List<VPodCondition> conditions) {
    this.conditions = conditions;
  }


  public VPodStatus containerStatuses(List<VContainerStatus> containerStatuses) {

    this.containerStatuses = containerStatuses;
    return this;
  }

  public VPodStatus addContainerStatusesItem(VContainerStatus containerStatusesItem) {
    if (this.containerStatuses == null) {
      this.containerStatuses = new ArrayList<VContainerStatus>();
    }
    this.containerStatuses.add(containerStatusesItem);
    return this;
  }

   /**
   * The list has one entry per container in the manifest. Each entry is currently the output of &#x60;docker inspect&#x60;. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   * @return containerStatuses
  **/

  @ApiModelProperty(value = "The list has one entry per container in the manifest. Each entry is currently the output of `docker inspect`. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")

  public List<VContainerStatus> getContainerStatuses() {
    return containerStatuses;
  }


  public void setContainerStatuses(List<VContainerStatus> containerStatuses) {
    this.containerStatuses = containerStatuses;
  }


  public VPodStatus ephemeralContainerStatuses(List<VContainerStatus> ephemeralContainerStatuses) {

    this.ephemeralContainerStatuses = ephemeralContainerStatuses;
    return this;
  }

  public VPodStatus addEphemeralContainerStatusesItem(VContainerStatus ephemeralContainerStatusesItem) {
    if (this.ephemeralContainerStatuses == null) {
      this.ephemeralContainerStatuses = new ArrayList<VContainerStatus>();
    }
    this.ephemeralContainerStatuses.add(ephemeralContainerStatusesItem);
    return this;
  }

   /**
   * Status for any ephemeral containers that have run in this pod. This field is alpha-level and is only populated by servers that enable the EphemeralContainers feature.
   * @return ephemeralContainerStatuses
  **/

  @ApiModelProperty(value = "Status for any ephemeral containers that have run in this pod. This field is alpha-level and is only populated by servers that enable the EphemeralContainers feature.")

  public List<VContainerStatus> getEphemeralContainerStatuses() {
    return ephemeralContainerStatuses;
  }


  public void setEphemeralContainerStatuses(List<VContainerStatus> ephemeralContainerStatuses) {
    this.ephemeralContainerStatuses = ephemeralContainerStatuses;
  }


  public VPodStatus hostIP(String hostIP) {

    this.hostIP = hostIP;
    return this;
  }

   /**
   * IP address of the host to which the pod is assigned. Empty if not yet scheduled.
   * @return hostIP
  **/

  @ApiModelProperty(value = "IP address of the host to which the pod is assigned. Empty if not yet scheduled.")

  public String getHostIP() {
    return hostIP;
  }


  public void setHostIP(String hostIP) {
    this.hostIP = hostIP;
  }


  public VPodStatus initContainerStatuses(List<VContainerStatus> initContainerStatuses) {

    this.initContainerStatuses = initContainerStatuses;
    return this;
  }

  public VPodStatus addInitContainerStatusesItem(VContainerStatus initContainerStatusesItem) {
    if (this.initContainerStatuses == null) {
      this.initContainerStatuses = new ArrayList<VContainerStatus>();
    }
    this.initContainerStatuses.add(initContainerStatusesItem);
    return this;
  }

   /**
   * The list has one entry per init container in the manifest. The most recent successful init container will have ready &#x3D; true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status
   * @return initContainerStatuses
  **/

  @ApiModelProperty(value = "The list has one entry per init container in the manifest. The most recent successful init container will have ready = true, the most recently started container will have startTime set. More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-and-container-status")

  public List<VContainerStatus> getInitContainerStatuses() {
    return initContainerStatuses;
  }


  public void setInitContainerStatuses(List<VContainerStatus> initContainerStatuses) {
    this.initContainerStatuses = initContainerStatuses;
  }


  public VPodStatus message(String message) {

    this.message = message;
    return this;
  }

   /**
   * A human readable message indicating details about why the pod is in this condition.
   * @return message
  **/

  @ApiModelProperty(value = "A human readable message indicating details about why the pod is in this condition.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public VPodStatus nominatedNodeName(String nominatedNodeName) {

    this.nominatedNodeName = nominatedNodeName;
    return this;
  }

   /**
   * nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.
   * @return nominatedNodeName
  **/

  @ApiModelProperty(value = "nominatedNodeName is set only when this pod preempts other pods on the node, but it cannot be scheduled right away as preemption victims receive their graceful termination periods. This field does not guarantee that the pod will be scheduled on this node. Scheduler may decide to place the pod elsewhere if other nodes become available sooner. Scheduler may also decide to give the resources on this node to a higher priority pod that is created after preemption. As a result, this field may be different than PodSpec.nodeName when the pod is scheduled.")

  public String getNominatedNodeName() {
    return nominatedNodeName;
  }


  public void setNominatedNodeName(String nominatedNodeName) {
    this.nominatedNodeName = nominatedNodeName;
  }


  public VPodStatus phase(String phase) {

    this.phase = phase;
    return this;
  }

   /**
   * The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod&#39;s status. There are five possible phase values:  Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.  More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase
   * @return phase
  **/

  @ApiModelProperty(value = "The phase of a Pod is a simple, high-level summary of where the Pod is in its lifecycle. The conditions array, the reason and message fields, and the individual container status arrays contain more detail about the pod's status. There are five possible phase values:  Pending: The pod has been accepted by the Kubernetes system, but one or more of the container images has not been created. This includes time before being scheduled as well as time spent downloading images over the network, which could take a while. Running: The pod has been bound to a node, and all of the containers have been created. At least one container is still running, or is in the process of starting or restarting. Succeeded: All containers in the pod have terminated in success, and will not be restarted. Failed: All containers in the pod have terminated, and at least one container has terminated in failure. The container either exited with non-zero status or was terminated by the system. Unknown: For some reason the state of the pod could not be obtained, typically due to an error in communicating with the host of the pod.  More info: https://kubernetes.io/docs/concepts/workloads/pods/pod-lifecycle#pod-phase")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public VPodStatus podIP(String podIP) {

    this.podIP = podIP;
    return this;
  }

   /**
   * IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.
   * @return podIP
  **/

  @ApiModelProperty(value = "IP address allocated to the pod. Routable at least within the cluster. Empty if not yet allocated.")

  public String getPodIP() {
    return podIP;
  }


  public void setPodIP(String podIP) {
    this.podIP = podIP;
  }


  public VPodStatus podIPs(List<VPodIP> podIPs) {

    this.podIPs = podIPs;
    return this;
  }

  public VPodStatus addPodIPsItem(VPodIP podIPsItem) {
    if (this.podIPs == null) {
      this.podIPs = new ArrayList<VPodIP>();
    }
    this.podIPs.add(podIPsItem);
    return this;
  }

   /**
   * podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.
   * @return podIPs
  **/

  @ApiModelProperty(value = "podIPs holds the IP addresses allocated to the pod. If this field is specified, the 0th entry must match the podIP field. Pods may be allocated at most 1 value for each of IPv4 and IPv6. This list is empty if no IPs have been allocated yet.")

  public List<VPodIP> getPodIPs() {
    return podIPs;
  }


  public void setPodIPs(List<VPodIP> podIPs) {
    this.podIPs = podIPs;
  }


  public VPodStatus qosClass(String qosClass) {

    this.qosClass = qosClass;
    return this;
  }

   /**
   * The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md
   * @return qosClass
  **/

  @ApiModelProperty(value = "The Quality of Service (QOS) classification assigned to the pod based on resource requirements See PodQOSClass type for available QOS classes More info: https://git.k8s.io/community/contributors/design-proposals/node/resource-qos.md")

  public String getQosClass() {
    return qosClass;
  }


  public void setQosClass(String qosClass) {
    this.qosClass = qosClass;
  }


  public VPodStatus reason(String reason) {

    this.reason = reason;
    return this;
  }

   /**
   * A brief CamelCase message indicating details about why the pod is in this state. e.g. &#39;Evicted&#39;
   * @return reason
  **/

  @ApiModelProperty(value = "A brief CamelCase message indicating details about why the pod is in this state. e.g. 'Evicted'")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  public VPodStatus startTime(DateTime startTime) {

    this.startTime = startTime;
    return this;
  }

   /**
   * RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.
   * @return startTime
  **/

  @ApiModelProperty(value = "RFC 3339 date and time at which the object was acknowledged by the Kubelet. This is before the Kubelet pulled the container image(s) for the pod.")

  public DateTime getStartTime() {
    return startTime;
  }


  public void setStartTime(DateTime startTime) {
    this.startTime = startTime;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VPodStatus v1PodStatus = (VPodStatus) o;
    return Objects.equals(this.conditions, v1PodStatus.conditions) &&
        Objects.equals(this.containerStatuses, v1PodStatus.containerStatuses) &&
        Objects.equals(this.ephemeralContainerStatuses, v1PodStatus.ephemeralContainerStatuses) &&
        Objects.equals(this.hostIP, v1PodStatus.hostIP) &&
        Objects.equals(this.initContainerStatuses, v1PodStatus.initContainerStatuses) &&
        Objects.equals(this.message, v1PodStatus.message) &&
        Objects.equals(this.nominatedNodeName, v1PodStatus.nominatedNodeName) &&
        Objects.equals(this.phase, v1PodStatus.phase) &&
        Objects.equals(this.podIP, v1PodStatus.podIP) &&
        Objects.equals(this.podIPs, v1PodStatus.podIPs) &&
        Objects.equals(this.qosClass, v1PodStatus.qosClass) &&
        Objects.equals(this.reason, v1PodStatus.reason) &&
        Objects.equals(this.startTime, v1PodStatus.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(conditions, containerStatuses, ephemeralContainerStatuses, hostIP, initContainerStatuses, message, nominatedNodeName, phase, podIP, podIPs, qosClass, reason, startTime);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PodStatus {\n");
    sb.append("    conditions: ").append(toIndentedString(conditions)).append("\n");
    sb.append("    containerStatuses: ").append(toIndentedString(containerStatuses)).append("\n");
    sb.append("    ephemeralContainerStatuses: ").append(toIndentedString(ephemeralContainerStatuses)).append("\n");
    sb.append("    hostIP: ").append(toIndentedString(hostIP)).append("\n");
    sb.append("    initContainerStatuses: ").append(toIndentedString(initContainerStatuses)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    nominatedNodeName: ").append(toIndentedString(nominatedNodeName)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    podIP: ").append(toIndentedString(podIP)).append("\n");
    sb.append("    podIPs: ").append(toIndentedString(podIPs)).append("\n");
    sb.append("    qosClass: ").append(toIndentedString(qosClass)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
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
