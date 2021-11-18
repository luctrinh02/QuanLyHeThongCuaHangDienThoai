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
public class PhienBan {
    private String versionId;
    private String name;

    public PhienBan() {
    }

    public PhienBan(String versionId, String name) {
        this.versionId = versionId;
        this.name = name;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "PhienBan{" + "versionId=" + versionId + ", name=" + name + '}';
    }
    
}
