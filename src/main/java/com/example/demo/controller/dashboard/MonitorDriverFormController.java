package com.example.demo.controller.dashboard;

import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class MonitorDriverFormController {
    public AnchorPane searchPain;

    public void searchOnAction(MouseEvent mouseEvent) throws IOException {
        AnchorPane anchorPane =  FXMLLoader.load(getClass().getResource("/com/example/view/monitorDriver/monitorDriverSearchForm.fxml"));
        searchPain.getChildren().clear();
        searchPain.getChildren().add(anchorPane);
    }
}
