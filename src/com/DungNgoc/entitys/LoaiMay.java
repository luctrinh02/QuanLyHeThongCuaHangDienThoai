/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.entitys;

/**
 *
 * @author Admin
 */
public class LoaiMay {
    private String modelId;
    private String tag;
    private String name;

    public LoaiMay() {
    }

    public LoaiMay(String modelId, String tag, String name) {
        this.modelId = modelId;
        this.tag = tag;
        this.name = name;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "LoaiMay{" + "modelId=" + modelId + ", tag=" + tag + ", name=" + name + '}';
    }
    
}
