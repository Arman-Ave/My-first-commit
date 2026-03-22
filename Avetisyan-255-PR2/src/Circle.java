import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите площадь круга S: ");
        double S = scanner.nextDouble();

        double pi = 3.14;

        double D = Math.sqrt((4 * S) / pi);
        double L = pi * D;

        System.out.println("Диаметр D = " + D);
        System.out.println("Длина окружности L = " + L);

        scanner.close();
    }
}