/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class thongKeKhachHangDAO {
    private List<Object[]> getListOfArray(String sql, String[] cols, Object... args) {
        try {
            List<Object[]> list = new ArrayList<>();
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                Object[] vals = new Object[cols.length];
                for (int i = 0; i < cols.length; i++) {
                    vals[i] = rs.getObject(cols[i]);
                }
                list.add(vals);
            }
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<Object[]> thongKeKhachHang() {
        String sql = "{call thongKeKhachHang}";
        String[] cols = {"Ma", "Ten", "Tien", "SoLuong"};
        return this.getListOfArray(sql, cols);
    }
    public List<Object[]> top5() {
        String sql = "{call top5}";
        String[] cols = {"Ma", "Ten", "Tien", "SoLuong"};
        return this.getListOfArray(sql, cols);
    }
}
