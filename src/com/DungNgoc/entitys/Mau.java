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
public class Mau {
    private String colorId;
    private String name;

    public Mau() {
    }

    public Mau(String colorId, String name) {
        this.colorId = colorId;
        this.name = name;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "Mau{" + "colorId=" + colorId + ", name=" + name +'}';
    }
    
}
