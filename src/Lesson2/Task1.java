package Lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        /*
        1.1) Написать программу, которая читает введеное с консоли число.
        Число должно быть от 1 до 12.
        Напечатать на консоль название месяца, которое соответствует введеному числу (например 1 - Январь)
        Если число неправильное (не от 1 до 12), напечатать на консоль сообщение,
        информирующее об ошибке (например "Неправильное число, должно быть от 1 до 12)
         */

        Scanner in = new Scanner(System.in);
        System.out.print("Введите число: ");
        int num = in.nextInt();
        in.close();
        if (num == 1) {
            System.out.println("Это январь");
        } else if (num == 2) {
            System.out.println("Это февраль");
        } else if (num == 3) {
            System.out.println("Это март");
        } else if (num == 4) {
            System.out.println("Это апрель");
        } else if (num == 5) {
            System.out.println("Это май");
        } else if (num == 6) {
            System.out.println("Это июнь");
        } else if (num == 7) {
            System.out.println("Это июль");
        } else if (num == 8) {
            System.out.println("Это август");
        } else if (num == 9) {
            System.out.println("Это сентябрь");
        } else if (num == 10) {
            System.out.println("Это октябрь");
        } else if (num == 11) {
            System.out.println("Это ноябрь");
        } else if (num == 12) {
            System.out.println("Это декабрь");
        } else {
            System.out.println("Такого месяца не существует!");
        }
    }
}

