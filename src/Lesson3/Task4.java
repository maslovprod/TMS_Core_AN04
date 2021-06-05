package Lesson3;

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        // 4.1) Реализовать сортировку пузырьком,
        // в которой мы выталкиваем сначала элемент слева-направо, а затем на обратном пути справа-налево и т.д.

        int[] array = {1, 5, 3, 14, 5, 6, 17, 28, 9, 10, 2, 12, 3, 14, 0};
        System.out.println(Arrays.toString(array));
        shakerSort(array, array.length);
        System.out.println();
        System.out.println("Отсортированный массив:");
        System.out.println(Arrays.toString(array));
    }

    private static void swapElements(int[] array, int i) {
        int buffer = array[i];
        array[i] = array[i - 1];
        array[i - 1] = buffer;
    }

    private static void shakerSort(int[] array, int size) {
        int leftBoard = 1;
        int rightBoard = size - 1;
        while (leftBoard <= rightBoard) {
            System.out.println();
            System.out.println(leftBoard); //чтобы проверить и наглядно посмотреть
            System.out.println(rightBoard);

            for (int i = leftBoard; i <= rightBoard; i++) {
                if (array[i - 1] > array[i]) {
                    swapElements(array, i);
                }
                System.out.println(Arrays.toString(array));
            }
            rightBoard--;

            System.out.println();
            for (int i = rightBoard; i >= leftBoard; i--) {
                if (array[i - 1] > array[i]) {
                    swapElements(array, i);
                }
                System.out.println(Arrays.toString(array)); //чтобы проверить и наглядно посмотреть
            }
            leftBoard++;

            System.out.println(leftBoard);
            System.out.println(rightBoard);
        }
    }
}
