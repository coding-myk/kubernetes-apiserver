package com.coding.apiserver.models.crds.servicemonitor;

import com.coding.apiserver.models.VLabelSelector;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName V1ServiceMonitorSpec
 * @Description ServcieMonitor资源对象-spec
 * @date 2021/6/9 11:45
 */
@ApiModel(
        description = "ServcieMonitor资源对象-spec"
)
public class V1ServiceMonitorSpec {

    /**
     * The label to use to retrieve the job name from.
     */
    @SerializedName("jobLabel")
    private String jobLabel;

    /**
     * SampleLimit defines per-scrape limit on number of scraped samples that will be accepted.
     */
    @SerializedName("sampleLimit")
    private Integer sampleLimit;

    /**
     * A list of endpoints allowed as part of this ServiceMonitor.
     */
    @SerializedName("endpoints")
    private List<V1ServiceMonitorEndpoint> endpoints;

    /**
     * Selector to select which namespaces the Endpoints objects are discovered from.
     */
    @SerializedName("namespaceSelector")
    private V1ServiceMonitorNamespaceSelector namespaceSelector;

    /**
     * Selector to select Endpoints objects.
     */
    @SerializedName("selector")
    private VLabelSelector selector;

    public String getJobLabel() {
        return jobLabel;
    }

    public void setJobLabel(String jobLabel) {
        this.jobLabel = jobLabel;
    }

    public Integer getSampleLimit() {
        return sampleLimit;
    }

    public void setSampleLimit(Integer sampleLimit) {
        this.sampleLimit = sampleLimit;
    }

    public List<V1ServiceMonitorEndpoint> getEndpoints() {
        return endpoints;
    }

    public void setEndpoints(List<V1ServiceMonitorEndpoint> endpoints) {
        this.endpoints = endpoints;
    }

    public V1ServiceMonitorNamespaceSelector getNamespaceSelector() {
        return namespaceSelector;
    }

    public void setNamespaceSelector(V1ServiceMonitorNamespaceSelector namespaceSelector) {
        this.namespaceSelector = namespaceSelector;
    }

    public VLabelSelector getSelector() {
        return selector;
    }

    public void setSelector(VLabelSelector selector) {
        this.selector = selector;
    }
}
