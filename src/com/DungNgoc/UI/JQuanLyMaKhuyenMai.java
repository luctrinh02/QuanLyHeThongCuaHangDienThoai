/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.UI;

import com.DungNgoc.DAO.KhuyenMaiDAO;
import com.DungNgoc.entitys.MaKhuyenMai;
import com.DungNgoc.untils.Exceptions;
import com.DungNgoc.untils.MsgBox;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LINH
 */
public class JQuanLyMaKhuyenMai extends javax.swing.JInternalFrame {

    KhuyenMaiDAO dao = new KhuyenMaiDAO();
    int row = -1;
    int index, page = 0, pageRac = 0;

    public JQuanLyMaKhuyenMai() {
        initComponents();
        init();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblKhuyenMai = new javax.swing.JTable();
        jPanel21 = new javax.swing.JPanel();
        btnPrev = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtGiaTri = new javax.swing.JTextField();
        txtMaKM = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        btnDau = new javax.swing.JButton();
        btnLui = new javax.swing.JButton();
        btnTien = new javax.swing.JButton();
        btnCuoi = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnMoi = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblThungRac = new javax.swing.JTable();
        jPanel22 = new javax.swing.JPanel();
        btnPrevRac = new javax.swing.JButton();
        btnNextRac = new javax.swing.JButton();
        btnKhoiPhuc = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("QUẢN LÝ MÃ KHUYẾN MÃI");

        tblKhuyenMai.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khuyến mãi", "Giá trị"
            }
        ));
        tblKhuyenMai.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblKhuyenMaiMouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                tblKhuyenMaiMouseReleased(evt);
            }
        });
        jScrollPane2.setViewportView(tblKhuyenMai);

        jPanel21.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPrev.setText("<<");
        btnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevActionPerformed(evt);
            }
        });

        btnNext.setText(">>");
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrev)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnNext)
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrev)
                    .addComponent(btnNext))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
            .addComponent(jPanel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 207, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Danh sách", jPanel2);

        jLabel2.setText("Mã khuyến mãi");

        jLabel3.setText("Giá trị");

        btnDau.setText("|<");
        btnDau.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDauActionPerformed(evt);
            }
        });

        btnLui.setText("<<");
        btnLui.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuiActionPerformed(evt);
            }
        });

        btnTien.setText(">>");
        btnTien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTienActionPerformed(evt);
            }
        });

        btnCuoi.setText(">|");
        btnCuoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDau)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnLui)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTien)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnCuoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDau)
                    .addComponent(btnLui)
                    .addComponent(btnTien)
                    .addComponent(btnCuoi))
                .addContainerGap())
        );

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnMoi.setText("Mới");
        btnMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnThem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSua)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnXoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMoi)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem)
                    .addComponent(btnSua)
                    .addComponent(btnXoa)
                    .addComponent(btnMoi))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtMaKM, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                            .addComponent(txtGiaTri))))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMaKM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtGiaTri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53))
        );

        tabs.addTab("Chi tiết", jPanel3);

        tblThungRac.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã khuyến mãi", "Giá trị"
            }
        ));
        tblThungRac.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblThungRacMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblThungRac);

        jPanel22.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        btnPrevRac.setText("<<");
        btnPrevRac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrevRacActionPerformed(evt);
            }
        });

        btnNextRac.setText(">>");
        btnNextRac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextRacActionPerformed(evt);
            }
        });

        btnKhoiPhuc.setText("Khôi phục");
        btnKhoiPhuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoiPhucActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrevRac)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addComponent(btnKhoiPhuc)
                .addGap(165, 165, 165)
                .addComponent(btnNextRac)
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPrevRac)
                    .addComponent(btnNextRac)
                    .addComponent(btnKhoiPhuc))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 561, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        tabs.addTab("Thùng rác", jPanel4);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabs)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(146, 146, 146)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(33, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblKhuyenMaiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhuyenMaiMouseClicked
        if (evt.getClickCount() == 2) {
            row = tblKhuyenMai.getSelectedRow();
            this.edit();
            tabs.setSelectedIndex(1);

        }
    }//GEN-LAST:event_tblKhuyenMaiMouseClicked

    private void tblKhuyenMaiMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblKhuyenMaiMouseReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_tblKhuyenMaiMouseReleased

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        insert();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        update();
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMoiActionPerformed
        clearForm();
    }//GEN-LAST:event_btnMoiActionPerformed

    private void btnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevActionPerformed
        prevPage();
    }//GEN-LAST:event_btnPrevActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        nextPage();
    }//GEN-LAST:event_btnNextActionPerformed

    private void btnDauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDauActionPerformed
        first();
    }//GEN-LAST:event_btnDauActionPerformed

    private void btnLuiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuiActionPerformed
        prev();
    }//GEN-LAST:event_btnLuiActionPerformed

    private void btnTienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTienActionPerformed
        next();
    }//GEN-LAST:event_btnTienActionPerformed

    private void btnCuoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuoiActionPerformed
        last();
    }//GEN-LAST:event_btnCuoiActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        disableKM();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnKhoiPhucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoiPhucActionPerformed
        phucHoi();
    }//GEN-LAST:event_btnKhoiPhucActionPerformed

    private void btnPrevRacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrevRacActionPerformed
        prevPageRac();
    }//GEN-LAST:event_btnPrevRacActionPerformed

    private void btnNextRacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextRacActionPerformed
        nextPageRac();
    }//GEN-LAST:event_btnNextRacActionPerformed

    private void tblThungRacMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblThungRacMouseClicked
        int[] rows = tblThungRac.getSelectedRows();
        if (rows.length != 0) {
            btnKhoiPhuc.setEnabled(true);
        } else {
            btnKhoiPhuc.setEnabled(false);
        }
    }//GEN-LAST:event_tblThungRacMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuoi;
    private javax.swing.JButton btnDau;
    private javax.swing.JButton btnKhoiPhuc;
    private javax.swing.JButton btnLui;
    private javax.swing.JButton btnMoi;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnNextRac;
    private javax.swing.JButton btnPrev;
    private javax.swing.JButton btnPrevRac;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTien;
    private javax.swing.JButton btnXoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblKhuyenMai;
    private javax.swing.JTable tblThungRac;
    private javax.swing.JTextField txtGiaTri;
    private javax.swing.JTextField txtMaKM;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocation(100, 100);
        this.fillTable();
        this.fillTableRac();
        this.row = -1;
        this.updateStatus();

    }

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblKhuyenMai.getModel();
        model.setRowCount(0);
        try {
            List<MaKhuyenMai> lst = dao.selectByPage(page);
            for (MaKhuyenMai x : lst) {
                Object[] rdt = new Object[]{
                    x.getPromoCode(),
                    x.getValue()
                };
                model.addRow(rdt);
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi truy vấn dữ liệu");
            e.printStackTrace();
        }
    }

    public void fillTableRac() {
        DefaultTableModel modelRac = (DefaultTableModel) tblThungRac.getModel();
        modelRac.setRowCount(0);
        try {
            List<MaKhuyenMai> list = dao.selectByRecyclebin(pageRac);
            if (list.size() == 11) {
                for (int i = 0; i < 10; i++) {
                    MaKhuyenMai tam = list.get(i);
                    modelRac.addRow(new Object[]{tam.getPromoCode(), tam.getValue()});
                }
            } else {
                for (MaKhuyenMai tam : list) {
                    modelRac.addRow(new Object[]{tam.getPromoCode(), tam.getValue()});
                }
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Lỗi đọc dữ liệu");
            Exceptions.writeException(e, "none");
            e.printStackTrace();
        }
    }

    void setForm(MaKhuyenMai km) {
        txtMaKM.setText(km.getPromoCode());
        txtGiaTri.setText(km.getValue() + "");
    }

    MaKhuyenMai getForm() {
        MaKhuyenMai km = new MaKhuyenMai();
        if (txtGiaTri.getText().trim().length() == 0 || txtMaKM.getText().trim().length() == 0) {
            MsgBox.alert(this, "Không được để trống!");
            return null;
        }

        if (!txtMaKM.getText().trim().matches("^[a-zA-Z0-9]{1,7}$")) {
            MsgBox.alert(this, "Mã khuyến mãi không hợp lệ!");
            return null;
        }
        if (!txtGiaTri.getText().trim().matches("^[0-9]{1,2}")) {
            MsgBox.alert(this, "Giá trị mã khuyến mãi không hợp lệ!");
            return null;
        }
        km.setPromoCode(txtMaKM.getText().trim());
        km.setValue(Integer.parseInt(txtGiaTri.getText().trim()));
        return km;
    }

    public void clearForm() {
        MaKhuyenMai km = new MaKhuyenMai();
        this.setForm(km);
        this.row = -1;
        this.updateStatus();
    }

    public void edit() {
        String maKM = tblKhuyenMai.getValueAt(this.row, 0) + "";
        MaKhuyenMai km = dao.selectById(maKM);
        this.setForm(km);

        this.updateStatus();
    }

    public void first() {
        this.row = 0;
        this.edit();
    }

    public void next() {
        if (this.row < tblKhuyenMai.getRowCount() - 1) {
            this.row++;
            this.edit();
        }
    }

    public void prev() {
        if (this.row > 0) {
            this.row--;
            this.edit();
        }
    }

    public void last() {
        this.row = tblKhuyenMai.getRowCount() - 1;
        this.edit();
    }

    public void updateStatus() {
        boolean edit = (this.row >= 0);
        boolean first = (this.row == 0);
        boolean last = (this.row == tblKhuyenMai.getRowCount() - 1);

        txtMaKM.setEditable(!edit);
        btnThem.setEnabled(!edit);
        btnSua.setEnabled(edit);
        btnXoa.setEnabled(edit);

        btnDau.setEnabled(edit && !first);
        btnLui.setEnabled(edit && !first);
        btnTien.setEnabled(edit && !last);
        btnCuoi.setEnabled(edit && !last);

    }

    public void insert() {
        MaKhuyenMai km = getForm();
        if (km == null) {
            return;
        }
        List<MaKhuyenMai> list = this.dao.selectAll();
        for (int i = 0; i < list.size(); i++) {
            
            if (list.get(i).getPromoCode().equals(km.getPromoCode())) {
                MsgBox.alert(this, "Mã khuyến mãi đã tồn tại!");
                return;
            }
        }
        try {
            dao.insert(km);
            page = 0;
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Thêm thành công");
        } catch (Exception e) {
            MsgBox.alert(this, "Thêm thất bại");
            Exceptions.writeException(e, getForm().toString());
            e.printStackTrace();

        }
    }

    public void update() {
        MaKhuyenMai nv = getForm();
        if (nv == null) {
            return;
        }
        try {
            dao.update(nv);
            this.fillTable();
            this.clearForm();
            MsgBox.alert(this, "Cập nhật thành công");
        } catch (Exception e) {
            MsgBox.alert(this, "Cập nhật thất bại");
            Exceptions.writeException(e, getForm().toString());

        }
    }

    public void disableKM() {
        String maKM = txtMaKM.getText();
        //MaKhuyenMai tam = dao.selectById(maKM);    
        try {
            dao.disable(maKM.trim());
            page = 0;
            pageRac = 0;
            this.fillTable();
            this.fillTableRac();
            this.clearForm();
            MsgBox.alert(this, "Vô hiệu thành công");
        } catch (Exception e) {
            MsgBox.alert(this, "Vô hiệu thất bại");
            Exceptions.writeException(e, getForm().toString());
            e.printStackTrace();
        }

    }

    public void phucHoi() {
        int[] rows = tblThungRac.getSelectedRows();
        for (int i : rows) {
            String maNV = tblThungRac.getValueAt(i, 0) + "";
            try {
                dao.reStore(maNV);
            } catch (Exception e) {
                Exceptions.writeException(e, "none");
            }
        }
        fillTableRac();
        fillTable();
        btnKhoiPhuc.setEnabled(false);
    }

    void nextPage() {
        page++;
        fillTable();
    }

    void prevPage() {
        page--;
        fillTable();
    }

    void nextPageRac() {
        page++;
        fillTableRac();
    }

    void prevPageRac() {
        page--;
        fillTableRac();
    }
}
