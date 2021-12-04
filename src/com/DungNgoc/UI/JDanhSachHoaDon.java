/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.UI;

import com.DungNgoc.DAO.HoaDonDAO;
import com.DungNgoc.DAO.KhachHangDAO;
import com.DungNgoc.DAO.KhuyenMaiDAO;
import com.DungNgoc.DAO.NhanVienDAO;
import com.DungNgoc.entitys.HoaDon;
import com.DungNgoc.entitys.KhachHang;
import com.DungNgoc.entitys.MaKhuyenMai;
import com.DungNgoc.entitys.NhanVien;
import com.DungNgoc.untils.Xmoney;
import java.awt.Color;
import java.awt.Font;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LINH
 */
public class JDanhSachHoaDon extends javax.swing.JInternalFrame {

    /**
     * Creates new form JDanhSachHoaDon
     */
    HoaDonDAO hdao = new HoaDonDAO();
    KhachHangDAO khdao = new KhachHangDAO();
    NhanVienDAO nvdao = new NhanVienDAO();
    KhuyenMaiDAO kmdao = new KhuyenMaiDAO();
    DefaultTableModel dtm;
    public int vitri;

    public JDanhSachHoaDon() {
        initComponents();
        this.init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        frame = new javax.swing.JFrame();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        refesh = new javax.swing.JMenuItem();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTimKiem = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhSachHoaDon = new javax.swing.JTable();
        btnThem = new javax.swing.JButton();

        javax.swing.GroupLayout frameLayout = new javax.swing.GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(frameLayout);
        frameLayout.setHorizontalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        frameLayout.setVerticalGroup(
            frameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        refesh.setText("Refesh");
        refesh.setComponentPopupMenu(jPopupMenu1);
        refesh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refeshActionPerformed(evt);
            }
        });
        jPopupMenu1.add(refesh);

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(751, 575));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Danh Sách Hóa Đơn");

        jLabel3.setText("Tìm Kiếm:");

        txtTimKiem.setText("Tìm Kiếm");
        txtTimKiem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTimKiemFocusLost(evt);
            }
        });
        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        tblDanhSachHoaDon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã HD", "Thời Gian", "Khách Hàng", "Tổng Tiền Hàng", "Giảm Giá", "Tên NV", "Tổng Thu"
            }
        ));
        tblDanhSachHoaDon.setComponentPopupMenu(jPopupMenu1);
        tblDanhSachHoaDon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhSachHoaDonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhSachHoaDon);

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtTimKiem))
                            .addComponent(jScrollPane1))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 186, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(281, 281, 281))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTimKiem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnThem)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        new ThemHoaDon(frame, true).setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed

    private void tblDanhSachHoaDonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhSachHoaDonMouseClicked
        this.vitri = tblDanhSachHoaDon.getSelectedRow();
        if (this.vitri == -1) {
            return;
        }
         new JHoaDonChiTiet(null, true,String.valueOf(tblDanhSachHoaDon.getValueAt(vitri, 0))).setVisible(true);
  
    }//GEN-LAST:event_tblDanhSachHoaDonMouseClicked

    private void txtTimKiemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusGained
        // TODO add your handling code here:
        if (txtTimKiem.getText().equals("Tìm Kiếm")) {
            txtTimKiem.setText(null);
            txtTimKiem.requestFocus();
            removePlaceHolderStyle(txtTimKiem);
        }
    }//GEN-LAST:event_txtTimKiemFocusGained

    private void txtTimKiemFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTimKiemFocusLost
        // TODO add your handling code here:
        if (txtTimKiem.getText().length() == 0) {
            txtTimKiem.setText("Tìm Kiếm");
            addPlaceHolderStyle(txtTimKiem);
        }
    }//GEN-LAST:event_txtTimKiemFocusLost

    private void refeshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refeshActionPerformed
        // TODO add your handling code here:
        filltable();
    }//GEN-LAST:event_refeshActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
        filltableSearch(txtTimKiem.getText());
    }//GEN-LAST:event_txtTimKiemKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JFrame frame;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuItem refesh;
    private javax.swing.JTable tblDanhSachHoaDon;
    private javax.swing.JTextField txtTimKiem;
    // End of variables declaration//GEN-END:variables
private void init() {
        dtm = (DefaultTableModel) tblDanhSachHoaDon.getModel();
        this.filltable();
    }

    private void filltable() {
        dtm.setRowCount(0);
        List<HoaDon> lsthd = hdao.selectAll();
        for (int i = 0; i < lsthd.size(); i++) {
            HoaDon hd = (HoaDon) lsthd.get(i);
            KhachHang kh = khdao.selectById(hd.getIdGuest());
            NhanVien nv = nvdao.selectById(hd.getIdStaff());
            MaKhuyenMai km = kmdao.selectById(hd.getPromoCode());
            Double tongthu = (Double.parseDouble(hd.getTotalMoney()) / (100 - km.getValue()) * 100);
            DecimalFormat df = new DecimalFormat("#.000");
            Object[] rd = new Object[]{
                hd.getIdBill(),
                hd.getDateBill(),
                kh.getName(),
                Xmoney.moneyToString(tongthu),
                hd.getPromoCode(),
                nv.getName(),
                Xmoney.moneyToString(Double.parseDouble(hd.getTotalMoney()))
            };
            dtm.addRow(rd);
        }

    }
    private void filltableSearch(String id) {
        dtm.setRowCount(0);
        //IdGuest LIKE '%?%' OR IdStaff LIKE '%?%' OR IdBill= ?
        List<HoaDon> lsthd = hdao.selectBySql("SELECT *FROM HoaDon WHERE IdStaff like ? OR IdGuest like ? OR IdBill like ?" ,"%"+id+"%","%"+id+"%","%"+id+"%");
        for (int i = 0; i < lsthd.size(); i++) {
            HoaDon hd = (HoaDon) lsthd.get(i);
            KhachHang kh = khdao.selectById(hd.getIdGuest());
            NhanVien nv = nvdao.selectById(hd.getIdStaff());
            MaKhuyenMai km = kmdao.selectById(hd.getPromoCode());
            Double tongthu = (Double.parseDouble(hd.getTotalMoney()) / (100 - km.getValue()) * 100);
            Object[] rd = new Object[]{
                hd.getIdBill(),
                hd.getDateBill(),
                kh.getName(),
                Xmoney.moneyToString(tongthu),
                hd.getPromoCode(),
                nv.getName(),
                Xmoney.moneyToString(Double.parseDouble(hd.getTotalMoney()))
            };
            dtm.addRow(rd);
        }

    }
    public void addPlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(new Color(204, 204, 255));
    }

    public void removePlaceHolderStyle(JTextField textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
    }
}
