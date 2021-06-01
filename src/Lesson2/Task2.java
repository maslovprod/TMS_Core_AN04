package Lesson2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // 2.1) Дано 2 числа, день и месяц рождения. Написать программу, которая определяет знак зодиака человека.
        Scanner in = new Scanner(System.in);
        System.out.println("Введите дату рождения в формате \"дд-мм-гггг\", например: 18-12-2020");
        String dateStr = in.nextLine();
        in.close();

        LocalDate localInputDate;
        String formatString = "d-MM-yyyy";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(formatString);

        try {
            localInputDate = LocalDate.parse(dateStr, formatter);
        } catch (Exception e) {
            System.out.println("Введена некорректная дата!");
            return;
        }
        System.out.println("Это: " + getZodiacName(localInputDate));

    }

    private static String getZodiacName(LocalDate localInputDate) {
        LocalDate DateStart;
        LocalDate DateEnd;
        int localYear = localInputDate.getYear();

        DateStart = LocalDate.of(localYear, 12, 21);
        DateEnd = LocalDate.of(localYear, 1, 20);
        if (localInputDate.isBefore(DateEnd) || localInputDate.isAfter(DateStart)) {
            return "Козерог";
        }
        DateStart = LocalDate.of(localYear, 1, 19);
        DateEnd = LocalDate.of(localYear, 2, 19);
        if (localInputDate.isAfter(DateStart) && localInputDate.isBefore(DateEnd)) {
            return "Водолей";
        }
        DateStart = LocalDate.of(localYear, 2, 18);
        DateEnd = LocalDate.of(localYear, 3, 21);
        if (localInputDate.isAfter(DateStart) && localInputDate.isBefore(DateEnd)) {
            return "Рыбы";
        }
        DateStart = LocalDate.of(localYear, 3, 20);
        DateEnd = LocalDate.of(localYear, 4, 21);
        if (localInputDate.isAfter(DateStart) && localInputDate.isBefore(DateEnd)) {
            return "Овен";
        }
        DateStart = LocalDate.of(localYear, 4, 20);
        DateEnd = LocalDate.of(localYear, 5, 22);
        if (localInputDate.isAfter(DateStart) && localInputDate.isBefore(DateEnd)) {
            return "Телец";
        }
        DateStart = LocalDate.of(localYear, 5, 20);
        DateEnd = LocalDate.of(localYear, 6, 21);
        if (localInputDate.isAfter(DateStart) && localInputDate.isBefore(DateEnd)) {
            return "Близнецы";
        }
        DateStart = LocalDate.of(localYear, 6, 20);
        DateEnd = LocalDate.of(localYear, 7, 23);
        if (localInputDate.isAfter(DateStart) && localInputDate.isBefore(DateEnd)) {
            return "Рак";
        }
        DateStart = LocalDate.of(localYear, 7, 22);
        DateEnd = LocalDate.of(localYear, 8, 23);
        if (localInputDate.isAfter(DateStart) && localInputDate.isBefore(DateEnd)) {
            return "Лев";
        }
        DateStart = LocalDate.of(localYear, 8, 22);
        DateEnd = LocalDate.of(localYear, 9, 24);
        if (localInputDate.isAfter(DateStart) && localInputDate.isBefore(DateEnd)) {
            return "Дева";
        }
        DateStart = LocalDate.of(localYear, 9, 23);
        DateEnd = LocalDate.of(localYear, 10, 24);
        if (localInputDate.isAfter(DateStart) && localInputDate.isBefore(DateEnd)) {
            return "Весы";
        }
        DateStart = LocalDate.of(localYear, 10, 23);
        DateEnd = LocalDate.of(localYear, 11, 22);
        if (localInputDate.isAfter(DateStart) && localInputDate.isBefore(DateEnd)) {
            return "Скорпион";
        }
        return "";
    }
}

