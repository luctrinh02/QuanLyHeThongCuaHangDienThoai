/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.entitys.HoaDon;
import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HoaDonDAO implements DungNgocDAO<HoaDon, Integer>{
    String insert = "insert into HoaDon(IdGuest,date,totalMoney,promoCode,usePoint,IdStaff) values(?,?,?,?,?,?)";
    String update = "";
    String disable = "";
    String reStore = "";
    String select_ID = "select * from HoaDon where IdBill=?";
    String select_All = "select * from HoaDon";
    String select_page = "select * from HoaDon\n"
            + "order by IdBill\n"
            + "offset ?*10 rows\n"
            + "fetch next 11 rows only";
    String selectByIdGuest="select * from HoaDon where IdGuest=?";
    @Override
    public void insert(HoaDon entity) {
        Xjdbc.update(insert, entity.getIdGuest(),entity.getDateBill(),entity.getTotalMoney(),entity.getPromoCode(),entity.isUsepoint(),entity.getIdStaff());
    }

    @Override
    public void update(HoaDon entity) {
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
    public HoaDon selectById(Integer id) {
        List<HoaDon> list = this.selectBySql(select_ID, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public List<HoaDon> selectByPage(int page) {
        return this.selectBySql(select_page, page);
    }

    @Override
    public List<HoaDon> selectAll() {
        return this.selectBySql(select_All);
    }

    @Override
    public List<HoaDon> selectBySql(String sql, Object... args) {
       List<HoaDon> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(new HoaDon(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6), rs.getString(7)));
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<HoaDon> selectByIdGuest(String id){
        return this.selectBySql(selectByIdGuest,id);
    }
}
