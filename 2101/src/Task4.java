import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x = sc.nextDouble();
        int k = sc.nextInt();

        double y;

        if (k == 3) {
            y = Math.sin(x) + 2;
            System.out.println(y);
        } else if (k == 20) {
            y = Math.cos(x * x);
            System.out.println(y);
        } else if (k == 10 || k == 15) {
            y = Math.tan(x) + Math.sin(x);
            System.out.println(y);
        } else {
            System.out.println("y не определено");
        }
    }
}