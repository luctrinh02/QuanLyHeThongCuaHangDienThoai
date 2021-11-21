/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.entitys.LoaiMay;
import com.DungNgoc.entitys.PhienBan;
import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class LoaiMayDAO implements DungNgocDAO<LoaiMay, Integer> {

    String insert = "insert into LoaiMay values (?,?,?)";
    String update = "update LoaiMay set tag=?,name=? where modelId=?";
    String disable = "";
    String reStore = "";
    String select_ID = "select * from LoaiMay where modelId=?";
    String select_All = "select * from LoaiMay";
    String select_page = "select * from LoaiMay\n"
            + "order by modelId\n"
            + "offset ?*10 rows\n"
            + "fetch next 11 rows only";

    @Override
    public void insert(LoaiMay entity) {
        Xjdbc.update(insert, entity.getModelId(), entity.getTag(), entity.getName());
    }

    @Override
    public void update(LoaiMay entity) {
        Xjdbc.update(update, entity.getTag(), entity.getName(), entity.getModelId());
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
    public LoaiMay selectById(Integer id) {
        List<LoaiMay> list = this.selectBySql(select_ID, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public List<LoaiMay> selectByPage(int page) {
        return this.selectBySql(select_page, page);
    }

    @Override
    public List<LoaiMay> selectAll() {
        return this.selectBySql(select_All);
    }

    @Override
    public List<LoaiMay> selectBySql(String sql, Object... args) {
        List<LoaiMay> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(new LoaiMay(rs.getString(1), rs.getString(2), rs.getString(3)));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
