/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.entitys.NhanVien;
import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class NhanVienDAO implements DungNgocDAO<NhanVien, String> {

    String insert = "insert into NhanVien values (?,?,?,?,?,?,?,0,1)";
    String update = "update NhanVien set name=?, CCCD=?, phoneNumber=?, email=?, salt=?, hash=? where IdStaff=?";
    String disable = "update NhanVien set status=0 where IdStaff=?";
    String reStore = "update NhanVien set status=1 where IdStaff=?";
    String select_ID = "select * from NhanVien where IdStaff=?";
    String select_All = "select * from NhanVien";
    String select_page = "select * from NhanVien\n"
            + "order by IdStaff\n"
            + "offset ?*10 rows\n"
            + "fetch next 11 rows only";

    @Override
    public void insert(NhanVien entity) {
        Xjdbc.update(insert, entity.getIdStaff(), entity.getName(), entity.getCCCD(), entity.getPhoneNumber(), entity.getEmail(), entity.getSalt(), entity.getHash(), entity.isRole(), entity.isStatus());
    }

    @Override
    public void update(NhanVien entity) {
        Xjdbc.update(update, entity.getName(), entity.getCCCD(), entity.getPhoneNumber(), entity.getEmail(), entity.getSalt(), entity.getHash(), entity.getIdStaff());
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
    public NhanVien selectById(String id) {
        List<NhanVien> list = this.selectBySql(select_ID, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public List<NhanVien> selectByPage(int page) {
        return this.selectBySql(select_page, page);
    }

    @Override
    public List<NhanVien> selectBySql(String sql, Object... args) {
        List<NhanVien> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(new NhanVien(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7), rs.getBoolean(8), rs.getBoolean(9)));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<NhanVien> selectAll() {
        return this.selectBySql(select_All);
    }
}
