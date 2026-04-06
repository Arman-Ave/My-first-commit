import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        int day = (4 + K - 1) % 7;

        System.out.println(day);
    }
}