import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double A = sc.nextDouble();
        double B = sc.nextDouble();

        int count = 0;

        while (A >= B) {
            A = A - B;
            count++;
        }

        System.out.println(count);
    }
}