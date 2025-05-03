package ifelse.elmirbek;

import java.util.Scanner;
public  class IfElse  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Аба ырайына жараша билдируу !!! ");

        // сразу начнем с проверки чтобы программа работало корректно с числами а не строкой !!!

        // 1 первая проверка введено число !!!
        if (scanner.hasNextInt()) {
            int temperature = scanner.nextInt();
            if (temperature < 5) {
                System.out.println("Аба суук. Жылуу кийим кииңиз. . Темпратура : " + temperature + " градуска суук !");
            } else if (temperature <= 15) {
                System.out.println("Кадимки кийим кииңиз. Темпратруа : " + temperature + " градуска жылуу !");
            } else {
                System.out.println("Аба ыссык. Женил кийим кииңиз. Темпратура :  " + temperature + "градуска ыссык" );
            }
        }
        else  {
            System.out.println("КАТААА! Сан жазыңыз, текст эмес!");
            scanner.close();
        }
    }
}