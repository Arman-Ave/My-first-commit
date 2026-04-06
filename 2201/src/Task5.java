import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double p = sc.nextDouble();

        int k = 1;
        double day = 10;
        double sum = 10;

        while (sum <= 200) {
            day = day + day * p / 100;
            sum = sum + day;
            k++;
        }

        System.out.println("K = " + k);
        System.out.println("S = " + sum);
    }
}