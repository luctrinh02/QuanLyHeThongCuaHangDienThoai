/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.entitys.HangMay;
import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class HangMayDAO implements DungNgocDAO<HangMay, String> {

    String insert = "insert into HangMay values (?,?)";
    String update = "update HangMay set name=? where typeId=?";
    String disable = "";
    String reStore = "";
    String select_ID = "select * from HangMay where typeId=?";
    String select_All = "select * from HangMay";
    String select_page = "select * from HangMay\n"
            + "order by typeId\n"
            + "offset ?*10 rows\n"
            + "fetch next 11 rows only";

    @Override
    public void insert(HangMay entity) {
        Xjdbc.update(insert, entity.getTypeID(), entity.getName());
    }

    @Override
    public void update(HangMay entity) {
        Xjdbc.update(update, entity.getName(), entity.getTypeID());
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
    public HangMay selectById(String id) {
        List<HangMay> list = this.selectBySql(select_ID, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public List<HangMay> selectByPage(int page) {
        return this.selectBySql(select_page, page);
    }

    @Override
    public List<HangMay> selectAll() {
        return this.selectBySql(select_All);
    }

    @Override
    public List<HangMay> selectBySql(String sql, Object... args) {
        List<HangMay> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(new HangMay(rs.getString(1), rs.getString(2)));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
