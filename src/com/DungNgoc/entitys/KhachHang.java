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
public class KhachHang {
    private String idGuest;
    private String name;
    private double totalMoney;
    private double point;
    private boolean status;

    public KhachHang() {
    }

    public KhachHang(String idGuest, String name, double totalMoney, double point, boolean status) {
        this.idGuest = idGuest;
        this.name = name;
        this.totalMoney = totalMoney;
        this.point = point;
        this.status = status;
    }

    public String getIdGuest() {
        return idGuest;
    }

    public void setIdGuest(String idGuest) {
        this.idGuest = idGuest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "KhachHang{" + "idGuest=" + idGuest + ", name=" + name + ", totalMoney=" + totalMoney + ", point=" + point + ", status=" + status + '}';
    }

}
