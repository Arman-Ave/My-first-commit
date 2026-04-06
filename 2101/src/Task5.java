import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        double y = sc.nextDouble();

        double r2 = x * x + y * y;

        if (r2 < 100) {
            System.out.println("Да");
        } else if (r2 == 100) {
            System.out.println("На границе");
        } else {
            System.out.println("Нет");
        }
    }
}