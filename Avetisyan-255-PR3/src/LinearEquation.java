import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите A: ");
        double A = scanner.nextDouble();

        System.out.print("Введите B: ");
        double B = scanner.nextDouble();

        if (A != 0) {
            double x = -B / A;
            System.out.println("Решение x = " + x);
        } else {
            System.out.println("Ошибка: A не должно быть равно 0");
        }

        scanner.close();
    }
}
