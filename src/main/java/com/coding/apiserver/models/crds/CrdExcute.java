package com.coding.apiserver.models.crds;

import com.coding.apiserver.resource.VResource;

/**
 * @author chenzhengwei
 * @version 1.0
 * @ClassName CrdExcute
 * @Description java类作用描述
 * @date 2022/4/20 14:15
 */
public class CrdExcute extends VResource {

    private String path;

    private String method;

    private String body;

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
