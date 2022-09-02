package com.coding.apiserver.models.crds.servicemonitor;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;

import java.util.List;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName V1ServiceMonitorNamespaceSelector
 * @Description ServcieMonitor资源对象-spec-NamespaceSelector
 * @date 2021/6/9 14:07
 */
@ApiModel(
        description = "ServcieMonitor资源对象-spec-NamespaceSelector"
)
public class V1ServiceMonitorNamespaceSelector {

    /**
     * Boolean describing whether all namespaces are selected in contrast to a list restricting them.
     */
    @SerializedName("any")
    private Boolean any;

    /**
     * List of namespace names.
     */
    @SerializedName("matchNames")
    private List<String> matchNames;

    public Boolean getAny() {
        return any;
    }

    public void setAny(Boolean any) {
        this.any = any;
    }

    public List<String> getMatchNames() {
        return matchNames;
    }

    public void setMatchNames(List<String> matchNames) {
        this.matchNames = matchNames;
    }
}
