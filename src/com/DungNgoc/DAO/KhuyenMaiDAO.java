/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.entitys.MaKhuyenMai;
import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhuyenMaiDAO implements DungNgocDAO<MaKhuyenMai, String>{
    String insert = "insert into MaKhuyenMai values(?,?,1)";
    String update = "update MaKhuyenMai set value=? where promoCode=?";
    String disable = "update MaKhuyenMai set status=0 where promoCode=?";
    String reStore = "update MaKhuyenMai set status=1 where promoCode=?";
    String select_ID = "select * from MaKhuyenMai where promoCode=?";
    String select_All = "select * from MaKHuyenMai";
    String select_page = "select * from MaKhuyenMai\n"
            + "order by promoCOde\n"
            + "offset ?*10 rows\n"
            + "fetch next 11 rows only";

    @Override
    public void insert(MaKhuyenMai entity) {
        Xjdbc.update(insert, entity.getPromoCode(),entity.getValue(),1);
    }

    @Override
    public void update(MaKhuyenMai entity) {
        Xjdbc.update(update, entity.getValue(),entity.getPromoCode());
    }

    @Override
    public void disable(String id) {
        Xjdbc.update(disable, id);
    }

    @Override
    public void reStore(String id) {
        Xjdbc.update(reStore, id);
    }

    @Override
    public MaKhuyenMai selectById(String id) {
        List<MaKhuyenMai> list = this.selectBySql(select_ID, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public List<MaKhuyenMai> selectByPage(int page) {
        return this.selectBySql(select_page, page);
    }

    @Override
    public List<MaKhuyenMai> selectAll() {
        return this.selectBySql(select_All);
    }

    @Override
    public List<MaKhuyenMai> selectBySql(String sql, Object... args) {
        List<MaKhuyenMai> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(new MaKhuyenMai(rs.getString(1), rs.getInt(2), rs.getBoolean(3)));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
