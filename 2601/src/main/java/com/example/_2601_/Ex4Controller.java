package com.example._2601_;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

import static java.lang.Math.pow;

public class Ex4Controller {
    @FXML
    private Button ex1btn;

    @FXML
    private Button ex2btn;

    @FXML
    private Button ex3btn;

    @FXML
    private Button ex4btn;

    @FXML
    private Button calcbtn;

    @FXML
    private Button clearbtn;

    @FXML
    private Label resLabel;

    @FXML
    private TextField sideA;

    @FXML
    private TextField sideN;

    @FXML
    public void initialize() {
        calcbtn.setOnAction(event -> {
            double a = Double.parseDouble(sideA.getText());
            int n = Integer.parseInt(sideN.getText());
            double sum = 0;
            for (int i = 0; i <= n; i++) {
                sum += pow(a, i);
            }
            resLabel.setText("Результат: " + sum);
        });
        clearbtn.setOnAction(event -> {
            sideA.setText("");
            sideN.setText("");
            resLabel.setText("Результат: ");
        });
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
    }

    @FXML
    private void switchToTask1(ActionEvent event) throws IOException {
        loadFXML("2601_ex1.fxml", event);
    }

    @FXML
    private void switchToTask2(ActionEvent event) throws IOException {
        loadFXML("2601_ex2.fxml", event);
    }

    @FXML
    private void switchToTask3(ActionEvent event) throws IOException {
        loadFXML("2601_ex3.fxml", event);
    }

    @FXML
    private void switchToTask4(ActionEvent event) throws IOException {
        loadFXML("2601_ex4.fxml", event);
    }

    private void loadFXML(String fxmlFile, ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource(fxmlFile));
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.setScene(new Scene(root));
    }
}
