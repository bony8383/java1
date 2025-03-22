package methods.baima;

public class ExampleMethods {
    public static int main (int x, int y ) {
        if (x>y) {
            return x;
        } else {
            return y;
        }
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;


        int result = max(a, b);
        System.out.println("эн чон сан: " + result);


    }

    private static int max(int a, int b) {
        return b;
    }


}
