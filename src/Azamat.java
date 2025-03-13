import java.util.Scanner;

public class Azamat {
    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("exit")) {
            System.out.print("Введите слово (для выхода 'exit'): ");
            input = scanner.nextLine();
            System.out.println("Вы ввели: " + input);
        }

        System.out.println("Программа завершена.");
    }
}
