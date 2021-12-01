/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.UI;

import com.DungNgoc.DAO.thongKeDoanhThuDAO;
import com.DungNgoc.untils.Xdate;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author Admin
 */
public class ThongKeDoanhThu {

    static thongKeDoanhThuDAO tk = new thongKeDoanhThuDAO();

    private static DefaultCategoryDataset createDataset() {
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        List<Object[]> list = tk.doanhThu();
        for(Object[] x:list){
            dataset.addValue( Double.parseDouble(x[1]+"")/1000000, "", Xdate.toString((Date) x[0], "dd/MM/yyyy"));
        }
        return dataset;
    }

    public static JFreeChart createLineChart() {
        JFreeChart lineChart = ChartFactory.createLineChart(
                "Biểu đồ doanh thu của cửa hàng".toUpperCase(),
                "Ngày", "Doanh thu (triệu đồng)", createDataset(),
                PlotOrientation.VERTICAL, true, true, true);
        return lineChart;
    }

    public static void chart() {
        ChartPanel chartPanel = new ChartPanel(createLineChart());
        chartPanel.setPreferredSize(new java.awt.Dimension(560, 367));
        JFrame frame = new JFrame();
        frame.add(chartPanel);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }

}
