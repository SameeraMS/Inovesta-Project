package com.example.demo.controller.dashboard;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.PieChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class ManageProfitFormController implements Initializable {

    public javafx.scene.chart.LineChart LineChart;
    public PieChart piecharts1;
    public PieChart piecharts12;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        chart();
        setPieChart1();
        setPiecharts12();
    }


    public void chart() {
        XYChart.Series series = new XYChart.Series();

        series.setName("Incomes");
        series.getData().add(new XYChart.Data("Monday",8));
        series.getData().add(new XYChart.Data("Tuesday",12));
        series.getData().add(new XYChart.Data("Wednesday",10));
        series.getData().add(new XYChart.Data("Thursday",15));
        series.getData().add(new XYChart.Data("Friday",12));
        series.getData().add(new XYChart.Data("Saturday",8));
        series.getData().add(new XYChart.Data("Sunday",5));
        LineChart.getData().addAll(series);
    }

      public void setPieChart1(){
        ObservableList<PieChart.Data> data =
                FXCollections.observableArrayList(
                        new PieChart.Data("Income", 45),
                        new PieChart.Data("Expenses", 55)
                );

        piecharts1.setData(data);
    }

    public void setPiecharts12(){
        ObservableList<PieChart.Data> data1 =
                FXCollections.observableArrayList(
                        new PieChart.Data("Income", 10),
                        new PieChart.Data("Expenses", 20),
                        new PieChart.Data("Fuel Cost", 20),
                        new PieChart.Data("Tickets", 35),
                        new PieChart.Data("Extra Costs", 15)

                );

        piecharts12.setData(data1);
//        piecharts12.getData().addAll(data);
    }
}

