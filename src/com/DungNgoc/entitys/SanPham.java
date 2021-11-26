/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.entitys;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class SanPham {
    private String IdProduct;
    private String image;
    private String note;
    private int modelId;
    private String size;
    private String ram;
    private String colorId;
    private boolean isnew;
    private String versionId;
    private int count;
    private double price;
    private Date dateAdd;
    private boolean status;

    public SanPham() {
    }

    public SanPham(String IdProduct, String image, String note, int modelId, String size, String ram, String colorId, boolean isnew, String versionId, int count, double price, Date dateAdd, boolean status) {
        this.IdProduct = IdProduct;
        this.image = image;
        this.note = note;
        this.modelId = modelId;
        this.size = size;
        this.ram = ram;
        this.colorId = colorId;
        this.isnew = isnew;
        this.versionId = versionId;
        this.count = count;
        this.price = price;
        this.dateAdd = dateAdd;
        this.status = status;
    }

    public String getIdProduct() {
        return IdProduct;
    }

    public void setIdProduct(String IdProduct) {
        this.IdProduct = IdProduct;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getRam() {
        return ram;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public String getColorId() {
        return colorId;
    }

    public void setColorId(String colorId) {
        this.colorId = colorId;
    }

    public boolean isIsnew() {
        return isnew;
    }

    public void setIsnew(boolean isnew) {
        this.isnew = isnew;
    }

    public String getVersionId() {
        return versionId;
    }

    public void setVersionId(String versionId) {
        this.versionId = versionId;
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

    public Date getDateAdd() {
        return dateAdd;
    }

    public void setDateAdd(Date dateAdd) {
        this.dateAdd = dateAdd;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "SanPham{" + "IdProduct=" + IdProduct + ", image=" + image + ", note=" + note + ", modelId=" + modelId + ", size=" + size + ", ram=" + ram + ", colorId=" + colorId + ", isnew=" + isnew + ", versionId=" + versionId + ", count=" + count + ", price=" + price + ", dateAdd=" + dateAdd + ", status=" + status + '}';
    }
    
}
