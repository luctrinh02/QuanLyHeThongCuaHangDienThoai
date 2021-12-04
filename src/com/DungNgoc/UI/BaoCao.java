/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.UI;

import com.DungNgoc.DAO.BaoCaoDAO;
import com.DungNgoc.untils.Exceptions;
import com.DungNgoc.untils.MsgBox;
import com.DungNgoc.untils.Xdate;
import com.DungNgoc.untils.Xmoney;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author lenonvo
 */
public class BaoCao extends javax.swing.JInternalFrame {

    BaoCaoDAO dao = new BaoCaoDAO();

    /**
     * Creates new form BaoCao
     */
    public BaoCao() {
        setClosable(true);
        initComponents();
        init();
    }

    void init() {
        txtThoiGian.setDate(new Date());
        txtThoiGian.setMinSelectableDate(dao.getDate());
        txtThoiGian.setMaxSelectableDate(new Date());
        fillTable();
        tblHangHoa.setAutoCreateRowSorter(true);
        txtDoanhThu.setEditable(false);
        txtSLNN.setEditable(false);
        txtSLSPDaBan.setEditable(false);
        txtSPBanNN.setEditable(false);
        txtSoGiaoDich.setEditable(false);
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
        lblBaoCaoCuoiNgay = new javax.swing.JLabel();
        tabs = new javax.swing.JTabbedPane();
        PanelHangHoa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHangHoa = new javax.swing.JTable();
        PanelTongHop = new javax.swing.JPanel();
        lblSoGiaoDich = new javax.swing.JLabel();
        txtSLSPDaBan = new javax.swing.JTextField();
        lblSoLuongSPDaBan = new javax.swing.JLabel();
        lblSPBanNN = new javax.swing.JLabel();
        lblSPBanIN = new javax.swing.JLabel();
        txtSLNN = new javax.swing.JTextField();
        lblDoanhThu = new javax.swing.JLabel();
        txtSoGiaoDich = new javax.swing.JTextField();
        txtSPBanNN = new javax.swing.JTextField();
        txtDoanhThu = new javax.swing.JTextField();
        lblThoiGian = new javax.swing.JLabel();
        btnShow = new javax.swing.JButton();
        txtThoiGian = new com.toedter.calendar.JDateChooser();
        btnLoc = new javax.swing.JButton();

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

        lblBaoCaoCuoiNgay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblBaoCaoCuoiNgay.setText("Báo cáo cuối ngày");

        tabs.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12), new java.awt.Color(0, 51, 255))); // NOI18N

        tblHangHoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "MÃ SP", "TÊN SP", "SỐ LƯỢNG SẢN PHẨM ", "DOANH THU"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblHangHoa);

        javax.swing.GroupLayout PanelHangHoaLayout = new javax.swing.GroupLayout(PanelHangHoa);
        PanelHangHoa.setLayout(PanelHangHoaLayout);
        PanelHangHoaLayout.setHorizontalGroup(
            PanelHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHangHoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 645, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanelHangHoaLayout.setVerticalGroup(
            PanelHangHoaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelHangHoaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabs.addTab("Hàng hóa", PanelHangHoa);

        lblSoGiaoDich.setText("Số giao dịch");

        lblSoLuongSPDaBan.setText("Số lượng sản phẩm đã bán");

        lblSPBanNN.setText("Sản phẩm bán nhiều nhất");

        lblSPBanIN.setText("Số lượng bán nhiều nhất");

        lblDoanhThu.setText("Doanh thu");

        javax.swing.GroupLayout PanelTongHopLayout = new javax.swing.GroupLayout(PanelTongHop);
        PanelTongHop.setLayout(PanelTongHopLayout);
        PanelTongHopLayout.setHorizontalGroup(
            PanelTongHopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongHopLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(PanelTongHopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTongHopLayout.createSequentialGroup()
                        .addComponent(lblSoGiaoDich)
                        .addGap(112, 112, 112))
                    .addGroup(PanelTongHopLayout.createSequentialGroup()
                        .addGroup(PanelTongHopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSPBanNN)
                            .addComponent(lblDoanhThu)
                            .addComponent(lblSPBanIN)
                            .addComponent(lblSoLuongSPDaBan))
                        .addGap(39, 39, 39)))
                .addGroup(PanelTongHopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSPBanNN, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                    .addComponent(txtSLSPDaBan)
                    .addComponent(txtSoGiaoDich)
                    .addComponent(txtSLNN)
                    .addComponent(txtDoanhThu))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        PanelTongHopLayout.setVerticalGroup(
            PanelTongHopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTongHopLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(PanelTongHopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSoGiaoDich, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoGiaoDich))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelTongHopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSLSPDaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSoLuongSPDaBan))
                .addGap(18, 18, 18)
                .addGroup(PanelTongHopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSPBanNN)
                    .addComponent(txtSPBanNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTongHopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSPBanIN)
                    .addComponent(txtSLNN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PanelTongHopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtDoanhThu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoanhThu))
                .addGap(15, 15, 15))
        );

        tabs.addTab("Tổng hợp", PanelTongHop);

        lblThoiGian.setText("Thời gian");

        btnShow.setText("Show");
        btnShow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowActionPerformed(evt);
            }
        });

        txtThoiGian.setDateFormatString("yyyy-MM-dd");
        txtThoiGian.setMaxSelectableDate(new java.util.Date(253370743273000L));

        btnLoc.setText("Lọc");
        btnLoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLocActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addComponent(lblThoiGian)
                        .addGap(18, 18, 18)
                        .addComponent(txtThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnLoc)
                        .addGap(166, 166, 166)
                        .addComponent(btnShow, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(318, 318, 318)
                        .addComponent(lblBaoCaoCuoiNgay)))
                .addContainerGap(76, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(tabs, javax.swing.GroupLayout.Alignment.TRAILING))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBaoCaoCuoiNgay)
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnShow)
                        .addComponent(btnLoc))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblThoiGian)
                        .addComponent(txtThoiGian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(334, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(89, 89, 89)
                    .addComponent(tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(60, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLocActionPerformed
        // TODO add your handling code here:
        fillTable();
        setFrom();
    }//GEN-LAST:event_btnLocActionPerformed

    private void btnShowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowActionPerformed
        // TODO add your handling code here:
        fillTable();
        setFrom();
        if(!"".equals(txtDoanhThu.getText())){
            new jChartBaoCao(frame, true, Xdate.toString(txtThoiGian.getDate(), "yyyy-MM-dd")).setVisible(true);
        }else{
            MsgBox.alert(this, "Cả ngày không bán được gì!");
        }
    }//GEN-LAST:event_btnShowActionPerformed

    void fillTable() {
        DefaultTableModel model = (DefaultTableModel) tblHangHoa.getModel();
        model.setRowCount(0);
        try {
            List<Object[]> list = dao.baoCaoSanPham(Xdate.toString(txtThoiGian.getDate(), "yyyy-MM-dd"));
            for (Object[] x : list) {
                model.addRow(new Object[]{x[0],x[1],x[2],Xmoney.moneyToString(Double.parseDouble(x[3]+""))});
            }
        } catch (Exception e) {
            Exceptions.writeException(e, "đọc liệu");
            e.printStackTrace();
        }
    }

    void setFrom() {
        try {
            String date = Xdate.toString(txtThoiGian.getDate(), "yyyy-MM-dd");
            String[] sanPhamNN = dao.getMax(date);
            txtSoGiaoDich.setText(dao.getSoGiaoDich(date) + "");
            txtSLSPDaBan.setText(dao.getSoSanPham(date) + "");
            txtSPBanNN.setText(sanPhamNN[0] + " - " + dao.getName(sanPhamNN[0]));
            txtDoanhThu.setText(Xmoney.moneyToString(dao.getDoanhThu(date)));
            txtSLNN.setText(sanPhamNN[1]);
        } catch (Exception e) {
            clearForm();
        }
    }

    void clearForm() {
        txtDoanhThu.setText("");
        txtSLNN.setText("");
        txtSLSPDaBan.setText("");
        txtSPBanNN.setText("");
        txtSoGiaoDich.setText("");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelHangHoa;
    private javax.swing.JPanel PanelTongHop;
    private javax.swing.JButton btnLoc;
    private javax.swing.JButton btnShow;
    private javax.swing.JFrame frame;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBaoCaoCuoiNgay;
    private javax.swing.JLabel lblDoanhThu;
    private javax.swing.JLabel lblSPBanIN;
    private javax.swing.JLabel lblSPBanNN;
    private javax.swing.JLabel lblSoGiaoDich;
    private javax.swing.JLabel lblSoLuongSPDaBan;
    private javax.swing.JLabel lblThoiGian;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JTable tblHangHoa;
    private javax.swing.JTextField txtDoanhThu;
    private javax.swing.JTextField txtSLNN;
    private javax.swing.JTextField txtSLSPDaBan;
    private javax.swing.JTextField txtSPBanNN;
    private javax.swing.JTextField txtSoGiaoDich;
    private com.toedter.calendar.JDateChooser txtThoiGian;
    // End of variables declaration//GEN-END:variables
}
