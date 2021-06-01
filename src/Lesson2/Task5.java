package Lesson2;

import java.math.BigInteger;

public class Task5 {
    public static void main(String[] args) {
        // 5.1) Написать программу, которая печатает на консоль прямоугольник из символа "@" длины NxM
        // (задается вручную, т.е. int n = 10; int m = 5, например)

        int n = 3;
        int m = 5;

        for (int i = 0; i < n; i++) {
            System.out.println();
            for (int j = 0; j < m; j++) {
                System.out.print("@");
            }
        }

        //5.2) Дано число x, найти все простые числа от 1 до x
        // (число считается простым, если делится только на себя и на 1)

        int x = 17;
        System.out.println();
        System.out.println("Простые числа:");
        for (int i = 2; i <= x; i++) {
            BigInteger bigIntI = BigInteger.valueOf(i);
            boolean primeI = bigIntI.isProbablePrime((int) Math.log(i));
            if (primeI) {
                System.out.println(i);
            }
        }
    }
}
