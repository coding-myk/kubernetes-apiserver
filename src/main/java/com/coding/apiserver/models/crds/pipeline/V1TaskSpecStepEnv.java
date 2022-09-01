package com.coding.apiserver.models.crds.pipeline;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName: V1TaskSpecStepEnv
 * @Description:
 * @author: sihanqiu
 * @date: 2021年01月13日 18:47
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class V1TaskSpecStepEnv {

    /**
     * 变量名称
     */
    @SerializedName("name")
    private String name;

    /**
     * 变量值
     */
    @SerializedName("value")
    private String value;

    /***
    * @Title: fromTaskSpecStepEnv
    * @Description: 方法注释
    * @Param: 
    * @return: 
    * @Author: chenzhengwei
    * @Date: 2022/4/1
    */
    public static V1TaskSpecStepEnv fromTaskSpecStepEnv(String name, String value) {
        return new V1TaskSpecStepEnv(name, value);
    }
}
