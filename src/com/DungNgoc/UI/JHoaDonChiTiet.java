/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.UI;

import com.DungNgoc.DAO.HoaDonChiTietDAO;
import com.DungNgoc.DAO.HoaDonDAO;
import com.DungNgoc.DAO.KhachHangDAO;
import com.DungNgoc.DAO.LoaiMayDAO;
import com.DungNgoc.DAO.MauDAO;
import com.DungNgoc.DAO.NhanVienDAO;
import com.DungNgoc.DAO.SanPhamDAO;
import com.DungNgoc.DAO.doiTraDAO;
import com.DungNgoc.entitys.HoaDon;
import com.DungNgoc.entitys.HoaDonChiTiet;
import com.DungNgoc.entitys.KhachHang;
import com.DungNgoc.entitys.LoaiMay;
import com.DungNgoc.entitys.Mau;
import com.DungNgoc.entitys.NhanVien;
import com.DungNgoc.entitys.SanPham;
import com.DungNgoc.untils.MsgBox;
import java.text.DecimalFormat;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LINH
 */
public class JHoaDonChiTiet extends javax.swing.JDialog {

    /**
     * Creates new form JHoaDonChiTiet
     */
    HoaDonChiTietDAO hdctdao = new HoaDonChiTietDAO();
    HoaDonDAO hddao = new HoaDonDAO();
    KhachHangDAO khdao = new KhachHangDAO();
    NhanVienDAO nvdao = new NhanVienDAO();
    SanPhamDAO spdao = new SanPhamDAO();
    LoaiMayDAO lmdao = new LoaiMayDAO();
    MauDAO mdao = new MauDAO();
    DefaultTableModel dtm;
    int id;
    doiTraDAO dtDAO=new doiTraDAO();
    DecimalFormat df = new DecimalFormat("#.000");
    public JHoaDonChiTiet(java.awt.Frame parent, boolean modal, String idbill) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        id = Integer.parseInt(idbill);
        this.init();
    }

    private JHoaDonChiTiet(JFrame jFrame, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTenKH = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtMaHD = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHoaDonChiTiet = new javax.swing.JTable();
        txtNgayMua = new javax.swing.JTextField();
        lblDoiHang = new javax.swing.JLabel();
        btnTraHang = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Hóa Đơn Chi Tiết");

        jLabel2.setText("Tên Khách Hàng:");

        txtTenKH.setEnabled(false);

        jLabel3.setText("Mã Hóa Đơn:");

        txtMaHD.setEnabled(false);

        txtTenNV.setEnabled(false);

        jLabel4.setText("Ngày Mua:");

        jLabel5.setText("Tên NV:");

        tblHoaDonChiTiet.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã SP", "Tên SP", "Số Lượng", "Màu Sắc", "Dung Lượng", "Ram", "Đơn Giá", "Giá Bán", "Thành Tiền"
            }
        ));
        jScrollPane1.setViewportView(tblHoaDonChiTiet);

        txtNgayMua.setEnabled(false);

        lblDoiHang.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        lblDoiHang.setText("Đã trả");

        btnTraHang.setText("Trả hàng");
        btnTraHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTraHangActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(241, 241, 241)
                .addComponent(jLabel1)
                .addGap(101, 243, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(lblDoiHang, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNgayMua, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnTraHang)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(lblDoiHang, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(txtNgayMua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaHD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(btnTraHang)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTraHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTraHangActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnTraHangActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JHoaDonChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JHoaDonChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JHoaDonChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JHoaDonChiTiet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JHoaDonChiTiet dialog = new JHoaDonChiTiet(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTraHang;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDoiHang;
    private javax.swing.JTable tblHoaDonChiTiet;
    private javax.swing.JTextField txtMaHD;
    private javax.swing.JTextField txtNgayMua;
    private javax.swing.JTextField txtTenKH;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
private void init() {
        tblHoaDonChiTiet.setSelectionMode(0);
        dtm = (DefaultTableModel) tblHoaDonChiTiet.getModel();
        this.fillTable();
    }

    private void fillTable() {
        List<HoaDonChiTiet> lsthdct = hdctdao.selectById(id, null);
        HoaDon hd = hddao.selectById(id);
        this.txtMaHD.setText(String.valueOf(hd.getIdBill()));
        this.txtNgayMua.setText(hd.getDateBill());
        NhanVien nv = nvdao.selectById(hd.getIdStaff());
        this.txtTenNV.setText(nv.getName());
        KhachHang kh = khdao.selectById(String.valueOf(hd.getIdGuest()));
        this.txtTenKH.setText(kh.getName());
        for (int i = 0; i < lsthdct.size(); i++) {
            HoaDonChiTiet hdct = (HoaDonChiTiet) lsthdct.get(i);
            SanPham sp = spdao.selectById(String.valueOf(hdct.getIdProduct()));
            LoaiMay lm = lmdao.selectById(sp.getModelId());
            Mau mau = mdao.selectById(sp.getColorId());
            Object[] rowdata = new Object[]{
                hdct.getIdProduct(),
                lm.getName(),
                hdct.getCount(),
                mau.getName(),
                sp.getSize(),
                sp.getRam(),
                df.format(sp.getPrice()),
                df.format(sp.getPrice()),
                df.format(hdct.getCount() * sp.getPrice())
            };
            dtm.addRow(rowdata);
        }
    }
    boolean checkSoLuong(String a, int row) {
        try {
            int soLuong = Integer.parseInt(a);
            double b = Double.parseDouble(a);
            if (soLuong <= 0) {
                MsgBox.alert(this, "Số lượng phải lớn hơn 0");
                return false;
            } else if (b != soLuong) {
                MsgBox.alert(this, "Số lượng Phải là số nguyên");
                return false;
            } else if (soLuong > Integer.parseInt(tblHoaDonChiTiet.getValueAt(row, 2) + "")) {
                MsgBox.alert(this, "Số lượng không đủ");
                return false;
            } else {
                return true;
            }
        } catch (Exception e) {
            MsgBox.alert(this, "SỐ lượng phải là số nguyên");
            return false;
        }
    }
    void traHang(){
        try {
            int index=tblHoaDonChiTiet.getSelectedRow();
            String ma=tblHoaDonChiTiet.getValueAt(index, 0)+"";
            String a=MsgBox.promt(this, "Nhập số lượng");
            if(checkSoLuong(a, index)){
                HoaDonChiTiet hd=new HoaDonChiTiet(id, ma,Integer.parseInt(tblHoaDonChiTiet.getValueAt(index, 2) + "") - Integer.parseInt(a), 0.0);
                if(!a.equals(tblHoaDonChiTiet.getValueAt(index, 2) + "")){
                    hdctdao.update(hd);
                    fillTable();
                }else{
                    hdctdao.delete(hd);
                    fillTable();
                }
                dtDAO.them(id, ma, Integer.parseInt(a));
            }
        } catch (Exception e) {
            MsgBox.alert(this, "Chưa chọn sản phẩm");
        }
    }
}
