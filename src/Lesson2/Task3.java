package Lesson2;

public class Task3 {

    public static void main(String[] args) {
        //3.1) Напишите программу, определяющую сумму всех нечетных чисел от 1 до 99
        int sum = 0;

        for (int i = 1; i < 100; i += 2) {
            sum += i;
        }
        System.out.println("Сумма нечетных чисел: " + sum);

        //3.2) Вычислить: 1+2+4+8+...+256
        for (int i = 1; i < 257; i *= 2) {
            sum += i;
        }
        System.out.println("Сумма чисел 1+2+4+8+...+256: " + sum);

        //3.3) Начав тренировки, спортсмен в первый день пробежал 10 км.
        // Каждый день он увеличивал дневную норму на 10% нормы предыдущего дня.
        // Какой суммарный путь пробежит спортсмен за 7 дней?

        double sumWay = 0;
        double norma = 10;
        double incPercent = 1.1;
        for (int i = 0; i < 7; i++) {
            if (i != 0) {
                norma *= incPercent;
            }
            sumWay += norma;
        }
        System.out.println("Общее расстояние: " + sumWay);
    }

}
