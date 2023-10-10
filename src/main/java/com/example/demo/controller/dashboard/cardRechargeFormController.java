package com.example.demo.controller.dashboard;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class cardRechargeFormController {


    public AnchorPane stockChangePane1;
    public TextField txt1;
    public TextField txt2;
    public TextField txt3;
    public TextField txt4;
    public Label lbl1;
    public Label lbl2;
    public Label lbl3;
    public Label lbl4;
    public Button NewCard;
    public AnchorPane cardRechargePane;


    public void BtlRechargeONAction(ActionEvent actionEvent) {
        String text1 = txt1.getText();
        String text2 = txt2.getText();
        String text3 = txt3.getText();


        lbl1.setText(text1);
        lbl2.setText(text2);
        lbl3.setText(text3);

        txt1.clear();
        txt2.clear();
        txt3.clear();
        txt4.clear();

    }


    public void CardRecharge(MouseEvent mouseEvent) throws IOException {

        AnchorPane load = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/dashboard/addNewCard.fxml")));
        Stage stage = new Stage();
        stage.setScene(new Scene(load));
        Stage stage1 = (Stage) cardRechargePane.getScene().getWindow();
        stage.centerOnScreen();
        stage.show();
    }
}
