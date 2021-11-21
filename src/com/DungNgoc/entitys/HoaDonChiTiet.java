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
    private int idBill;
    private String idProduct;
    private int count;
    private double price;

    public HoaDonChiTiet() {
    }

    public HoaDonChiTiet(int idBill, String idProduct, int count, double price) {
        this.idBill = idBill;
        this.idProduct = idProduct;
        this.count = count;
        this.price = price;
    }

    public int getIdBill() {
        return idBill;
    }

    public void setIdBill(int idBill) {
        this.idBill = idBill;
    }

    public String getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(String idProduct) {
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
        return "HoaDonChiTiet{" + ", idBill=" + idBill + ", idProduct=" + idProduct + ", count=" + count + ", price=" + price + '}';
    }
    
}
