import java.util.Scanner;

public class OmkaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сизге кайсы сандын көбөйтүү таблицасы керек?: ");
//        for (int i = 10; i >=1; i--){
//            System.out.println("Tetiri: " + i);
        int san = scanner.nextInt();
        for (int j = 1; j <= 10; j++){
            System.out.println(san + " * " + j + " = " + (san * j));
//        int tabbliza = 6;
//        for (int j = 1; j <= 10; j++) {
//            System.out.println(tabbliza + " * " + j + " = " + (tabbliza * j));
            scanner.close();
        }
    }
}
