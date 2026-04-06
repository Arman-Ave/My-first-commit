import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double b = sc.nextDouble();
        double p = sc.nextDouble();

        double a = Math.cos(b) + 5.1 * Math.pow(10, -3);

        double denominator = Math.sqrt(a * b) + Math.tan(b);

        if (denominator == 0 || a * b < 0) {
            System.out.println("Ошибка: недопустимые значения");
        } else {
            double w = (Math.pow(a, 5) + Math.sin(a * b)) / denominator;
            double v = Math.exp(a * w) + p;

            System.out.println("a = " + a);
            System.out.println("w = " + w);
            System.out.println("v = " + v);
        }
    }
}