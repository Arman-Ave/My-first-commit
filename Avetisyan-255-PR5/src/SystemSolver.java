import java.util.Scanner;

public class SystemSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите A1: ");
        double A1 = scanner.nextDouble();

        System.out.print("Введите B1: ");
        double B1 = scanner.nextDouble();

        System.out.print("Введите C1: ");
        double C1 = scanner.nextDouble();

        System.out.print("Введите A2: ");
        double A2 = scanner.nextDouble();

        System.out.print("Введите B2: ");
        double B2 = scanner.nextDouble();

        System.out.print("Введите C2: ");
        double C2 = scanner.nextDouble();

        // Определитель
        double D = A1 * B2 - A2 * B1;

        if (D != 0) {
            double x = (C1 * B2 - C2 * B1) / D;
            double y = (A1 * C2 - A2 * C1) / D;

            System.out.println("Решение системы:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        } else {
            System.out.println("Ошибка: система не имеет единственного решения (D = 0)");
        }

        scanner.close();
    }
}
