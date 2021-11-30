/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.entitys.PhienBan;
import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class PhienBanDAO implements DungNgocDAO<PhienBan, String> {

    String insert = "insert into PhienBan values (?,?)";
    String update = "update PhienBan set name=? where versionId=?";
    String disable = "";
    String reStore = "";
    String select_ID = "select * from PhienBan where versionId=?";
    String select_All = "select * from PhienBan";
    String select_page = "select * from PhienBan\n"
            + "order by versionId\n"
            + "offset ?*10 rows\n"
            + "fetch next 11 rows only";

    @Override
    public void insert(PhienBan entity) {
        Xjdbc.update(insert, entity.getVersionId(),entity.getName());
    }

    @Override
    public void update(PhienBan entity) {
        Xjdbc.update(update, entity.getName(),entity.getVersionId());
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
    public PhienBan selectById(String id) {
        List<PhienBan> list = this.selectBySql(select_ID, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public List<PhienBan> selectByPage(int page) {
        return this.selectBySql(select_page, page);
    }

    @Override
    public List<PhienBan> selectAll() {
        return this.selectBySql(select_All);
    }

    @Override
    public List<PhienBan> selectBySql(String sql, Object... args) {
        List<PhienBan> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(new PhienBan(rs.getString(1),rs.getString(2)));
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

}
