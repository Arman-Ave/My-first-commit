package main.java.com.example._2601_;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int count = 0;

        while (true) {
            int n = sc.nextInt();

            if (n == 0) break;

            if (n % 5 == 0 || n % 9 == 0) {
                count++;
            }
        }

        System.out.println(count);
    }
}