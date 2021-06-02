package Lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        //Дано число n, заполнить массив длинны n случайными числами из отрезка [-15; 17]
        // 2.3) Найти максимальный элемент массива и поменять его местами с 1-м (0-м по индексу) числом массива
        int n = 10;
        int[] randArray = new int[n];
        for (int i = 0; i < n; i++) {
            randArray[i] = new Random().nextInt(33) - 15;
        }
        System.out.println(Arrays.toString(randArray));

        int max = randArray[0];
        int maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (randArray[i] > max) {
                maxIndex = i;
                max = randArray[i];
            }
        }
        randArray[maxIndex] = randArray[0];
        randArray[0] = max;
        System.out.println(Arrays.toString(randArray));
    }
}
