import java.util.Scanner;

public class Expression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите b (в радианах): ");
        double b = scanner.nextDouble();

        double pi = 3.14;

        // a = cos(b) + 5.1 * 10^-3
        double a = Math.cos(b) + 5.1 * Math.pow(10, -3);

        double ab = a * b;

        if (ab < 0) {
            System.out.println("Ошибка: подкоренное выражение отрицательное");
        } else {
            double w = Math.sqrt(ab) + Math.tan(b);
            double v = Math.exp(a * w) + pi;

            System.out.println("a = " + a);
            System.out.println("w = " + w);
            System.out.println("ν = " + v);
        }

        scanner.close();
    }
}
