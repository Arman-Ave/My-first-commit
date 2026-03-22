package com.example._1901_;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

import static java.lang.Math.*;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1, scene2, scene3, scene4;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        scene4 = createScene4();
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Практ. раб. 01");
        primaryStage.show();
    }

    private Scene createScene1() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число");
        TextField sideB = new TextField();
        sideB.setPromptText("Введите число");
        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");
        Label resLabel = new Label();
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
        Button ex4btn = new Button("4");
        ex4btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene4);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            sideB.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double a = Double.parseDouble(sideA.getText());
            double b = Double.parseDouble(sideB.getText());
            double res = sqrt(a * b);
            resLabel.setText("Результат: " + res);
        });
        HBox root1 = new HBox(10, new Label("А = "), sideA);
        HBox root2 = new HBox(10, new Label("B = "), sideB);
        HBox root4 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn);
        VBox root3 = new VBox(10, exLabel, root1, root2, calcbtn, resLabel, clearbtn, root4);
        root3.setStyle("-fx-alignment: center");
        root1.setStyle("-fx-alignment: center");
        root2.setStyle("-fx-alignment: center");
        root4.setStyle("-fx-alignment: center");
        return new Scene(root3, 400, 400);
    }

    private Scene createScene2() {
        TextField sideX1 = new TextField();
        sideX1.setPromptText("Введите число");

        TextField sideX2 = new TextField();
        sideX2.setPromptText("Введите число");

        TextField sideX3 = new TextField();
        sideX3.setPromptText("Введите число");

        TextField sideY1 = new TextField();
        sideY1.setPromptText("Введите число");

        TextField sideY2 = new TextField();
        sideY2.setPromptText("Введите число");

        TextField sideY3 = new TextField();
        sideY3.setPromptText("Введите число");

        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");
        Label resLabel = new Label();
        Label resLabel1 = new Label();
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
        Button ex4btn = new Button("4");
        ex4btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene4);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideX1.setText("");
            sideX2.setText("");
            sideX3.setText("");
            sideY1.setText("");
            sideY2.setText("");
            sideY3.setText("");
            resLabel.setText("");
            resLabel1.setText("");
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
            resLabel.setText("Периметр = " + p);
            resLabel1.setText("Площадь = " + s);
        });
        HBox root1 = new HBox(10, new Label("X1 = "), sideX1);
        HBox root2 = new HBox(10, new Label("X2 = "), sideX2);
        HBox root3 = new HBox(10, new Label("X3 = "), sideX3);
        HBox root4 = new HBox(10, new Label("Y1 = "), sideY1);
        HBox root5 = new HBox(10, new Label("Y2 = "), sideY2);
        HBox root6 = new HBox(10, new Label("Y3 = "), sideY3);
        root1.setStyle("-fx-alignment: center");
        root2.setStyle("-fx-alignment: center");
        root3.setStyle("-fx-alignment: center");
        root4.setStyle("-fx-alignment: center");
        root5.setStyle("-fx-alignment: center");
        root6.setStyle("-fx-alignment: center");

        VBox root7 = new VBox(10, root1, root2, root3);
        VBox root8 = new VBox(10, root4, root5, root6);

        HBox root9 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn);
        VBox root10 = new VBox(10, exLabel, root7, root8, calcbtn, resLabel, resLabel1, clearbtn, root9);
        root10.setStyle("-fx-alignment: center");
        root9.setStyle("-fx-alignment: center");

        return new Scene(root10, 400, 400);
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
        Button ex4btn = new Button("4");
        ex4btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene4);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double a = Double.parseDouble(sideA.getText());
            double PI = 3.14;
            double c = a * (180.0 / PI);
            resLabel.setText("В градусах = " + c);
        });

        HBox root1 = new HBox(10, new Label("Значение в радианах = "), sideA);
        root1.setStyle("-fx-alignment: center");
        HBox root2 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn);
        root2.setStyle("-fx-alignment: center");
        VBox root3 = new VBox(10, exLabel, root1, calcbtn, resLabel, clearbtn, root2);
        root3.setStyle("-fx-alignment: center");
        return new Scene(root3, 400, 400);
    }

    private Scene createScene4() {
        TextField sideL = new TextField();
        sideL.setPromptText("Введите число");
        TextField sideLum = new TextField();
        sideLum.setPromptText("Введите число");
        Label resLabel = new Label();
        Label exLabel = new Label("Задание 4");
        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");

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
        Button ex4btn = new Button("4");
        ex4btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene4);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideL.setText("");
            sideLum.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double l = Double.parseDouble(sideL.getText());
            double lum = Double.parseDouble(sideLum.getText());
            double L = 1 + 24.86 * pow(10, -2);
            double d = (L + sin(l * lum)) / (2 + cos(pow(lum, 2))) + lum - pow(10, lum);
            resLabel.setText("Результат = " + d);
        });
        HBox root1 = new HBox(10, new Label("Значение l = "), sideL);
        root1.setStyle("-fx-alignment: center");
        HBox root4 = new HBox(10, new Label("Значение lum = "), sideLum);
        root4.setStyle("-fx-alignment: center");
        HBox root2 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn);
        root2.setStyle("-fx-alignment: center");
        VBox root3 = new VBox(10, exLabel, root1,root4, calcbtn, resLabel, clearbtn, root2);
        root3.setStyle("-fx-alignment: center");
        return new Scene(root3, 400, 400);
    }
}
