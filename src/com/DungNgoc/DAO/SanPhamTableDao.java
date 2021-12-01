/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.entitys.SanPhamTable;
import com.DungNgoc.untils.Xjdbc;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class SanPhamTableDao {

    public List<SanPhamTable> selectBySql(String sql, Object... args) {
        List<SanPhamTable> list = new ArrayList<>();
        try {
            ResultSet rs = Xjdbc.query(sql, args);
            while (rs.next()) {
                list.add(new SanPhamTable(rs.getString(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getString(5), rs.getBoolean(6), rs.getDouble(7), rs.getInt(8)));
            }
//            rs.getStatement().getConnection().close();
            return list;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public List<SanPhamTable> select(String keyword, String hang, String dong, String loai, String phienBan, String ram, String dungLuong, int page) {
        String sql = "select IdProduct,b.name,ram,size, e.colorName,a.isNew,a.price,a.count\n"
                + "from SanPham a join LoaiMay b on a.modelId=b.modelId join DongMay c on b.tag=c.tag join HangMay d on c.typeId=d.typeId join Mau e on a.colorId=e.colorid join PhienBan f on a.versionId = f.versionId\n"
                + "where status = 1 and (IdProduct like ? or b.name like ?) \n"
                + "and d.name like ? and c.name like ? and b.name like ? and f.name like ? and ram like ? and size like ?\n"
                + "order by IdProduct\n"
                + "offset ?*20 rows\n"
                + "fetch next 21 rows only";
        return this.selectBySql(sql, "%" + keyword + "%", "%" + keyword + "%", "%" + hang + "%", "%" + dong + "%", "%" + loai + "%", "%" + phienBan + "%", "%" + ram + "%", "%" + dungLuong + "%", page);
    }

    public List<SanPhamTable> selectByKeyWord(String keyword, int page) {
        String sql = "select IdProduct,b.name,ram,size, e.colorName,a.isNew,a.price,a.count\n"
                + "from SanPham a join LoaiMay b on a.modelId=b.modelId join DongMay c on b.tag=c.tag join HangMay d on c.typeId=d.typeId join Mau e on a.colorId=e.colorid join PhienBan f on a.versionId = f.versionId\n"
                + "where status = 1 and (IdProduct like ? or b.name like ?) \n"
                + "order by IdProduct\n"
                + "offset ?*20 rows\n"
                + "fetch next 21 rows only";
        return this.selectBySql(sql, "%" + keyword + "%", "%" + keyword + "%", page);
    }
    public SanPhamTable selectById(String id){
        String sql="select IdProduct,b.name,ram,size, e.colorName,a.isNew,a.price,a.count\n"
                + "from SanPham a join LoaiMay b on a.modelId=b.modelId join DongMay c on b.tag=c.tag join HangMay d on c.typeId=d.typeId join Mau e on a.colorId=e.colorid join PhienBan f on a.versionId = f.versionId\n"
                + "where status = 1 and IdProduct = ?";
        List<SanPhamTable> list=selectBySql(sql, id);
        return list.isEmpty()?null:list.get(0);
    }
}
