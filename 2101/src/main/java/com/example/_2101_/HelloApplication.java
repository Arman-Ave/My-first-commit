package com.example._2101_;

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
    private Scene scene1, scene2, scene3, scene4, scene5;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        scene4 = createScene4();
        scene5 = createScene5();
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Практ. раб. 3");
        primaryStage.show();
    }

    private Scene createScene1() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число");
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
        Button ex5btn = new Button("5");
        ex5btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene5);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double a = Double.parseDouble(sideA.getText());
            int b = (int) (a / 100);
            int c = (int) (a % 10);
            if (b > c) {
                resLabel.setText(b + ">" + c);
            } else if (b < c) {
                resLabel.setText(c + ">" + b);
            }
        });

        HBox root1 = new HBox(10, new Label("Введите трехзначное число = "), sideA);
        root1.setStyle("-fx-alignment: center");
        HBox root2 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn, ex5btn);
        root2.setStyle("-fx-alignment: center");
        VBox root3 = new VBox(10, exLabel, root1, calcbtn, resLabel, clearbtn, root2);
        root3.setStyle("-fx-alignment: center");
        return new Scene(root3, 400, 400);
    }

    private Scene createScene2() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число");
        TextField sideB = new TextField();
        sideB.setPromptText("Введите число");
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
        Button ex5btn = new Button("5");
        ex5btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene5);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            resLabel.setText("");
            resLabel1.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            int a = Integer.parseInt(sideA.getText());
            int b = Integer.parseInt(sideB.getText());

            if (a == b) {
                a = 0;
                b = 0;
                resLabel.setText("A = " + a);
                resLabel1.setText("B = " + b);
            } else {
                int a1 = a + a + b;
                int b1 = b + a + b;
                resLabel.setText("A = " + a1);
                resLabel1.setText("B = " + b1);
            }
        });

        HBox root1 = new HBox(10, new Label("Введите число A = "), sideA);
        root1.setStyle("-fx-alignment: center");
        HBox root2 = new HBox(10, new Label("Введите число B = "), sideB);
        root2.setStyle("-fx-alignment: center");
        HBox root3 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn, ex5btn);
        root3.setStyle("-fx-alignment: center");
        VBox root4 = new VBox(10, exLabel, root1, root2, calcbtn, resLabel, resLabel1, clearbtn, root3);
        root4.setStyle("-fx-alignment: center");
        return new Scene(root4, 400, 400);
    }

    private Scene createScene3() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число");
        TextField sideB = new TextField();
        sideB.setPromptText("Введите число");
        TextField sideC = new TextField();
        sideC.setPromptText("Введите число");
        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");
        Label resLabel = new Label();
        Label resLabel1 = new Label();
        Label resLabel2 = new Label();
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
        Button ex5btn = new Button("5");
        ex5btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene5);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            sideB.setText("");
            sideC.setText("");
            resLabel.setText("");
            resLabel1.setText("");
            resLabel2.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double a = Double.parseDouble(sideA.getText());
            double b = Double.parseDouble(sideB.getText());
            double c = Double.parseDouble(sideC.getText());

            if ((a > b && b > c) || (c > b && b > a)) {
                a = a * 2;
                b = b * 2;
                c = c * 2;
            } else {
                a = -a;
                b = -b;
                c = -c;
            }
            resLabel.setText("A = " + a);
            resLabel1.setText("B = " + b);
            resLabel2.setText("C = " + c);
        });

        HBox root1 = new HBox(10, new Label("Введите число A = "), sideA);
        root1.setStyle("-fx-alignment: center");
        HBox root2 = new HBox(10, new Label("Введите число B = "), sideB);
        root2.setStyle("-fx-alignment: center");
        HBox root5 = new HBox(10, new Label("Введите число C = "), sideC);
        root5.setStyle("-fx-alignment: center");
        HBox root3 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn, ex5btn);
        root3.setStyle("-fx-alignment: center");
        VBox root4 = new VBox(10, exLabel, root1, root2, root5, calcbtn, resLabel, resLabel1, resLabel2, clearbtn, root3);
        root4.setStyle("-fx-alignment: center");
        return new Scene(root4, 400, 400);
    }

    private Scene createScene4() {
        TextField sideX = new TextField();
        sideX.setPromptText("Введите число");
        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");
        Label resLabel = new Label();
        Label exLabel = new Label("Задание 4");

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
        Button ex5btn = new Button("5");
        ex5btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene5);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideX.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double x = Double.parseDouble(sideX.getText());
            final double a = 1.5;
            final double b = 1;
            if (x > Math.PI) {
                double y = 1 - exp(-a * x) * sin(a * x + b);
                resLabel.setText("Результат = " + y);
            } else if (-Math.PI <= x) {
                double y = 1 - exp(-a * x) * (a * x + b);
                resLabel.setText("Результат = " + y);
            } else if (x < -Math.PI) {
                double y = 1 - (exp(-a * x) + exp(-b * x));
                resLabel.setText("Результат = " + y);
            }

        });

        HBox root5 = new HBox(10, new Label("Введите число X = "), sideX);
        root5.setStyle("-fx-alignment: center");
        HBox root3 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn, ex5btn);
        root3.setStyle("-fx-alignment: center");
        VBox root4 = new VBox(10, exLabel, root5, calcbtn, resLabel, clearbtn, root3);
        root4.setStyle("-fx-alignment: center");
        return new Scene(root4, 400, 400);
    }

    private Scene createScene5() {
        TextField sideX = new TextField();
        sideX.setPromptText("Введите число");
        TextField sideY = new TextField();
        sideY.setPromptText("Введите число");
        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");
        Label resLabel = new Label();
        Label exLabel = new Label("Задание 5");

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
        Button ex5btn = new Button("5");
        ex5btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene5);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideX.setText("");
            sideY.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            double x = Double.parseDouble(sideX.getText());
            double y = Double.parseDouble(sideY.getText());
            if (x > -50 && x < 50 && y < 25 && y > -25) {
                resLabel.setText("Да");
            } else if ((x == -50 && -25 <= y && y <= 25) ||
                    (x == 50 && -25 <= y && y <= 25) ||
                    (y == -25 && -50 <= x && x <= 50) ||
                    (y == 25 && -50 <= x && x <= 50)) {
                resLabel.setText("На границе");
            } else {
                resLabel.setText("Нет");
            }
        });

        HBox root1 = new HBox(10, new Label("Введите X = "), sideX);
        root1.setStyle("-fx-alignment: center");
        HBox root2 = new HBox(10, new Label("Введите Y = "), sideY);
        root2.setStyle("-fx-alignment: center");
        HBox root3 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn, ex5btn);
        root3.setStyle("-fx-alignment: center");
        VBox root4 = new VBox(10, exLabel, root1, root2, calcbtn, resLabel, clearbtn, root3);
        root4.setStyle("-fx-alignment: center");
        return new Scene(root4, 400, 400);
    }
}
