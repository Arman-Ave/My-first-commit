import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;
        int sum = 0;

        while (n > 0) {
            int digit = n % 10;
            sum += digit;
            count++;
            n = n / 10;
        }

        System.out.println("Количество цифр = " + count);
        System.out.println("Сумма цифр = " + sum);
    }
}