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
public class HoaDon {
    private int idBill;
    private String idGuest;
    private String dateBill;
    private String totalMoney;
    private String promoCode;
    private String usepoint;
    private String idStaff;

    public HoaDon() {
    }

    public HoaDon(int idBill, String idGuest, String dateBill, String totalMoney, String promoCode, String usepoint, String idStaff) {
        this.idBill = idBill;
        this.idGuest = idGuest;
        this.dateBill = dateBill;
        this.totalMoney = totalMoney;
        this.promoCode = promoCode;
        this.usepoint = usepoint;
        this.idStaff = idStaff;
    }

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public String getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(String idGuest) {
        this.idGuest = idGuest;
    }

    public String getDateBill() {
        return dateBill;
    }

    public void setDateBill(String dateBill) {
        this.dateBill = dateBill;
    }

    public String getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(String totalMoney) {
        this.totalMoney = totalMoney;
    }

    public String getPromoCode() {
        return promoCode;
    }

    public void setPromoCode(String promoCode) {
        this.promoCode = promoCode;
    }

    public String getUsepoint() {
        return usepoint;
    }

    public void setUsepoint(String usepoint) {
        this.usepoint = usepoint;
    }

    public String getIdStaff() {
        return idStaff;
    }

    public void setIdStaff(String idStaff) {
        this.idStaff = idStaff;
    }

    @Override
    public String toString() {
        return "HoaDon{" + "idBill=" + idBill + ", idGuest=" + idGuest + ", dateBill=" + dateBill + ", totalMoney=" + totalMoney + ", promoCode=" + promoCode + ", usepoint=" + usepoint + ", idStaff=" + idStaff + '}';
    }
    
}
