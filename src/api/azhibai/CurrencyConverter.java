package api.azhibai;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {

        // Валюта курстары
        double usdRate = 0.0115;  // 1 сом = 0.0115 USD
        double eurRate = 0.0107;  // 1 сом = 0.0107 EUR
        double kgsRate = 1;       // 1 сом = 1 KGS (өзү)

        // Колдонуучу үчүн маалыматтарды алуу
        Scanner scanner = new Scanner(System.in);

        // Колдонуучу сумма жана валюта тандоону сурайт
        System.out.println("Конвертациялоо үчүн суммаңызды киргизиңиз (сом):");
        double amount = scanner.nextDouble();

        System.out.println("Каалаган валютаны тандаңыз (USD, EUR, KGS):");
        String currency = scanner.next().toUpperCase();

        // Конвертациялоо
        double result = 0;
        if (currency.equals("USD")) {
            result = amount * usdRate;
        } else if (currency.equals("EUR")) {
            result = amount * eurRate;
        } else if (currency.equals("KGS")) {
            result = amount;
        } else {
            System.out.println("Курс табылган жок.");
            return;
        }

        System.out.printf("Сиздин %.2f сомдук суммаңыз %s валютасына %.2f болуп конвертацияланды.\n", amount, currency, result);
    }
}



