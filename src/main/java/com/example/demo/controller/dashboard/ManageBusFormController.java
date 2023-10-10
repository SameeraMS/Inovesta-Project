package com.example.demo.controller.dashboard;

import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class ManageBusFormController {
    public AnchorPane manageBusChangePane;

    public void addbusOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/bus/addBusForm.fxml"));
        manageBusChangePane.getChildren().clear();
        manageBusChangePane.getChildren().add(anchorPane);
    }

    public void deletebusOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/bus/deleteBusForm.fxml"));
        manageBusChangePane.getChildren().clear();
        manageBusChangePane.getChildren().add(anchorPane);
    }

    public void viewbusOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/bus/viewBusForm.fxml"));
        manageBusChangePane.getChildren().clear();
        manageBusChangePane.getChildren().add(anchorPane);
    }

    public void updatebusOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/bus/updateBusForm.fxml"));
        manageBusChangePane.getChildren().clear();
        manageBusChangePane.getChildren().add(anchorPane);
    }
}
