package methods.urmat;

public class MethodsExample {
    public static void main(String[] args) {
        int sum = add(10, 20);
        System.out.println(sum);
        greetUser("Urmat");
        greetUser("Samat");
        greetUser("Venera");
    }

    public static int add(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void greetUser(String name) {
        System.out.println("Привет " + name + "!");
    }
}