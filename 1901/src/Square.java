import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сторону квадрата a: ");
        double a = scanner.nextDouble();

        double S = a * a;

        System.out.println("Площадь квадрата S = " + S);

        scanner.close();
    }
}
