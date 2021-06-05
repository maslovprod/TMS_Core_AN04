package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        // 3.2) Дан массив длины n=50, заполненный случайными числами из промежутка [a; b], a=0, b=100, b >= n всегда.
        // Проверить являютя ли все числа в массиве уникальными

        int n = 50;
        int b = 101; // 101 потому что при заполнении рандома нужно чтобы 100 входило в диапазон
        int[] randArray = new int[n];
        for (int i = 0; i < n; i++) {
            randArray[i] = new Random().nextInt(b);
        }
        System.out.println(Arrays.toString(randArray));
        int[] amountOfNumber = new int[b]; // b = 101, потому что на нужно чтобы существовала позици 100 и позиция 0 для подсчета
        boolean isUnique = true;
        for (int i = 0; i < n; i++) {
            if (++amountOfNumber[randArray[i]] > 1) {
                isUnique = false;
                break;
            }
        }
        System.out.println("В массиве все числа уникальны: " + isUnique);

    }
}
