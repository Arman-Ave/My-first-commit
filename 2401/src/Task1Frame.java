import javax.swing.*;
import java.awt.*;

public class Task1Frame extends JFrame {

    JTextField fieldA;
    JLabel resultLabel;

    public Task1Frame() {
        setTitle("Задание 1");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Введите сторону квадрата a:");
        fieldA = new JTextField(10);

        JButton calcButton = new JButton("Вычислить");
        JButton nextButton = new JButton("Перейти на Задание 2");

        resultLabel = new JLabel("Результат: ");

        add(label);
        add(fieldA);
        add(calcButton);
        add(resultLabel);
        add(nextButton);

        calcButton.addActionListener(e -> calculate());
        nextButton.addActionListener(e -> {
            new Task2Frame();
            dispose();
        });

        setVisible(true);
    }

    private void calculate() {
        try {
            double a = Double.parseDouble(fieldA.getText());
            double s = a * a;
            resultLabel.setText("Результат: S = " + s);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Введите число!");
        }
    }
}