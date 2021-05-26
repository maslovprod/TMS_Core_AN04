package Lesson1;

public class Lesson1HomeWork {
    public static void main(String[] args) {
        /*
         * 1) В переменную записываем число. Надо вывести на экран сколько в этом
         * числе цифр и положительное оно или отрицательное. Например, "это
         * однозначное положительное число". Достаточно будет определить, является ли
         * число однозначным, "двухзначным или трехзначным и более.
         *//*
        int a = -311;
        // вывод на экран
        System.out.println("Текст на экран");
        boolean isGreaterThanZero = a >= 0;
        System.out.println("Число a больше 0: " + isGreaterThanZero);

        // Первый способ (более простой в реализации)

        // привели "a" к положительному числу (вызвали мтеод abs и передали аргументом переменную "a")
        // сделали для того, чтобы избавиться от минуса
        //a = Math.abs(a);

        // Integer.toString() - мы вызвали метод toString(..) с параметром "a" у класса Integer
        String aStr = Integer.toString(a);

        // получаем длину строки методом length();
        int length = aStr.length();

        // печатаем на консоль
        System.out.println(length);

        // advanced вариант 1-го задания
        // А что будет, если число не целое?
        // Задача: написать код, который правильно считает кол-во цифр в дробном числе
        // а) Считаем все цифры в числе (дробную часть тоже)
        // б) (посложнее) - считаем только цифры целой части*/

        // ДЗ-1

        System.out.println("--------Задача №1---------");
        double y = -10.555;
        boolean y_GreaterThanZero = y >= 0;
        System.out.println("Число " + "\"" + y + "\"" + " больше 0: " + y_GreaterThanZero);
        double yNew = y;
        while (yNew % 1 != 0) {
            yNew *= 10;
        }
        yNew = Math.abs(yNew);
        String yStr = Double.toString(yNew);
        int length_y = yStr.length() - 2;
        System.out.println("Количество цифр в числе " + "\"" + y + "\"" + ": " + length_y);

        System.out.println("--------Задача №2---------");
        int a = 1, b = 2, c = 3;
        boolean itIsTriangle;
        itIsTriangle = (a <= b + c) && (b <= a + c) && (c <= a + b);
        System.out.println("Это треугольник: " + itIsTriangle);

        System.out.println("--------Задача №3---------");
        int a1 = -1, a2 = 3;
        int max = (a1 + a2 + Math.abs(a1 - a2)) / 2;
        System.out.println("Наибольшее число: " + max);

        System.out.println("--------Задача №4---------");
        int b1 = -1, b2 = 3, b3 = 5;
        int numberOfPlus = (b1 + Math.abs(b1))/2/b1 + (b2 + Math.abs(b2))/2/b2 + (b3 + Math.abs(b3))/2/b3;
        System.out.println("Количество положительных чисел: " + numberOfPlus);
    }
}
