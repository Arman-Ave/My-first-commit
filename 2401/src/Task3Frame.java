import javax.swing.*;
import java.awt.*;

public class Task3Frame extends JFrame {

    JTextField fieldA;
    JTextField fieldB;
    JLabel resultLabel;

    public Task3Frame() {
        setTitle("Задание 3");
        setSize(400, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel labelA = new JLabel("Введите A:");
        fieldA = new JTextField(10);

        JLabel labelB = new JLabel("Введите B:");
        fieldB = new JTextField(10);

        JButton calcButton = new JButton("Вычислить");
        JButton backButton = new JButton("Вернуться на Задание 1");

        resultLabel = new JLabel("Результат: ");

        add(labelA);
        add(fieldA);
        add(labelB);
        add(fieldB);
        add(calcButton);
        add(resultLabel);
        add(backButton);

        calcButton.addActionListener(e -> calculate());
        backButton.addActionListener(e -> {
            new Task1Frame();
            dispose();
        });

        setVisible(true);
    }

    private void calculate() {
        try {
            double A = Double.parseDouble(fieldA.getText());
            double B = Double.parseDouble(fieldB.getText());

            if (A == 0) {
                JOptionPane.showMessageDialog(this, "A не должно быть равно 0!");
                return;
            }

            double x = -B / A;
            resultLabel.setText("Результат: x = " + x);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Введите числа!");
        }
    }
}