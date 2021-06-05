package Lesson3;

import java.util.Random;

public class Task5 {
    public static void main(String[] args) {
        // 5.3) Найти минимальное число из диагонали, стоящей над главной

        int n = 4;
        int m = 4;
        int paramRandom = 10;
        int min = paramRandom - 1;
        int[][] randArray = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                randArray[i][j] = new Random().nextInt(paramRandom);
                if ((i == j - 1) && (j != m + 1)) {
                    if (min > randArray[i][j]) {
                        min = randArray[i][j];
                    }
                }
            }
        }
        printArray(randArray, n, m);
        System.out.println("Минимальное число:" + min);
    }

    private static void printArray(int[][] randArray, int n, int m) {
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < m; ++j) {
                System.out.print(randArray[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
