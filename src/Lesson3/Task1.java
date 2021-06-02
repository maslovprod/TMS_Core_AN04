package Lesson3;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
//        Дан произвольный массив чисел
//        1.3) Найти средне арифметическое элементов массива, превосходящих некоторое число С.

        int[] array = {1, 5, 3, 14, 5, 6, 17, 28, 9, 10, 2, 12, 3, 14, 0};
        int c = 3;
        int indexC = 0;
        boolean isFound = false;

        // сортируем массив по возростанию
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // методом половинного деления находим позицию первого элемента с заданным значением "с"
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            indexC = (i + j) / 2;
            if (array[indexC] < c) {
                i = indexC + 1;
            } else if (array[indexC] > c) {
                j = indexC;
            } else {
                isFound = true;
                break;
            }
        }
        // если значение в массиве найдено, то выводим информацию и считаем среднее арифметическое
        if (isFound) {
            System.out.println("Первый элемент со значением \"" + c + "\" найден в массиве на позиции \"" + indexC + "\" ");
            System.out.println("Средне арифметическое: " + getAverage(indexC, array));
        } else {
            System.out.println("Элемент не найден");
            return;
        }
    }

    private static double getAverage(int indexC, int[] array) {
        int sum = 0;
        double Average = 0;
        for (int i = indexC + 1; i < array.length; i++) {
            // проверяем, вдруг следующий элемент имеет такое же значение,
            // а по условию задачи необходимо брать в среднее только значения больше указанного "с"
            if (array[i] == array[indexC]) {
                indexC++;
                continue;
            } else {
                sum += array[i];
            }
        }
        return Average = sum / (array.length - indexC - 1);
    }
}
