package arrays.erlan;

import java.util.Arrays;

public class OneArray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers = new int[]{10, 20, 30, 40, 50,};

        System.out.println("Первый элемент: " + numbers[0]);
        System.out.println("Второй элемент: " + numbers[1]);

        System.out.println("Длина массива: " + numbers.length);

        System.out.println("Массив numbers: " + Arrays.toString(numbers));

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Элемент номер " + i + " = " + numbers[i]);
        }
    }
}