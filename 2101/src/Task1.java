import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        if (n % 10 == 7 || n % 10 == -7) {
            System.out.println("Да");
        } else {
            System.out.println("Нет");
        }
    }
}
