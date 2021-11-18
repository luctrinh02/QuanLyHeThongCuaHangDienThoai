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
public class HangMay {
    private String typeID;
    private String name;

    public HangMay() {
    }

    public HangMay(String typeID, String name) {
        this.typeID = typeID;
        this.name = name;
    }

    public String getTypeID() {
        return typeID;
    }

    public void setTypeID(String typeID) {
        this.typeID = typeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

 

    @Override
    public String toString() {
        return "HangMay{" + "typeID=" + typeID + ", name=" + name + '}';
    }
    
}
