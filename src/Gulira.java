import java.util.Scanner;

public class Gulira {

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            System.out.println("Сан: " + i);
        }

            Scanner scanner = new Scanner(System.in);
            String input = "";

            while (input.equals("exit")) {
                System.out.println("Чыгыш үчүн 'exit' жаз");
                input = scanner.nextLine();
                System.out.println("Cиз " + input + " деп жаздыңыз");
            }
            System.out.println("Программа аяктады");

        }
    }
