/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Admin
 */
public class BaoCaoDAO {

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

    public List<Object[]> baoCaoSanPham(String date) {
        String sql = "{call baoCaoHangHoa(?)}";
        String[] cols = {"Mã", "Tên", "Số lượng", "Doanh thu"};
        return this.getListOfArray(sql, cols, date);
    }

    public Date getDate() {
        String sql = "select MIN(date) 'date' from HoaDon";
        try {
            ResultSet rs = Xjdbc.query(sql);
            rs.next();
            return rs.getDate(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getSoGiaoDich(String date) {
        String sql = "select COUNT(*) from HoaDon where date=?";
        try {
            ResultSet rs = Xjdbc.query(sql, date);
            rs.next();
            return rs.getInt(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public int getSoSanPham(String date) {
        String sql = "select sum(count) from HoaDonCHiTiet a join HoaDon b on a.IdBill=b.IdBill where date=?";
        try {
            ResultSet rs = Xjdbc.query(sql, date);
            rs.next();
            return rs.getInt(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String[] getMax(String date) {
        String sql = "select top 1 IdProduct,count(IdProduct) from  HoaDonCHiTiet a join HoaDon b on a.IdBill=b.IdBill\n"
                + "where date=?\n"
                + "group by IdProduct\n"
                + "order by count(IdProduct) desc ";
        try {
            ResultSet rs = Xjdbc.query(sql, date);
            rs.next();
            String[] max=new String[2];
            max[0]=rs.getString(1);
            max[1]=rs.getString(2);
            return max;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public String getName(String name){
        String sql="select name from SanPham a join LoaiMay b on a.modelId =b.modelId where IdProduct=?";
        try {
            ResultSet rs = Xjdbc.query(sql, name);
            rs.next();
            return rs.getString(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public double getDoanhThu(String date){
        String sql="select sum(price*count) from HoaDonCHiTiet a join HoaDon b on a.IdBill=b.IdBill where date=?";
        try {
            ResultSet rs = Xjdbc.query(sql, date);
            rs.next();
            return rs.getDouble(1);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
