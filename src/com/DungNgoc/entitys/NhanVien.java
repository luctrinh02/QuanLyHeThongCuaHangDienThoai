/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.entitys;

import java.security.SecureRandom;
import java.security.spec.KeySpec;
import java.util.Base64;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

/**
 *
 * @author Admin
 */
public class NhanVien {

    private String IdStaff;
    private String name;
    private String CCCD;
    private String phoneNumber;
    private String email;
    private String salt;
    private String hash;
    private boolean role;
    private boolean status;

    public NhanVien(String IdStaff, String name, String CCCD, String phoneNumber, String email, String salt, String hash, boolean role, boolean status) {
        this.IdStaff = IdStaff;
        this.name = name;
        this.CCCD = CCCD;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salt = salt;
        this.hash = hash;
        this.role = role;
        this.status = status;
    }

    public NhanVien() {
    }

    public String getIdStaff() {
        return IdStaff;
    }

    public void setIdStaff(String IdStaff) {
        this.IdStaff = IdStaff;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCCCD() {
        return CCCD;
    }

    public void setCCCD(String CCCD) {
        this.CCCD = CCCD;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "IdStaff=" + IdStaff + ", name=" + name + ", CCCD=" + CCCD + ", phoneNumber=" + phoneNumber + ", email=" + email + ", salt=" + salt + ", hash=" + hash + ", role=" + role + ", status=" + status + '}';
    }
}
