package com.example.demo.controller.dashboard;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class DashboardChangeFormController implements Initializable {

    @FXML
    private BarChart<?, ?> chart1;

    @FXML
    private BarChart<?, ?> chart2;
    public AnchorPane dashboardChangePane;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
       chart1();
       chart2();

    }

    private void chart2() {
        XYChart.Series series = new XYChart.Series();

        series.setName("Income");
        series.getData().add(new XYChart.Data("Monday",8));
        series.getData().add(new XYChart.Data("Tuesday",12));
        series.getData().add(new XYChart.Data("Wednesday",10));
        series.getData().add(new XYChart.Data("Thursday",15));
        series.getData().add(new XYChart.Data("Friday",12));
        series.getData().add(new XYChart.Data("Saturday",8));
        series.getData().add(new XYChart.Data("Sunday",5));
        chart2.getData().addAll(series);
    }

    public void chart1(){
        XYChart.Series series = new XYChart.Series();

        series.setName("Incomes");
        series.getData().add(new XYChart.Data("Monday",4));
        series.getData().add(new XYChart.Data("Tuesday",15));
        series.getData().add(new XYChart.Data("Wednesday",6));
        series.getData().add(new XYChart.Data("Thursday",14));
        series.getData().add(new XYChart.Data("Friday",12));
        series.getData().add(new XYChart.Data("Saturday",8));
        series.getData().add(new XYChart.Data("Sunday",9));
        chart1.getData().addAll(series);

    }
}
