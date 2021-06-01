package Lesson2;

public class Task4 {
    public static void main(String[] args) {
        //4.1) Дано положительное число x (например 1098).
        // Написать программу, которая печатает на консоль все цифры данного числа (используя цикл while)
        int x = 1098;
        String xStr = String.valueOf(x);
        int i = 1;
        while (i < xStr.length() + 1) {
            System.out.println("Символ №" + i + ": " + xStr.charAt(i - 1));
            i++;
        }
    }
}
