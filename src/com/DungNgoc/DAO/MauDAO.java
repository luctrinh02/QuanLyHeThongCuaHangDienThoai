/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.entitys.Mau;
import com.DungNgoc.entitys.PhienBan;
import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class MauDAO implements DungNgocDAO<Mau, String>{
    String insert = "insert into Mau values (?,?)";
    String update = "update Mau set colorName=? where colorid=?";
    String disable = "";
    String reStore = "";
    String select_ID = "select * from Mau where colorid=?";
    String select_All = "select * from Mau";
    String select_page = "select * from Mau\n"
            + "order by colorid\n"
            + "offset ?*10 rows\n"
            + "fetch next 11 rows only";
    String select_by_id = "select * from Mau where colorid=?";
    @Override
    public void insert(Mau entity) {
        Xjdbc.update(insert, entity.getColorId(),entity.getName());
    }

    @Override
    public void update(Mau entity) {
        Xjdbc.update(update, entity.getName(),entity.getColorId());
    }

    @Override
    public void disable(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void reStore(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Mau selectById(String id) {
        List<Mau> list = this.selectBySql(select_ID, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public List<Mau> selectByPage(int page) {
        return this.selectBySql(select_page, page);
    }

    @Override
    public List<Mau> selectAll() {
        return this.selectBySql(select_All);
    }

    @Override
    public List<Mau> selectBySql(String sql, Object... args) {
        List<Mau> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(new Mau(rs.getString(1),rs.getString(2)));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
 
    
}
