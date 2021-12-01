/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.UI;

import com.DungNgoc.DAO.thongKeNhanVienDAO;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.CategoryDataset;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author TVD
 */
public class chartNhanVien {
    static thongKeNhanVienDAO nv=new thongKeNhanVienDAO();
    public static JFreeChart createChart() {
        JFreeChart barChart = ChartFactory.createBarChart(
                "Thống kê nhân viên",
                "Mã nhân viên", "Số sản phẩm",
                createDataset(), PlotOrientation.HORIZONTAL, false, true, true);
        return barChart;
    }

    private static CategoryDataset createDataset() {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List<Object[]>list=nv.baoCaoSanPham();
        for(Object[] x:list){
            dataset.addValue(x[3]==null?0:(Number)x[3],x[1]+"",x[0]+"");
        }
        return dataset;
    }

    public static void chart() {
        ChartPanel chartPanel = new ChartPanel(createChart());
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        JFrame frame = new JFrame();
        frame.add(chartPanel);
        frame.setSize(750, 400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
