package com.example._2401_;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javafx.event.ActionEvent;

import java.io.IOException;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;


public class Ex3Controller {

    @FXML
    private TextField sideA;
    @FXML
    private Label resLabel;
    @FXML
    private Button calcbtn;
    @FXML
    private Button clearbtn;


    @FXML
    private Button ex1btn;
    @FXML
    private Button ex2btn;
    @FXML
    private Button ex3btn;
    @FXML
    private Button ex4btn;

    @FXML
    private void initialize() {
        ex1btn.setOnAction(e -> {
            try {
                switchToTask1(e);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        ex2btn.setOnAction(e -> {
            try {
                switchToTask2(e);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        ex3btn.setOnAction(e -> {
            try {
                switchToTask3(e);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        ex4btn.setOnAction(e -> {
            try {
                switchToTask4(e);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            resLabel.setText("В градусах: ");
        });
        calcbtn.setOnAction(actionEvent -> {
            double a = Double.parseDouble(sideA.getText());
            double PI = 3.14;
            double c = a * (180.0 / PI);
            resLabel.setText("В градусах: " + c);
        });
    }

    @FXML
    private void switchToTask1(ActionEvent event) throws IOException {
        loadFXML("pr01_ex1_btn.fxml", event);
    }

    @FXML
    private void switchToTask2(ActionEvent event) throws IOException {
        loadFXML("pr01_ex2_btn.fxml", event);
    }

    @FXML
    private void switchToTask3(ActionEvent event) throws IOException {
        loadFXML("pr01_ex3_btn.fxml", event);
    }

    @FXML
    private void switchToTask4(ActionEvent event) throws IOException {
        loadFXML("pr01_ex4_btn.fxml", event);
    }

    private void loadFXML(String fxmlFile, ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }


}
