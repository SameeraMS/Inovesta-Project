package com.example.demo.controller.dashboard;

import com.jfoenix.controls.JFXComboBox;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.XYChart;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import static java.util.Objects.*;

public class ManageEmployeeFormController implements Initializable {

    @FXML
    private LineChart<?, ?> lineChart1;

    @FXML
    private LineChart<?, ?> lineChart2;
    public JFXComboBox comboBox;
    public AnchorPane employeeChangePane;


    public void addOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/employee/addEmployeeForm.fxml"));
        employeeChangePane.getChildren().clear();
        employeeChangePane.getChildren().add(anchorPane);
    }

    public void deleteOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/employee/deleteEmployeeForm.fxml"));
        employeeChangePane.getChildren().clear();
        employeeChangePane.getChildren().add(anchorPane);
    }

    public void viewOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/employee/viewEmployeeForm.fxml"));
        employeeChangePane.getChildren().clear();
        employeeChangePane.getChildren().add(anchorPane);
    }

    public void updateOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(requireNonNull(getClass().getResource("/com/example/view/employee/updateEmployeeForm.fxml")));
        employeeChangePane.getChildren().clear();
        employeeChangePane.getChildren().add(anchorPane);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        chart1();
        chart2();
    }

    private void chart2() {
        XYChart.Series series = new XYChart.Series();

        series.setName("for a day");
        series.getData().add(new XYChart.Data("Monday",8));
        series.getData().add(new XYChart.Data("Tuesday",12));
        series.getData().add(new XYChart.Data("Wednesday",10));
        series.getData().add(new XYChart.Data("Thursday",15));
        series.getData().add(new XYChart.Data("Friday",12));
        series.getData().add(new XYChart.Data("Saturday",8));
        series.getData().add(new XYChart.Data("Sunday",5));
        lineChart1.getData().addAll(series);
    }

    private void chart1() {
        XYChart.Series series = new XYChart.Series();

        series.setName("Incomes");
        series.getData().add(new XYChart.Data("Monday",2));
        series.getData().add(new XYChart.Data("Tuesday",11));
        series.getData().add(new XYChart.Data("Wednesday",15));
        series.getData().add(new XYChart.Data("Thursday",5));
        series.getData().add(new XYChart.Data("Friday",11));
        series.getData().add(new XYChart.Data("Saturday",6));
        series.getData().add(new XYChart.Data("Sunday",7));
        lineChart2.getData().addAll(series);

    }
}
