package main.java.com.example._2601_;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        int n = sc.nextInt();

        double sum = 0;

        for (int k = 0; k <= n; k++) {
            double term = Math.pow(x, 2 * k + 1) / (2 * k + 1);

            if (k % 2 == 0) {
                sum += term;
            } else {
                sum -= term;
            }
        }

        System.out.println(sum);
    }
}