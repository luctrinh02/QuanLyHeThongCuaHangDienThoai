/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.entitys.DongMay;
import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class DongMayDAO implements DungNgocDAO<DongMay, String> {

    String insert = "insert into DongMay values (?,?,?)";
    String update = "update DongMay set name=?,typeId=? where tag=?";
    String disable = "";
    String reStore = "";
    String select_ID = "select * from DongMay where tag=?";
    String select_All = "select * from DongMay";
    String select_page = "select * from DongMay\n"
            + "order by tag\n"
            + "offset ?*10 rows\n"
            + "fetch next 11 rows only";
    String select_by_HangMay = "select * from DongMay where typeId =?";

    @Override
    public void insert(DongMay entity) {
        Xjdbc.update(insert, entity.getTag(), entity.getName(), entity.getTypeId());
    }

    @Override
    public void update(DongMay entity) {
        Xjdbc.update(update, entity.getName(), entity.getTypeId(), entity.getTag());
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
    public DongMay selectById(String id) {
        List<DongMay> list = this.selectBySql(select_ID, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public List<DongMay> selectByPage(int page) {
        return this.selectBySql(select_page, page);
    }

    @Override
    public List<DongMay> selectAll() {
        return this.selectBySql(select_All);
    }

    @Override
    public List<DongMay> selectBySql(String sql, Object... args) {
        List<DongMay> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(new DongMay(rs.getString(1),rs.getString(2),rs.getString(3)));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<DongMay> selectByHangMay(String typeId){
        return this.selectBySql(select_by_HangMay, typeId);
    }



}
