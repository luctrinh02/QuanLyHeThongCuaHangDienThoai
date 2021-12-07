/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.untils.Xdate;
import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class doiTraDAO {
    String sql="insert into HoaDonDoiHang values (?,?,?,?)";
    public void them(int id,String ma,int so){
        Xjdbc.update(sql, id,ma,so,Xdate.toString(new Date(), "yyyy-MM-dd"));
    }
    public int getTraHang(int idbill){
        String sql="select count(*) as soLuong from HoaDonDoiHang where idbill=? ";
        try {
            ResultSet rs = Xjdbc.query(sql);
            rs.next();
            return rs.getInt(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
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
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
    public List<Object[]> getSP(int idbill){
        String sql = "{call hoaDonDoi(?)}";
        String[] cols = {"ma", "ten", "ram", "size","mau","moi","gia","so"};
        return this.getListOfArray(sql, cols, idbill);
    }
}
