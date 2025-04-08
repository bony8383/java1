package basics.asan;

import java.util.Scanner;

public class CatStore {
    public static void main(String[] args) {
        int san = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Канча мышык: ");
        int summa = scanner.nextInt();
        scanner.nextLine();

        Sale[] cats = new Sale[summa];
        //Cat[] cats = new Cat[summa];

        for (int i = 0; i < cats.length; i++) {
            cats[i] = addCat(scanner, i);
        }

        boolean menu = true;

        while (menu){
            System.out.println("----------Мышыктардын менюсу:---------");
            System.out.println("1.Баардык мышыктарды коруу: ");
            System.out.println("2.Жалпы баасын коруу (баасы + жеткируу): ");
            System.out.println("3.Эн кымбат мышыкты коруу: ");
            System.out.println("4.Эн арзан мышыкты коруу: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice){
                case 1:
                    showAllCats(cats);
                    break;
                case 2:
                    getTotal(cats);
                    System.out.println("Жалпы баасы (баасы + жеткируу):" + getTotal(cats));
                    break;
                case 3:
                    findExpensiveCat(cats);
                    break;
                case 4:
                    findCheapestCat(cats);
                    break;
                case 5:
                    menu = false;
                    System.out.println("Программа жабылды: ");
                    break;
                case 6:
                    System.out.println("Кайталап жазыныз: ");
            }
        }

        scanner.close();
    }

    //Мышык кошуу
    public static Sale addCat(Scanner scanner, int nummer) {
        System.out.println("Магазинге жаңы мышык кошуңуз: " + (nummer + 1));

        System.out.println("Аты: ");
        String name = scanner.nextLine();

        System.out.println("Түсү: ");
        String light = scanner.nextLine();

        System.out.println("Жашы: ");
        int age = scanner.nextInt();

        System.out.println("Баасы: ");
        int price = scanner.nextInt();

        System.out.println("Жеткире турган баасы: ");
        int deliverPrice = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Адреси: ");
        String location = scanner.nextLine();

        return new Sale(name, light, age, price, deliverPrice, location);
    }

    public static void showAllCats(Sale[] cats) {
        System.out.println("\nБардык мышыктар:");
        for (Sale cat : cats) {
            cat.printSale();
            System.out.println("------------------");
        }
    }

    public static double getTotal (Sale[] cats) {
        double total = 0;
        for (Sale cat : cats){
        total = cat.getPrice() + cat.getDeliverPrice();
       }
        return total;
    }

    public static void findExpensiveCat(Sale[] cats) {
        Sale max = cats [0];
        for (Sale cat : cats){
            if (cat.getPrice() > max.getPrice()){
                max = cat;
            }
        }
        System.out.println("Эн кымбат: мышык ");
        max.printSale();
    }
    public static void findCheapestCat(Sale[] cats) {
        Sale min = cats [0];
        for (Sale cat : cats){
            if (cat.getPrice() < min.getPrice()){
                min = cat;
            }
        }
        System.out.println("Эн арзан мышык: ");
        min.printSale();
    }
}

