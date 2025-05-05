package forwhile.elmirbek;

// Задача калькулятор

import java.util.Scanner;

public class CalculateApp {
    public static void main(String[] args) {

        // while работает после условия пока не будет истинны

      int a = 1;
      while (a <= 10){
          int b = 5;
          System.out.println(a + "*" + b + "=" + (a * b));
          a++;
      }

      int d = 1;
      while (d <= 10) {
          int c = 9;
          System.out.printf("%d * %d = %d \n",d, c, d * c);
          d++;
      }
        System.out.println("Программа завершилась !!! ");


      // do - предназначен чтобы дейсвтие внутри тела завершилось только один раз (теория)


        // 📌 Проверка
        // ❓ Цикл do while — сколько раз он выполняется?
        // 🔹 Минимум: один раз
        // 🔹 Максимум: столько раз, сколько условие остаётся true


        // do
        int number = 5;
        do {
            System.out.println("a >>> " + number);
            number++;
        } while (number <= 40);


        Scanner scanner = new Scanner(System.in);
        String input = "";

        while (!input.equals("выход")) {
            System.out.println("Ведите что угодно если хотите выйти то нажмите <<<выход>>>   ");
            input = scanner.nextLine();
            System.out.println("Вы написали >>> " + input);
        }
        System.out.println("Программа завершилась");
        System.out.println("Идет следющая программа");
    }
}

