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
public class HoaDonChiTiet {
    private int seri;
    private int idBill;
    private int idProduct;
    private int count;
    private double price;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int seri, int idBill, int idProduct, int count, double price) {
        this.seri = seri;
        this.idBill = idBill;
        this.idProduct = idProduct;
        this.count = count;
        this.price = price;
    }

    public int getSeri() {
        return seri;
    }

    public void setSeri(int seri) {
        this.seri = seri;
    }

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public int getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(int idProduct) {
        this.idProduct = idProduct;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "HoaDonChiTiet{" + "seri=" + seri + ", idBill=" + idBill + ", idProduct=" + idProduct + ", count=" + count + ", price=" + price + '}';
    }
    
}
