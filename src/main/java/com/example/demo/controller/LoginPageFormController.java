package com.example.demo.controller;

import com.jfoenix.controls.JFXButton;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
import java.util.Timer;

public class LoginPageFormController implements Initializable {
    public AnchorPane loginPanel;
    public TextField username;
    public PasswordField password;
    public JFXButton loginBtn;

    @FXML
    private JFXButton fingerPrintbtn;

    String name="sameera";
    String pass="1234";

    public void loginOnAction(MouseEvent actionEvent) throws IOException {

       if ((name.equals(username.getText()) &  (pass.equals(password.getText())))) {

            AnchorPane load = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/view/dashboardForm.fxml")));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            Stage stage1 = (Stage) loginPanel.getScene().getWindow();
            stage1.close();
            stage.centerOnScreen();
            stage.show();
        }else {


           password.setStyle("-fx-border-color: red;");
           username.setStyle("-fx-border-color: red;");

           username.clear();
           password.clear();

           Alert alert = new Alert(Alert.AlertType.ERROR);
           alert.setTitle("Error");
           alert.setHeaderText(null);
           alert.setContentText("Invalid Username or Password");
           alert.showAndWait();
       }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
loginPanel.setOnKeyPressed(event -> {
    if (event.getCode() == KeyCode.ENTER) {
loginBtn.fire();
            }
});

    }

    public void loginOnActionEnter(KeyEvent KeyEvent) throws IOException {
//        if (KeyEvent != null && KeyEvent.getCode() == KeyCode.ENTER) {
//            if ((name.equals(username.getText()) &  (pass.equals(password.getText())))) {
//
//                AnchorPane load = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/view/dashboardForm.fxml")));
//                Stage stage = new Stage();
//                stage.setScene(new Scene(load));
//                Stage stage1 = (Stage) loginPanel.getScene().getWindow();
//                stage1.close();
//                stage.centerOnScreen();
//                stage.show();
//            }else {
//
//
//                password.setStyle("-fx-border-color: red;");
//                username.setStyle("-fx-border-color: red;");
//
//                username.clear();
//                password.clear();
//
//                Alert alert = new Alert(Alert.AlertType.ERROR);
//                alert.setTitle("Error");
//                alert.setHeaderText(null);
//                alert.setContentText("Invalid Username or Password");
//                alert.showAndWait();
//            }
//        }

    }

    public void FaceidOnAction(ActionEvent actionEvent) throws IOException {
        AnchorPane load = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/view/FaceID.fxml")));
        Stage stage = new Stage();
        stage.setScene(new Scene(load));
        Stage stage1 = (Stage) loginPanel.getScene().getWindow();
        stage.centerOnScreen();
        stage.show();
    }

    public void logintBtnOnAction(ActionEvent actionEvent) throws IOException {
        if ((name.equals(username.getText()) &  (pass.equals(password.getText())))) {

            AnchorPane load = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/view/dashboardForm.fxml")));
            Stage stage = new Stage();
            stage.setScene(new Scene(load));
            Stage stage1 = (Stage) loginPanel.getScene().getWindow();
            stage1.close();
            stage.centerOnScreen();
            stage.show();
        }else {


            password.setStyle("-fx-border-color: red;");
            username.setStyle("-fx-border-color: red;");

            username.clear();
            password.clear();

            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText(null);
            alert.setContentText("Invalid Username or Password");
            alert.showAndWait();
        }
    }

    public void FingerPrintOnAction(ActionEvent actionEvent) throws IOException, InterruptedException {
        AnchorPane load = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/com/example/view/FingerPrintID.fxml")));
        Stage stage = new Stage();
        stage.setScene(new Scene(load));
        Stage stage1 = (Stage) loginPanel.getScene().getWindow();
        stage.centerOnScreen();
        stage.show();

        
    }
}
