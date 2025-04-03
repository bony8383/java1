package basics.asan;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Канча мышык: ");
        int summa = scanner.nextInt();
        scanner.nextLine();

        Cat[] cats = new Cat[summa];

        for (int i = 0; i < cats.length; i++) {
            System.out.println("Мышык танданыз: " + (i + 1) + ":");

            System.out.println("Аты: ");
            String name = scanner.nextLine();

            System.out.println("Тусу: ");
            String light = scanner.nextLine();

            System.out.println("Жашы: ");
            int age = scanner.nextInt();

            System.out.println("Баасы: ");
            int price = scanner.nextInt();

            System.out.println("Доставка: ");
            int price1 = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Адрес: ");
            String location = scanner.nextLine();


            cats[i] = new Sale(name, light, age, price, price1, location);
        }
        scanner.close();


        System.out.println("\nВсе кошки:");
        for (Cat cat : cats) {
            if (cat instanceof Sale) {
                ((Sale) cat).printSale();
                System.out.println("------------------------------------------------");

            }

        }

    }
}