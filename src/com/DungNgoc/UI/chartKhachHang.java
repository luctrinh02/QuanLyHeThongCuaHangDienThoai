/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.UI;

import com.DungNgoc.DAO.thongKeKhachHangDAO;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
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
public class chartKhachHang {
    static thongKeKhachHangDAO tk=new thongKeKhachHangDAO();
    public static JFreeChart createChart() {
        JFreeChart barChart = ChartFactory.createBarChart(
                "Thống kê top 5 khách hàng",
                "Tên khách", "Số tiền(triệu đồng)",
                createDataset(), PlotOrientation.HORIZONTAL, false, true, true);
        return barChart;
    }

    private static CategoryDataset createDataset() {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List<Object[]>list=tk.top5();
        for(Object[] x:list){
            dataset.addValue(Double.parseDouble(x[2]+"")/1000000, "", x[1]+"");
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
