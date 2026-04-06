package main.java.com.example._2601_;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int count = 0;

        for (int i = B; i >= A; i--) {
            System.out.print(i + " ");
            count++;
        }

        System.out.println();
        System.out.println(count);
    }
}
