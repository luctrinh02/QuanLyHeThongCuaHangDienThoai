/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.entitys.HoaDonChiTiet;
import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonChiTietDAO implements DungNgocDAO<HoaDonChiTiet, Integer>{
    String insert = "insert into HoaDonCHiTiet values(?,?,?,?)";
    String update = "";
    String disable = "";
    String reStore = "";
    String select_ID = "select * from HoaDonCHiTiet where IdBill=? or IdProduct=?";
    String select_All = "select * from HoaDonCHiTiet";
    String select_page = "select * from HoaDonCHiTiet\n"
            + "order by IdBill\n"
            + "offset ?*10 rows\n"
            + "fetch next 11 rows only";
    @Override
    public void insert(HoaDonChiTiet entity) {
        Xjdbc.update(insert, entity.getIdBill(),entity.getIdProduct(),entity.getCount(),entity.getPrice());
    }

    @Override
    public void update(HoaDonChiTiet entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void disable(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reStore(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public HoaDonChiTiet selectById(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public List<HoaDonChiTiet> selectById(Integer id,String idProduct) {
         return this.selectBySql(select_ID, id,idProduct);
    }
    @Override
    public List<HoaDonChiTiet> selectByPage(int page) {
        return this.selectBySql(select_page, page);
    }

    @Override
    public List<HoaDonChiTiet> selectAll() {
        return this.selectBySql(select_All);
    }

    @Override
    public List<HoaDonChiTiet> selectBySql(String sql, Object... args) {
        List<HoaDonChiTiet> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(new HoaDonChiTiet(rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDouble(4)));
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
