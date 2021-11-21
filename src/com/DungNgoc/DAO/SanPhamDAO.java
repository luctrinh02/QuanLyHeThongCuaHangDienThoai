/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.entitys.SanPham;
import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamDAO implements DungNgocDAO<SanPham, String>{
    String insert = "insert into SanPham values(?,?,?,?,?,?,?,?,?,?,?,?,1)";
    String update = "update SanPham set image=?,note=?,modelId=?,size=?,ram=?,colorId=?,isNew=?,versionId=?,count=?,price=?,date=? where IdProduct=?";
    String disable = "update SanPham set status=0 where IdProduct=?";
    String reStore = "update SanPham set status=1 where IdProduct=?";
    String select_ID = "select * from SanPham where IdProduct=?";
    String select_All = "select * from SanPham";
    String select_page = "select * from SanPham\n"
            + "order by IdProduct\n"
            + "offset ?*10 rows\n"
            + "fetch next 11 rows only";
    @Override
    public void insert(SanPham entity) {
        Xjdbc.update(insert, entity.getIdProduct(),entity.getImage(),entity.getNote(),entity.getModelId(),entity.getSize(),entity.getRam(),entity.getColorId(),entity.isIsnew(),entity.getVersionId(),entity.getCount(),entity.getPrice(),entity.getDateAdd());
    }

    @Override
    public void update(SanPham entity) {
        Xjdbc.update(update,entity.getImage(),entity.getNote(),entity.getModelId(),entity.getSize(),entity.getRam(),entity.getColorId(),entity.isIsnew(),entity.getVersionId(),entity.getCount(),entity.getPrice(),entity.getDateAdd(), entity.getIdProduct());
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
    public SanPham selectById(String id) {
         List<SanPham> list = this.selectBySql(select_ID, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public List<SanPham> selectByPage(int page) {
        return this.selectBySql(select_page, page);
    }

    @Override
    public List<SanPham> selectAll() {
       return this.selectBySql(select_All);
    }

    @Override
    public List<SanPham> selectBySql(String sql, Object... args) {
        List<SanPham> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(new SanPham(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getString(7),rs.getBoolean(8),rs.getString(9),rs.getInt(10),rs.getDouble(11),rs.getString(12),rs.getBoolean(13)));
            }
            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    
}
