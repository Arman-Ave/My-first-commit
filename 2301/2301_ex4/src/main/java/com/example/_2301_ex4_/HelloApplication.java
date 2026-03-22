package com.example._2301_ex4_;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/_2304_ex4_.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Практическая работа 1");
        stage.setScene(scene);
        stage.show();
    }
}
