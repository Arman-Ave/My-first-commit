package com.example._2301_ex1_;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/org/example/_1901_/_1901_.fxml"));
        Scene scene = new Scene(root);
        stage.setTitle("Практическая работа 1");
        stage.setScene(scene);
        stage.show();
    }
}
