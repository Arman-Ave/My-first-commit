package main.java.com.example._2601_;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double a = 1;
        double b = 1;
        double sum = a * b;

        for (int k = 2; k <= n; k++) {
            double newA = 0.5 * (Math.sqrt(b) + Math.sqrt(a));
            double newB = 2 * a * a + b;

            a = newA;
            b = newB;

            sum += a * b;
        }

        System.out.println(sum);
    }
}
