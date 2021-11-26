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
public class SanPhamTable {
    private String ma;
    private String ten;
    private String ram;
    private String dungLuong;
    private String mau;
    private boolean tinhTrang;
    private double gia;
    private int soLuong;

    public SanPhamTable() {
    }

    public SanPhamTable(String ma, String ten, String ram, String dungLuong, String mau, boolean tinhTrang, double gia, int soLuong) {
        this.ma = ma;
        this.ten = ten;
        this.ram = ram;
        this.dungLuong = dungLuong;
        this.mau = mau;
        this.tinhTrang = tinhTrang;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(String dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public boolean isTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    
    
}
