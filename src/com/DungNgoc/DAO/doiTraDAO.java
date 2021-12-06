/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.DAO;

import com.DungNgoc.untils.Xdate;
import com.DungNgoc.untils.Xjdbc;
import java.util.Date;

/**
 *
 * @author Admin
 */
public class doiTraDAO {
    String sql="insert into HoaDonDoiHang values (?,?,?,?)";
    public void them(int id,String ma,int so){
        Xjdbc.update(sql, id,ma,so,Xdate.toString(new Date(), "yyyy-MM-dd"));
    }
}
