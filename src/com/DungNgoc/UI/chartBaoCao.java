/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.DungNgoc.UI;

import com.DungNgoc.DAO.BaoCaoDAO;
import java.util.List;
import javax.swing.JFrame;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

/**
 *
 * @author Admin
 */
public class chartBaoCao extends javax.swing.JFrame{
    static BaoCaoDAO dao=new BaoCaoDAO();
    public static JFreeChart createChart(PieDataset dataset) {
        JFreeChart chart = ChartFactory.createPieChart(
                "Báo cáo cuối ngày", dataset, true, true, true);
        return chart;
    }

    public static PieDataset createDataset(String date){
        DefaultPieDataset dataset = new DefaultPieDataset();
        List<Object[]> list =dao.baoCaoSanPham(date);
        for(Object[] x:list){
            dataset.setValue(x[0]+" - "+x[1], Integer.parseInt(x[2]+""));
        }
        return dataset;
    }

    public static void chartBaoCao(String date) {
        JFreeChart pieChart = createChart(createDataset(date));
        ChartPanel chartPanel = new ChartPanel(pieChart);
        JFrame frame = new JFrame();
        frame.add(chartPanel);
        frame.setSize(600, 400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
