package com.example._2001_;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import static java.lang.Math.sqrt;

public class HelloApplication extends Application {

    private Stage primaryStage;
    private Scene scene1, scene2, scene3;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Практ. раб. 2");
        primaryStage.show();
    }

    private Scene createScene1() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число");
        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");
        Label resLabel = new Label();
        Label resLabel1 = new Label();
        Label exLabel = new Label("Задание 1");

        Button ex1btn = new Button("1");
        ex1btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene1);
        });
        Button ex2btn = new Button("2");
        ex2btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene2);
        });
        Button ex3btn = new Button("3");
        ex3btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene3);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            resLabel.setText("");
            resLabel1.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double a = Double.parseDouble(sideA.getText());
            int b = (int) (a % 10);
            int c = (int) ((a / 10) % 10);
            resLabel.setText("Последняя цифра: " + b);
            resLabel1.setText("Средняя цифра: " + c);
        });

        HBox root1 = new HBox(10, new Label("Введите трехзначное число = "), sideA);
        root1.setStyle("-fx-alignment: center");
        HBox root2 = new HBox(10, ex1btn, ex2btn, ex3btn);
        root2.setStyle("-fx-alignment: center");
        VBox root3 = new VBox(10, exLabel, root1, calcbtn, resLabel, resLabel1, clearbtn, root2);
        root3.setStyle("-fx-alignment: center");
        return new Scene(root3, 400, 400);

    }

    private Scene createScene2() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число");
        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");
        Label resLabel = new Label();
        Label exLabel = new Label("Задание 2");

        Button ex1btn = new Button("1");
        ex1btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene1);
        });
        Button ex2btn = new Button("2");
        ex2btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene2);
        });
        Button ex3btn = new Button("3");
        ex3btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene3);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double a = Double.parseDouble(sideA.getText());
            int b = (int) ((a / 100) % 10);
            resLabel.setText("Цифра из разряда сотен = " + b);
        });

        HBox root1 = new HBox(10, new Label("Введите число >999 = "), sideA);
        root1.setStyle("-fx-alignment: center");
        HBox root2 = new HBox(10, ex1btn, ex2btn, ex3btn);
        root2.setStyle("-fx-alignment: center");
        VBox root3 = new VBox(10, exLabel, root1, calcbtn, resLabel, clearbtn, root2);
        root3.setStyle("-fx-alignment: center");
        return new Scene(root3, 400, 400);
    }

    private Scene createScene3() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число");
        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");
        Label resLabel = new Label();
        Label exLabel = new Label("Задание 3");

        Button ex1btn = new Button("1");
        ex1btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene1);
        });
        Button ex2btn = new Button("2");
        ex2btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene2);
        });
        Button ex3btn = new Button("3");
        ex3btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene3);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            int a = Integer.parseInt(sideA.getText());
            int b = (5 + (a - 1)) % 7;
            if (b == 0) {
                b = 7;
            }
            resLabel.setText("Номер дня недели = " + b);
        });

        HBox root1 = new HBox(10, new Label("Введите число от 1 до 365 = "), sideA);
        root1.setStyle("-fx-alignment: center");
        HBox root2 = new HBox(10, ex1btn, ex2btn, ex3btn);
        root2.setStyle("-fx-alignment: center");
        VBox root3 = new VBox(10, exLabel, root1, calcbtn, resLabel, clearbtn, root2);
        root3.setStyle("-fx-alignment: center");
        return new Scene(root3, 400, 400);
    }
}