import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();   // номер элемента
        double value = sc.nextDouble();

        double a = 0, c = 0, h = 0, s = 0;

        switch (n) {
            case 1:
                a = value;
                c = a * Math.sqrt(2);
                h = c / 2;
                s = c * h / 2;
                break;

            case 2:
                c = value;
                a = c / Math.sqrt(2);
                h = c / 2;
                s = c * h / 2;
                break;

            case 3:
                h = value;
                c = h * 2;
                a = c / Math.sqrt(2);
                s = c * h / 2;
                break;

            case 4:
                s = value;
                c = Math.sqrt(4 * s);
                h = c / 2;
                a = c / Math.sqrt(2);
                break;

            default:
                System.out.println("Ошибка");
                return;
        }

        System.out.println("a = " + a);
        System.out.println("c = " + c);
        System.out.println("h = " + h);
        System.out.println("S = " + s);
    }
}