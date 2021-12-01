/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.entitys.KhachHang;
import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class KhachHangDAO implements DungNgocDAO<KhachHang, String> {

    String insert = "insert into KhachHang values (?,?,?,?,1)";
    String update = "update KhachHang set name=? where IdGuest=?";
    String disable = "update KhachHang set status=0 where IdGuest=?";
    String reStore = "update KhachHang set status=1 where IdGuest=?";
    String select_ID = "select * from KhachHang where IdGuest=?";
    String select_All = "select * from KhachHang";
    String select_page = "select * from KhachHang where status =1 and (IdGuest like ? or name like ?)\n"
            + "order by IdGuest\n"
            + "offset ?*5 rows\n"
            + "fetch next 6 rows only";
    String select_pageR = "select * from KhachHang where status =0\n"
            + "order by IdGuest\n"
            + "offset ?*10 rows\n"
            + "fetch next 11 rows only";
    @Override
    public void insert(KhachHang entity) {
        Xjdbc.update(insert, entity.getIdGuest(),entity.getName(),entity.getTotalMoney(),entity.getPoint());
    }

    @Override
    public void update(KhachHang entity) {
        Xjdbc.update(update,entity.getName(), entity.getIdGuest());
    }
    public void update2(KhachHang entity) {
        String sql="update khachHang set totalMoney=totalMoney+?,point=point+? where IdGuest=?";
        Xjdbc.update(sql,entity.getTotalMoney(),entity.getPoint(), entity.getIdGuest());
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
    public KhachHang selectById(String id) {
        List<KhachHang> list = this.selectBySql(select_ID, id);
        if (list.isEmpty()) {
            return null;
        } else {
            return list.get(0);
        }
    }

    @Override
    public List<KhachHang> selectAll() {
        return this.selectBySql(select_All);
    }

    @Override
    public List<KhachHang> selectBySql(String sql, Object... args) {
        List<KhachHang> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(new KhachHang(rs.getString(1), rs.getString(2), rs.getDouble(3),rs.getDouble(4),rs.getBoolean(5)));
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public List<KhachHang> selectByPage(int page,String keyword) {
        return this.selectBySql(select_page, "%"+keyword+"%","%"+keyword+"%",page);
    }
    public List<KhachHang> selectByRecyclebin(int page) {
        return this.selectBySql(select_pageR,page);
    }
    @Override
    public List<KhachHang> selectByPage(int page) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public KhachHang select(String id){
        String sql="select * from KhachHang where IdGuest=? and status=1";
        List<KhachHang> list = this.selectBySql(sql, id);
        return list.isEmpty()?null:list.get(0);
    }
}
