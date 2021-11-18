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
public class MaKhuyenMai {
    private String promoCode;
    private int value;
    private boolean status;

    public MaKhuyenMai() {
    }

    public MaKhuyenMai(String promoCode, int value, boolean status) {
        this.promoCode = promoCode;
        this.value = value;
        this.status = status;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "MaKhuyenMai{" + "promoCode=" + promoCode + ", value=" + value + ", status=" + status + '}';
    }
    
}
