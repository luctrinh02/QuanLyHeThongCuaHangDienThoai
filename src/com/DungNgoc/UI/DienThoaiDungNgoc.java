/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.UI;

import com.DungNgoc.UI.DangNhap;
import UI.DoiMatKhau;
import com.DungNgoc.untils.Auth;
import com.DungNgoc.untils.Exceptions;
import com.DungNgoc.untils.MsgBox;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.Timer;

/**
 *
 * @author LINH
 */
public class DienThoaiDungNgoc extends javax.swing.JFrame {
    ImageIcon iconDN = new ImageIcon("src/com/DungNgoc/icons/Lock.png");
    ImageIcon iconDX = new ImageIcon("src/com/DungNgoc/icons/Exit.png");
    /**
     * Creates new form DienThoaiDungNgoc
     */
    public DienThoaiDungNgoc() {
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        toolBar = new javax.swing.JToolBar();
        btnDangNhap = new javax.swing.JButton();
        btnKhoSP = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        btnKhuyenMai = new javax.swing.JButton();
        btnBaoLoi = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblUser = new javax.swing.JLabel();
        lblClock = new javax.swing.JLabel();
        DesktopMain = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MniDangNhap = new javax.swing.JMenuItem();
        MniDangXuat = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        MniDoiMK = new javax.swing.JMenuItem();
        mniKetThuc = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        MniNhanVien = new javax.swing.JMenuItem();
        MniKhachHang = new javax.swing.JMenuItem();
        jSeparator3 = new javax.swing.JPopupMenu.Separator();
        MniKhoSP = new javax.swing.JMenuItem();
        jSeparator4 = new javax.swing.JPopupMenu.Separator();
        MniHoaDon = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        MniDoanhThu = new javax.swing.JMenuItem();
        MniTKSP = new javax.swing.JMenuItem();
        MniTKKH = new javax.swing.JMenuItem();
        MniTKNV = new javax.swing.JMenuItem();
        jSeparator5 = new javax.swing.JPopupMenu.Separator();
        MniBC = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        toolBar.setRollover(true);

        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Exit.png"))); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.setFocusable(false);
        btnDangNhap.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnDangNhap.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        toolBar.add(btnDangNhap);

        btnKhoSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Full basket.png"))); // NOI18N
        btnKhoSP.setText("Sản phẩm");
        btnKhoSP.setFocusable(false);
        btnKhoSP.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhoSP.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhoSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhoSPActionPerformed(evt);
            }
        });
        toolBar.add(btnKhoSP);

        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Cash register.png"))); // NOI18N
        btnHoaDon.setText("Hóa đơn");
        btnHoaDon.setFocusable(false);
        btnHoaDon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnHoaDon.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });
        toolBar.add(btnHoaDon);

        btnKhuyenMai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Gift.png"))); // NOI18N
        btnKhuyenMai.setText("Khuyến mãi");
        btnKhuyenMai.setFocusable(false);
        btnKhuyenMai.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnKhuyenMai.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnKhuyenMai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhuyenMaiActionPerformed(evt);
            }
        });
        toolBar.add(btnKhuyenMai);

        btnBaoLoi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Problem.png"))); // NOI18N
        btnBaoLoi.setText("Báo lỗi");
        btnBaoLoi.setFocusable(false);
        btnBaoLoi.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnBaoLoi.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnBaoLoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaoLoiActionPerformed(evt);
            }
        });
        toolBar.add(btnBaoLoi);

        jPanel1.setBackground(new java.awt.Color(92, 192, 194));

        lblUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Unknown person.png"))); // NOI18N
        lblUser.setText("User name");

        lblClock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Clock.png"))); // NOI18N
        lblClock.setText("hh:mm:ss");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblUser)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblClock, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUser)
                    .addComponent(lblClock))
                .addContainerGap())
        );

        javax.swing.GroupLayout DesktopMainLayout = new javax.swing.GroupLayout(DesktopMain);
        DesktopMain.setLayout(DesktopMainLayout);
        DesktopMainLayout.setHorizontalGroup(
            DesktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        DesktopMainLayout.setVerticalGroup(
            DesktopMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
        );

        menuBar.setBackground(new java.awt.Color(92, 192, 194));

        jMenu1.setText("Tài khoản");

        MniDangNhap.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        MniDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Lock.png"))); // NOI18N
        MniDangNhap.setText("Đăng nhập");
        MniDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniDangNhapActionPerformed(evt);
            }
        });
        jMenu1.add(MniDangNhap);

        MniDangXuat.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        MniDangXuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Exit.png"))); // NOI18N
        MniDangXuat.setText("Đăng xuất");
        MniDangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniDangXuatActionPerformed(evt);
            }
        });
        jMenu1.add(MniDangXuat);
        jMenu1.add(jSeparator2);

        MniDoiMK.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_D, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        MniDoiMK.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Refresh.png"))); // NOI18N
        MniDoiMK.setText("Đổi mật khẩu");
        MniDoiMK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniDoiMKActionPerformed(evt);
            }
        });
        jMenu1.add(MniDoiMK);

        mniKetThuc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Delete.png"))); // NOI18N
        mniKetThuc.setText("Kết thúc");
        mniKetThuc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniKetThucActionPerformed(evt);
            }
        });
        jMenu1.add(mniKetThuc);

        menuBar.add(jMenu1);

        jMenu2.setText("Quản lý");

        MniNhanVien.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MniNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/User group.png"))); // NOI18N
        MniNhanVien.setText("Nhân viên");
        MniNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniNhanVienActionPerformed(evt);
            }
        });
        jMenu2.add(MniNhanVien);

        MniKhachHang.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MniKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Conference.png"))); // NOI18N
        MniKhachHang.setText("Khách hàng");
        MniKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniKhachHangActionPerformed(evt);
            }
        });
        jMenu2.add(MniKhachHang);
        jMenu2.add(jSeparator3);

        MniKhoSP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, 0));
        MniKhoSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Full basket.png"))); // NOI18N
        MniKhoSP.setText("Kho sản phẩm");
        MniKhoSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniKhoSPActionPerformed(evt);
            }
        });
        jMenu2.add(MniKhoSP);
        jMenu2.add(jSeparator4);

        MniHoaDon.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F3, 0));
        MniHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Cash register.png"))); // NOI18N
        MniHoaDon.setText("Hóa đơn");
        MniHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniHoaDonActionPerformed(evt);
            }
        });
        jMenu2.add(MniHoaDon);

        menuBar.add(jMenu2);

        jMenu3.setText("Thống kê");

        MniDoanhThu.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MniDoanhThu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Bar chart.png"))); // NOI18N
        MniDoanhThu.setText("Doanh thu");
        MniDoanhThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniDoanhThuActionPerformed(evt);
            }
        });
        jMenu3.add(MniDoanhThu);

        MniTKSP.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F7, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MniTKSP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Money.png"))); // NOI18N
        MniTKSP.setText("Sản phẩm");
        MniTKSP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniTKSPActionPerformed(evt);
            }
        });
        jMenu3.add(MniTKSP);

        MniTKKH.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F8, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MniTKKH.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Conference.png"))); // NOI18N
        MniTKKH.setText("Khách hàng");
        MniTKKH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniTKKHActionPerformed(evt);
            }
        });
        jMenu3.add(MniTKKH);

        MniTKNV.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F9, java.awt.event.InputEvent.CTRL_DOWN_MASK));
        MniTKNV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/User group.png"))); // NOI18N
        MniTKNV.setText("Nhân viên");
        MniTKNV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniTKNVActionPerformed(evt);
            }
        });
        jMenu3.add(MniTKNV);
        jMenu3.add(jSeparator5);

        MniBC.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F10, java.awt.event.InputEvent.SHIFT_DOWN_MASK));
        MniBC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/DungNgoc/icons/Price list.png"))); // NOI18N
        MniBC.setText("Báo cáo");
        MniBC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MniBCActionPerformed(evt);
            }
        });
        jMenu3.add(MniBC);

        menuBar.add(jMenu3);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(toolBar, javax.swing.GroupLayout.DEFAULT_SIZE, 806, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(DesktopMain)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(toolBar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(DesktopMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MniNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniNhanVienActionPerformed
        openNhanVieṇ();
    }//GEN-LAST:event_MniNhanVienActionPerformed

    private void MniKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniKhachHangActionPerformed
        openKhachHang();
    }//GEN-LAST:event_MniKhachHangActionPerformed

    private void btnKhuyenMaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhuyenMaiActionPerformed
        openKhuyenMai();
    }//GEN-LAST:event_btnKhuyenMaiActionPerformed

    private void btnKhoSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhoSPActionPerformed
        openSanPham();
    }//GEN-LAST:event_btnKhoSPActionPerformed

    private void MniKhoSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniKhoSPActionPerformed
        openSanPham();
    }//GEN-LAST:event_MniKhoSPActionPerformed

    private void MniHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniHoaDonActionPerformed
        openHoaDon();
    }//GEN-LAST:event_MniHoaDonActionPerformed

    private void MniDoanhThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniDoanhThuActionPerformed
        openDoanhThu();
    }//GEN-LAST:event_MniDoanhThuActionPerformed

    private void MniTKSPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniTKSPActionPerformed
        openThongKeSanPham();
    }//GEN-LAST:event_MniTKSPActionPerformed

    private void MniTKKHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniTKKHActionPerformed
       openThongKeKhachHang();
    }//GEN-LAST:event_MniTKKHActionPerformed

    private void MniTKNVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniTKNVActionPerformed
        openThongKeNhanVien();
    }//GEN-LAST:event_MniTKNVActionPerformed

    private void MniBCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniBCActionPerformed
        openBaoCao();
    }//GEN-LAST:event_MniBCActionPerformed

    private void btnBaoLoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaoLoiActionPerformed
        baoLoi();
    }//GEN-LAST:event_btnBaoLoiActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        openHoaDon();
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void MniDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniDangNhapActionPerformed
        openDangNhap();
    }//GEN-LAST:event_MniDangNhapActionPerformed

    private void MniDangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniDangXuatActionPerformed
        openDangXuat();
    }//GEN-LAST:event_MniDangXuatActionPerformed

    private void MniDoiMKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MniDoiMKActionPerformed
        openDoiMK();
    }//GEN-LAST:event_MniDoiMKActionPerformed

    private void mniKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniKetThucActionPerformed
        ketThuc();
    }//GEN-LAST:event_mniKetThucActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(DienThoaiDungNgoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(DienThoaiDungNgoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(DienThoaiDungNgoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(DienThoaiDungNgoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DienThoaiDungNgoc().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane DesktopMain;
    private javax.swing.JMenuItem MniBC;
    private javax.swing.JMenuItem MniDangNhap;
    private javax.swing.JMenuItem MniDangXuat;
    private javax.swing.JMenuItem MniDoanhThu;
    private javax.swing.JMenuItem MniDoiMK;
    private javax.swing.JMenuItem MniHoaDon;
    private javax.swing.JMenuItem MniKhachHang;
    private javax.swing.JMenuItem MniKhoSP;
    private javax.swing.JMenuItem MniNhanVien;
    private javax.swing.JMenuItem MniTKKH;
    private javax.swing.JMenuItem MniTKNV;
    private javax.swing.JMenuItem MniTKSP;
    private javax.swing.JButton btnBaoLoi;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhoSP;
    private javax.swing.JButton btnKhuyenMai;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JPopupMenu.Separator jSeparator3;
    private javax.swing.JPopupMenu.Separator jSeparator4;
    private javax.swing.JPopupMenu.Separator jSeparator5;
    private javax.swing.JLabel lblClock;
    private javax.swing.JLabel lblUser;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem mniKetThuc;
    private javax.swing.JToolBar toolBar;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setLocationRelativeTo(null);
        new JChao(this, true).setVisible(true);
        new DangNhap(this, true).setVisible(true);
        new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Date now = new Date();
                SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss a");
                String text = sdf.format(now);
                lblClock.setText(text);
                if (Auth.user == null) {
                    btnDangNhap.setText("Đăng nhập");
                    btnDangNhap.setIcon(iconDN);
                }
                else {
                    btnDangNhap.setText("Đăng xuất");
                    btnDangNhap.setIcon(iconDX);
                }
            }
        }).start();
    }

    void openNhanVieṇ() {
        JQuanLyNhanVien qlnv = new JQuanLyNhanVien();
        this.DesktopMain.add(qlnv);
        qlnv.setSize(700, 500);
        qlnv.setVisible(true);
    }

    private void openKhachHang() {
        JQuanLyKhachHang qlkh = new JQuanLyKhachHang();
        this.DesktopMain.add(qlkh);
        qlkh.setVisible(true);
    }

    private void openKhuyenMai() {
        JQuanLyMaKhuyenMai qlkm = new JQuanLyMaKhuyenMai();
        this.DesktopMain.add(qlkm);
        qlkm.setVisible(true);
    }

    private void openSanPham() {
        JQuanLySanPham qlsp = new JQuanLySanPham();
        this.DesktopMain.add(qlsp);
        qlsp.setVisible(true);

    }
    private void openHoaDon(){
        JDanhSachHoaDon qlhd = new JDanhSachHoaDon();
        this.DesktopMain.add(qlhd);
        qlhd.setVisible(true);
    }
    private void openThongKeSanPham(){
        JThongKeSanPham tksp = new JThongKeSanPham();
        this.DesktopMain.add(tksp);
        tksp.setVisible(true);
    }
    private void openThongKeNhanVien(){
        JThongKeNhanVien tknv = new JThongKeNhanVien();
        this.DesktopMain.add(tknv);
        tknv.setVisible(true);
    }
    private void openThongKeKhachHang(){
        JThongKeKhachHang tkkh = new JThongKeKhachHang();
        this.DesktopMain.add(tkkh);
        tkkh.setVisible(true);
    }
    private void openDoanhThu() {
        JThongKeDoanhThu tkdt = new JThongKeDoanhThu();
        this.DesktopMain.add(tkdt);
        tkdt.setVisible(true);
    }

    private void openBaoCao() {
        BaoCao bc = new BaoCao();
        this.DesktopMain.add(bc);
        bc.setVisible(true);
        
    }

    private void baoLoi() {
        Exceptions.sendMail();
    }

    private void openDangNhap() {
        new DangNhap(this, true).setVisible(true);
    }

    private void openDoiMK() {
        new DoiMatKhau(this, true).setVisible(true);
    }

    private void openDangXuat() {
        new DangNhap(this, true).setVisible(true);
    }

    private void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn thoát ứng dụng")) {
            System.exit(0);
        }
        
    }
    
}
