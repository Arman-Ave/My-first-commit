import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double S = sc.nextDouble();
        double pi = 3.14;

        double D = Math.sqrt((4 * S) / pi);
        double L = pi * D;

        System.out.println("D = " + D);
        System.out.println("L = " + L);
    }
}