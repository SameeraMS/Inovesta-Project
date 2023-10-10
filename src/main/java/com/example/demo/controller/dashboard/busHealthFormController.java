package com.example.demo.controller.dashboard;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class busHealthFormController implements Initializable {
    @FXML
    private LineChart<?, ?> chart;
    public void searchOnAction(MouseEvent mouseEvent) {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        XYChart.Series series = new XYChart.Series();

        series.setName("Income");
        series.getData().add(new XYChart.Data("01/06",8));
        series.getData().add(new XYChart.Data("02/06",12));
        series.getData().add(new XYChart.Data("03/06",10));
        series.getData().add(new XYChart.Data("04/06",15));
        series.getData().add(new XYChart.Data("05/06",12));
        series.getData().add(new XYChart.Data("06/06",8));
        series.getData().add(new XYChart.Data("07/06",5));
        chart.getData().addAll(series);
    }
}
