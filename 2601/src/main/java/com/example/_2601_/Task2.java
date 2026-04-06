package main.java.com.example._2601_;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (true) {
            int n = sc.nextInt();

            if (n > 1000) break;

            if (n % 10 == 2) {
                count++;
            }
        }

        System.out.println(count);
    }
}