/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.untils;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class Xcheck {
    public static boolean isNotName(String name){
        Pattern number = Pattern.compile("[0-9]");
        Pattern special = Pattern.compile("[!@#$%&*().;_+=|<>?/{}\\[\\]~-]");
        Matcher hasNumber = number.matcher(name);
        Matcher hasSpecial = special.matcher(name);
        return (hasNumber.find() || hasSpecial.find());
    }
    public static boolean isSDT(String sdt){
//        String reg = "^(0|\\+84)(\\s|\\.)?((3[2-9])|(5[689])|(7[06-9])|(8[1-689])|(9[0-46-9]))(\\d)(\\s|\\.)?(\\d{3})(\\s|\\.)?(\\d{3})$";
        String reg="0[0-9]{9}";
        return sdt.matches(reg);
    }
    public static boolean isCCCD(String cccd){
        String reg="[0-9]{12}";
        return cccd.matches(reg);
    }
    public static boolean isEmail(String email){
        String reg="^([a-z0-9_\\.-]+)@([\\da-z\\.-]+)\\.([a-z\\.]{2,6})$";
        return email.matches(reg);
    }
}
