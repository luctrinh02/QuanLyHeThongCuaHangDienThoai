/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.untils;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author Admin
 */
public class Xmoney {
    public static String moneyToString(double money){
        Locale localeVN = new Locale("vi", "VN");
        NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localeVN);
        String str1 = currencyVN.format(money);
        return str1;
    }
}
