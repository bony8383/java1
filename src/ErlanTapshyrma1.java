import java.util.Scanner;

public class ErlanTapshyrma1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 5; ++i) {
            System.out.println("Число " + i);
        }

        for(int i = 10; i >= 0; --i) {
            System.out.println("Обратное " + i);
        }

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        for(int n = 1; n <= 10; ++n) {
            System.out.println(number + "*" + n + "=" + number * n);
        }

        String input = "";

        while(!input.equals("exit")) {
            System.out.println("Введите слово (для выхода ´´exit´´): ");
            input = scanner.nextLine();
            System.out.println("Вы ввели: " + input);
        }

        System.out.println("Программа завершена.");

        while(!input.equals("0")) {
            System.out.println("Введите любое число (для выхода ´´0´´): ");
            input = scanner.nextLine();
            System.out.println("Вы ввели число: " + input);
        }

        System.out.println("Вы вышли из цикла.");

        for(int i = 1; i <= 3; ++i) {
            for(int j = 1; j <= 5; ++j) {
                System.out.print("i=" + i + ", j=" + j + " ");
            }

            System.out.println();
        }

    }
}