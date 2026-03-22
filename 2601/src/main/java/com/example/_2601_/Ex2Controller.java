package com.example._2601_;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.List;

public class Ex2Controller {
    @FXML
    private Button ex1btn;

    @FXML
    private Button ex2btn;

    @FXML
    private Button ex3btn;

    @FXML
    private Button ex4btn;

    @FXML
    private Button OkButton;

    @FXML
    private Button addButton;

    @FXML
    private Label answerLabel;

    @FXML
    private Button cancelButton;

    @FXML
    private ListView<Integer> dataListView;

    @FXML
    private TextField numberTextField;

    @FXML
    void addButtonOnAction(ActionEvent event) {
        if (numberTextField.getText().isEmpty()) {
            return;
        }
        try {
            int x = Integer.parseInt(numberTextField.getText().toString());
            dataListView.getItems().add(x);
        } catch (NumberFormatException ex) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setContentText("error");
            alert.showAndWait();
        } finally {
            numberTextField.setText("");
        }
    }

    @FXML
    void okButtonOnAction(ActionEvent event) {
        List<Integer> data = dataListView.getItems();
        int sum = 0;
        int amount = 0;
        double result = 0;
        for (int i : data) {
            if (i % 8 == 0 && i != 0) {
                sum += i;
                amount++;
                result = (double) sum / amount;
            } else {
                answerLabel.setText("NO");
            }
            if (i == 0) {
                answerLabel.setText("error");
            }
        }
        answerLabel.setText(String.valueOf(result));
    }


    @FXML
    void cancelButtonOnAction(ActionEvent event) {
        Platform.exit();
    }

    @FXML
    public void initialize() {
        OkButton.setOnAction(event -> {
            okButtonOnAction(event);
        });
        cancelButton.setOnAction(event -> {
            cancelButtonOnAction(event);
        });
        addButton.setOnAction(event -> {
            addButtonOnAction(event);
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
