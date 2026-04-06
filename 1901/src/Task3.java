import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        if (A == 0) {
            System.out.println("Ошибка: A не должно быть равно 0");
        } else {
            double x = -B / A;
            System.out.println("x = " + x);
        }
    }
}