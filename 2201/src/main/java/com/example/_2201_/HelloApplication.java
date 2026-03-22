package com.example._2201_;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    private Stage primaryStage;
    private Scene scene1, scene2, scene3, scene4, scene5, scene6;

    @Override
    public void start(Stage stage) throws IOException {
        primaryStage = stage;
        scene1 = createScene1();
        scene2 = createScene2();
        scene3 = createScene3();
        scene4 = createScene4();
        scene5 = createScene5();
        scene6 = createScene6();
        primaryStage.setScene(scene1);
        primaryStage.setTitle("Практ. раб. 4");
        primaryStage.show();
    }

    private int nn = 0;
    private String dir = "С";

    private Scene createScene1() {
        Label exLabel = new Label("Задание 1");
        Label North = new Label("С");
        Label South = new Label("Ю");
        Label West = new Label("З");
        Label East = new Label("В");
        Label Robot = new Label("R");
        Label s1 = new Label("↑");
        Label s2 = new Label("");
        Label s3 = new Label("");
        Label s4 = new Label("");
        Label resLabel = new Label("");

        Button n0 = new Button("0");
        Button n1 = new Button("←");
        Button n2 = new Button("→");

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
        Button ex6btn = new Button("6");
        ex6btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene6);
        });

        n0.setOnAction(actionEvent -> {
            nn = 0;
            switch (dir) {
                case "С":
                    switch (nn) {
                        case 0:
                            dir = "С";
                            break;
                        case 1:
                            dir = "З";
                            break;
                        case -1:
                            dir = "В";
                            break;
                    }
                    break;
                case "З":
                    switch (nn) {
                        case 0:
                            dir = "З";
                            break;
                        case 1:
                            dir = "Ю";
                            break;
                        case -1:
                            dir = "С";
                            break;
                    }
                    break;
                case "Ю":
                    switch (nn) {
                        case 0:
                            dir = "Ю";
                            break;
                        case 1:
                            dir = "В";
                            break;
                        case -1:
                            dir = "З";
                            break;
                    }
                    break;
                case "В":
                    switch (nn) {
                        case 0:
                            dir = "В";
                            break;
                        case 1:
                            dir = "С";
                            break;
                        case -1:
                            dir = "Ю";
                            break;
                    }
                    break;
            }
            switch (dir) {
                case "С":
                    s1.setText("↑");
                    s2.setText("");
                    s3.setText("");
                    s4.setText("");
                    break;
                case "З":
                    s1.setText("");
                    s2.setText("←");
                    s3.setText("");
                    s4.setText("");
                    break;
                case "В":
                    s1.setText("");
                    s2.setText("");
                    s3.setText("→");
                    s4.setText("");
                    break;
                case "Ю":
                    s1.setText("");
                    s2.setText("");
                    s3.setText("");
                    s4.setText("↓");
                    break;
            }
            resLabel.setText("Текущее направление - " + dir);
        });
        n1.setOnAction(actionEvent -> {
            nn = 1;
            switch (dir) {
                case "С":
                    switch (nn) {
                        case 0:
                            dir = "C";
                            break;
                        case 1:
                            dir = "З";
                            break;
                        case -1:
                            dir = "В";
                            break;
                    }
                    break;
                case "З":
                    switch (nn) {
                        case 0:
                            dir = "З";
                            break;
                        case 1:
                            dir = "Ю";
                            break;
                        case -1:
                            dir = "С";
                            break;
                    }
                    break;
                case "Ю":
                    switch (nn) {
                        case 0:
                            dir = "Ю";
                            break;
                        case 1:
                            dir = "В";
                            break;
                        case -1:
                            dir = "З";
                            break;
                    }
                    break;
                case "В":
                    switch (nn) {
                        case 0:
                            dir = "В";
                            break;
                        case 1:
                            dir = "С";
                            break;
                        case -1:
                            dir = "Ю";
                            break;
                    }
                    break;
            }
            switch (dir) {
                case "С":
                    s1.setText("↑");
                    s2.setText("");
                    s3.setText("");
                    s4.setText("");
                    break;
                case "З":
                    s1.setText("");
                    s2.setText("←");
                    s3.setText("");
                    s4.setText("");
                    break;
                case "В":
                    s1.setText("");
                    s2.setText("");
                    s3.setText("→");
                    s4.setText("");
                    break;
                case "Ю":
                    s1.setText("");
                    s2.setText("");
                    s3.setText("");
                    s4.setText("↓");
                    break;
            }
            resLabel.setText("Текущее направление - " + dir);
        });
        n2.setOnAction(actionEvent -> {
            nn = -1;
            switch (dir) {
                case "С":
                    switch (nn) {
                        case 0:
                            dir = "C";
                            break;
                        case 1:
                            dir = "З";
                            break;
                        case -1:
                            dir = "В";
                            break;
                    }
                    break;
                case "З":
                    switch (nn) {
                        case 0:
                            dir = "З";
                            break;
                        case 1:
                            dir = "Ю";
                            break;
                        case -1:
                            dir = "С";
                            break;
                    }
                    break;
                case "Ю":
                    switch (nn) {
                        case 0:
                            dir = "Ю";
                            break;
                        case 1:
                            dir = "В";
                            break;
                        case -1:
                            dir = "З";
                            break;
                    }
                    break;
                case "В":
                    switch (nn) {
                        case 0:
                            dir = "В";
                            break;
                        case 1:
                            dir = "С";
                            break;
                        case -1:
                            dir = "Ю";
                            break;
                    }
                    break;
            }
            switch (dir) {
                case "С":
                    s1.setText("↑");
                    s2.setText("");
                    s3.setText("");
                    s4.setText("");
                    break;
                case "З":
                    s1.setText("");
                    s2.setText("←");
                    s3.setText("");
                    s4.setText("");
                    break;
                case "В":
                    s1.setText("");
                    s2.setText("");
                    s3.setText("→");
                    s4.setText("");
                    break;
                case "Ю":
                    s1.setText("");
                    s2.setText("");
                    s3.setText("");
                    s4.setText("↓");
                    break;
            }
            resLabel.setText("Текущее направление - " + dir);
        });
        resLabel.setText("Текущее направление - " + dir);

        HBox root1 = new HBox(10, West, s2, Robot, s3, East);
        root1.setStyle("-fx-alignment: center");
        HBox root2 = new HBox(10, n1, n0, n2);
        root2.setStyle("-fx-alignment: center");
        HBox root3 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn, ex5btn, ex6btn);
        root3.setStyle("-fx-alignment: center");
        VBox root10 = new VBox(10, exLabel, North, s1, root1, s4, South, root2, resLabel, root3);
        root10.setStyle("-fx-alignment: center");
        return new Scene(root10, 500, 500);
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
        Button ex4btn = new Button("4");
        ex4btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene4);
        });
        Button ex5btn = new Button("5");
        ex5btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene5);
        });
        Button ex6btn = new Button("6");
        ex6btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene6);
        });

        calcbtn.setOnAction(actionEvent -> {
            int age = Integer.parseInt(sideA.getText());
            if (age < 20 || age > 69) {
                System.out.println("Ошибка: возраст должен быть в диапазоне 20-69");
                return;
            }
            int a = age / 10;
            int b = age % 10;
            String sAge;
            switch (a) {
                case 2:
                    sAge = "двадцать";
                    break;
                case 3:
                    sAge = "тридцать";
                    break;
                case 4:
                    sAge = "сорок";
                    break;
                case 5:
                    sAge = "пятьдесят";
                    break;
                case 6:
                    sAge = "шестьдесят";
                    break;
                default:
                    sAge = "";
                    break;
            }
            if (b != 0) {
                switch (b) {
                    case 1:
                        sAge += " один";
                        break;
                    case 2:
                        sAge += " два";
                        break;
                    case 3:
                        sAge += " три";
                        break;
                    case 4:
                        sAge += " четыре";
                        break;
                    case 5:
                        sAge += " пять";
                        break;
                    case 6:
                        sAge += " шесть";
                        break;
                    case 7:
                        sAge += " семь";
                        break;
                    case 8:
                        sAge += " восемь";
                        break;
                    case 9:
                        sAge += " девять";
                        break;
                }
            }
            String year;
            if (age >= 11 && age <= 14) {
                year = "лет";
            } else {

                switch (b) {
                    case 1:
                        year = "год";
                        break;
                    case 2:
                    case 3:
                    case 4:
                        year = "года";
                        break;
                    case 0:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                        year = "лет";
                        break;
                    default:
                        year = "лет";
                        break;
                }
            }
            resLabel.setText(age + " : " + sAge + " " + year);
        });
        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            resLabel.setText("");
        });
        HBox root1 = new HBox(10, new Label("Введите возраст (20-69) = "), sideA);
        root1.setStyle("-fx-alignment: center");
        HBox root3 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn, ex5btn);
        root3.setStyle("-fx-alignment: center");
        VBox root4 = new VBox(10, exLabel, root1, calcbtn, resLabel, clearbtn, root3);
        root4.setStyle("-fx-alignment: center");
        return new Scene(root4, 500, 500);
    }
    private Scene createScene3() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число");
        TextField sideB = new TextField();
        sideB.setPromptText("Введите число");
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
        Button ex5btn = new Button("5");
        ex5btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene5);
        });
        Button ex6btn = new Button("6");
        ex6btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene6);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            sideB.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            final double PI = 3.14;
            double value = Double.parseDouble(sideB.getText());
            int elNum = Integer.parseInt(sideA.getText());
            double R = 0;
            double D = 0;
            double L = 0;
            double S = 0;

            switch (elNum) {
                case 1:
                    R = value;
                    break;

                case 2:
                    D = value;
                    R = D / 2.0;
                    break;

                case 3:
                    L = value;
                    R = L / (2.0 * PI);
                    break;

                case 4:
                    S = value;
                    R = Math.sqrt(S / PI);
                    break;

                default:
                    resLabel.setText("Номер элемента должен быть от 1 до 4!");
            }
            D = 2.0 * R;
            L = 2.0 * PI * R;
            S = PI * R * R;
            resLabel.setText("1. Радиус R = " + R + "\n2. Диаметр D =" + D + "\n3. Длина окружности L =" + L + "\n4. Площадь круга S =" + S);
        });
        HBox root1 = new HBox(10, new Label("Введите элемент (1-4) = "), sideA);
        root1.setStyle("-fx-alignment: center");
        HBox root2 = new HBox(10, new Label("Введите значение = "), sideB);
        root2.setStyle("-fx-alignment: center");
        HBox root3 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn, ex5btn, ex6btn);
        root3.setStyle("-fx-alignment: center");
        VBox root4 = new VBox(10, exLabel, root1, root2, calcbtn, resLabel, clearbtn, root3);
        root4.setStyle("-fx-alignment: center");
        return new Scene(root4, 500, 500);
    }

    private Scene createScene4() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число");
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
        Button ex6btn = new Button("6");
        ex6btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene6);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            int n = Integer.parseInt(sideA.getText());
            int k = 0;
            while (3 * (k + 1) < n) {
                k++;
            }
            resLabel.setText("Наибольшее K = " + k);
        });
        HBox root1 = new HBox(10, new Label("Введите N = "), sideA);
        root1.setStyle("-fx-alignment: center");
        HBox root3 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn, ex5btn, ex6btn);
        root3.setStyle("-fx-alignment: center");
        VBox root4 = new VBox(10, exLabel, root1, calcbtn, resLabel, clearbtn, root3);
        root4.setStyle("-fx-alignment: center");
        return new Scene(root4, 500, 500);
    }

    private Scene createScene5() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число");
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
        Button ex6btn = new Button("6");
        ex6btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene6);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            int n = Integer.parseInt(sideA.getText());
            int k = 0;
            int sum = 0;
            while (sum < n) {
                k++;
                sum += k;
            }
            resLabel.setText("Наименьшее K = " + k + "\nСумма прогрессии = " + sum);
        });
        HBox root1 = new HBox(10, new Label("Введите N = "), sideA);
        root1.setStyle("-fx-alignment: center");
        HBox root3 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn, ex5btn, ex6btn);
        root3.setStyle("-fx-alignment: center");
        VBox root4 = new VBox(10, exLabel, root1, calcbtn, resLabel, clearbtn, root3);
        root4.setStyle("-fx-alignment: center");
        return new Scene(root4, 500, 500);
    }

    private Scene createScene6() {
        TextField sideA = new TextField();
        sideA.setPromptText("Введите число");
        Button calcbtn = new Button("Calculate");
        Button clearbtn = new Button("Clear");
        Label resLabel = new Label();
        Label exLabel = new Label("Задание 6");

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
        Button ex6btn = new Button("6");
        ex6btn.setOnAction(actionEvent -> {
            primaryStage.setScene(scene6);
        });

        clearbtn.setOnAction(actionEvent -> {
            sideA.setText("");
            resLabel.setText("");
        });

        calcbtn.setOnAction(actionEvent -> {
            int n = Integer.parseInt(sideA.getText());
            boolean zero = false;
            int n1 = n;
            if (n == 0) {
                zero = true;
            } else {
                while (n1 > 0) {
                    int digit = n1 % 10;
                    if (digit == 0) {
                        zero = true;
                        break;
                    }
                    n1 = n1 / 10;
                }
            }
            resLabel.setText("Результат - " + zero);
        });
        HBox root1 = new HBox(10, new Label("Введите N = "), sideA);
        root1.setStyle("-fx-alignment: center");
        HBox root3 = new HBox(10, ex1btn, ex2btn, ex3btn, ex4btn, ex5btn, ex6btn);
        root3.setStyle("-fx-alignment: center");
        VBox root4 = new VBox(10, exLabel, root1, calcbtn, resLabel, clearbtn, root3);
        root4.setStyle("-fx-alignment: center");
        return new Scene(root4, 500, 500);
    }
}
