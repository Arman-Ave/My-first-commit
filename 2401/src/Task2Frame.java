import javax.swing.*;
import java.awt.*;

public class Task2Frame extends JFrame {

    JTextField fieldS;
    JLabel resultLabel1;
    JLabel resultLabel2;

    public Task2Frame() {
        setTitle("Задание 2");
        setSize(400, 320);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new FlowLayout());

        JLabel label = new JLabel("Введите площадь круга S:");
        fieldS = new JTextField(10);

        JButton calcButton = new JButton("Вычислить");
        JButton nextButton = new JButton("Перейти на Задание 3");

        resultLabel1 = new JLabel("Диаметр D = ");
        resultLabel2 = new JLabel("Длина L = ");

        add(label);
        add(fieldS);
        add(calcButton);
        add(resultLabel1);
        add(resultLabel2);
        add(nextButton);

        calcButton.addActionListener(e -> calculate());
        nextButton.addActionListener(e -> {
            new Task3Frame();
            dispose();
        });

        setVisible(true);
    }

    private void calculate() {
        try {
            double S = Double.parseDouble(fieldS.getText());
            double D = Math.sqrt((4 * S) / 3.14);
            double L = 3.14 * D;

            resultLabel1.setText("Диаметр D = " + D);
            resultLabel2.setText("Длина L = " + L);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Введите число!");
        }
    }
}