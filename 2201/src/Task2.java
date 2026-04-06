import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();

        String[] tens = {
                "", "", "двадцать", "тридцать", "сорок",
                "пятьдесят", "шестьдесят"
        };

        String[] ones = {
                "", "один", "два", "три", "четыре",
                "пять", "шесть", "семь", "восемь", "девять"
        };

        int t = age / 10;
        int o = age % 10;

        String result = tens[t];
        if (o != 0) {
            result += " " + ones[o];
        }

        if (o == 1) {
            result += " год";
        } else if (o >= 2 && o <= 4) {
            result += " года";
        } else {
            result += " лет";
        }

        System.out.println(result);
    }
}