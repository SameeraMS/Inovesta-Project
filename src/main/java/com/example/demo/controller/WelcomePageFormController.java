package com.example.demo.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;
import java.util.Stack;

public class WelcomePageFormController {
    public AnchorPane panel;

    public void GetStartOnAction(MouseEvent mouseEvent) throws IOException {
        Stage window = (Stage) panel.getScene().getWindow();
        Stage stage = new Stage();
        Parent ob = (FXMLLoader.load((Objects.requireNonNull(getClass().getResource("/com/example/view/loginPageForm.fxml")))));
        stage.setScene(new Scene(ob));
        window.close();
        stage.show();
        stage.centerOnScreen();
    }
}
