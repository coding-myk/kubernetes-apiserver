package com.coding.apiserver.models.crds.servicemonitor;


import com.coding.apiserver.custom.IntOrString;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName V1ServiceMonitorEndpoint
 * @Description ServcieMonitor资源对象-spec-endpoint
 * @date 2021/6/9 11:52
 */
@ApiModel(
        description = "ServcieMonitor资源对象-spec-endpoint"
)
public class V1ServiceMonitorEndpoint {

    /**
     * HonorLabels chooses the metric's labels on collisions with target labels.
     */
    @SerializedName("honorLabels")
    private Boolean honorLabels;

    /**
     * Interval at which metrics should be scraped
     */
    @SerializedName("interval")
    private String interval;

    /**
     * HTTP path to scrape for metrics.
     */
    @SerializedName("path")
    private String path;

    /**
     * Name of the service port this endpoint refers to. Mutually exclusive with targetPort.
     */
    @SerializedName("port")
    private String port;

    /**
     * Name or number of the target port of the Pod behind the Service, the port must be specified with container port property. Mutually exclusive with port.
     */
    @SerializedName("targetPort")
    private IntOrString targetPort;

    /**
     * HTTP scheme to use for scraping.
     */
    @SerializedName("scheme")
    private String scheme;

    /**
     * Timeout after which the scrape is ended
     */
    @SerializedName("scrapeTimeout")
    private String scrapeTimeout;

    public Boolean getHonorLabels() {
        return honorLabels;
    }

    public void setHonorLabels(Boolean honorLabels) {
        this.honorLabels = honorLabels;
    }

    public String getInterval() {
        return interval;
    }

    public void setInterval(String interval) {
        this.interval = interval;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public IntOrString getTargetPort() {
        return targetPort;
    }

    public void setTargetPort(IntOrString targetPort) {
        this.targetPort = targetPort;
    }

    public String getScheme() {
        return scheme;
    }

    public void setScheme(String scheme) {
        this.scheme = scheme;
    }

    public String getScrapeTimeout() {
        return scrapeTimeout;
    }

    public void setScrapeTimeout(String scrapeTimeout) {
        this.scrapeTimeout = scrapeTimeout;
    }
}
