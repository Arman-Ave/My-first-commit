import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n > 0) {
            n = n - 8;
        } else {
            n = n + 6;
        }

        System.out.println(n);
    }
}