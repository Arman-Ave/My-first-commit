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


public class Ex2Controller {

    @FXML
    private TextField sideX1;
    @FXML
    private TextField sideX2;
    @FXML
    private TextField sideX3;
    @FXML
    private TextField sideY1;
    @FXML
    private TextField sideY2;
    @FXML
    private TextField sideY3;

    @FXML
    private Label pLabel;
    @FXML
    private Label sLabel;
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
            sideX1.setText("");
            sideX2.setText("");
            sideX3.setText("");
            sideY1.setText("");
            sideY2.setText("");
            sideY3.setText("");
            pLabel.setText("Периметр: ");
            sLabel.setText("Площадь: ");
        });
        calcbtn.setOnAction(actionEvent -> {
            double x1 = Double.parseDouble(sideX1.getText());
            double x2 = Double.parseDouble(sideX2.getText());
            double x3 = Double.parseDouble(sideX3.getText());
            double y1 = Double.parseDouble(sideY1.getText());
            double y2 = Double.parseDouble(sideY2.getText());
            double y3 = Double.parseDouble(sideY3.getText());
            double a = sqrt(pow(x2 - x1, 2) + pow(y2 - y1, 2));
            double b = sqrt(pow(x3 - x2, 2) + pow(y3 - y2, 2));
            double c = sqrt(pow(x1 - x3, 2) + pow(y1 - y3, 2));
            double p = a + b + c;
            double p1 = p / 2.0;
            double s = sqrt(p1 * (p1 - a) * (p1 - b) * (p1 - c));
            pLabel.setText("Периметр: " + p);
            sLabel.setText("Площадь: " + s);
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