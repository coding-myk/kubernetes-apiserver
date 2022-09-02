package com.coding.apiserver.resource;



import java.util.Map;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName VResource
 * @Description 自定义资源结构体 基础类
 * @date 2022/3/3 17:40
 */
public class VResource {

    /**
     * Kubeneters 资源 Kind, 注：需外部资源结构体指定
     */
    protected String k_resource;

    /**
     * 集群配置
     */
    private String cluster_config;

    /**
     * 集群 Id
     */
    private String clusterUuid;

    /**
     * 命名空间
     */
    private String namespace;

    /**
     * 资源名称
     */
    private String name;

    /**
     * fieldSelector
     */
    private String fieldSelector;

    /**
     * labelSelector
     */
    private String labelSelector;

    /**
     * 扩展字段(额外控制)
     */
    private Map<String, String> extensions;

    public String getK_resource() {
        return k_resource;
    }

    public String getClusterUuid() {
        return clusterUuid;
    }

    public void setClusterUuid(String clusterUuid) {
        this.clusterUuid = clusterUuid;
    }

    public String getNamespace() {
        return namespace;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCluster_config() {
        return cluster_config;
    }

    public void setCluster_config(String cluster_config) {
        this.cluster_config = cluster_config;
    }

    public String getFieldSelector() {
        return fieldSelector;
    }

    public void setFieldSelector(String fieldSelector) {
        this.fieldSelector = fieldSelector;
    }

    public String getLabelSelector() {
        return labelSelector;
    }

    public void setLabelSelector(String labelSelector) {
        this.labelSelector = labelSelector;
    }

    public Map<String, String> getExtensions() {
        return extensions;
    }

    public void setExtensions(Map<String, String> extensions) {
        this.extensions = extensions;
    }

    public void clear(){
        this.name = null;
        this.namespace = null;
        this.clusterUuid = null;
        this.fieldSelector = null;
        this.labelSelector = null;
        this.extensions = null;

        this.k_resource = null;
        this.cluster_config = null;
    }
}
