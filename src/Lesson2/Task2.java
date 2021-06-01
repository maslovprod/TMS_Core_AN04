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
        LocalDate dateStart;
        LocalDate dateEnd;
        int localYear = localInputDate.getYear();

        dateStart = LocalDate.of(localYear, 12, 21);
        dateEnd = LocalDate.of(localYear, 1, 20);
        if (localInputDate.isBefore(dateEnd) || localInputDate.isAfter(dateStart)) {
            return "Козерог";
        }
        dateStart = LocalDate.of(localYear, 1, 19);
        dateEnd = LocalDate.of(localYear, 2, 19);
        if (localInputDate.isAfter(dateStart) && localInputDate.isBefore(dateEnd)) {
            return "Водолей";
        }
        dateStart = LocalDate.of(localYear, 2, 18);
        dateEnd = LocalDate.of(localYear, 3, 21);
        if (localInputDate.isAfter(dateStart) && localInputDate.isBefore(dateEnd)) {
            return "Рыбы";
        }
        dateStart = LocalDate.of(localYear, 3, 20);
        dateEnd = LocalDate.of(localYear, 4, 21);
        if (localInputDate.isAfter(dateStart) && localInputDate.isBefore(dateEnd)) {
            return "Овен";
        }
        dateStart = LocalDate.of(localYear, 4, 20);
        dateEnd = LocalDate.of(localYear, 5, 22);
        if (localInputDate.isAfter(dateStart) && localInputDate.isBefore(dateEnd)) {
            return "Телец";
        }
        dateStart = LocalDate.of(localYear, 5, 20);
        dateEnd = LocalDate.of(localYear, 6, 21);
        if (localInputDate.isAfter(dateStart) && localInputDate.isBefore(dateEnd)) {
            return "Близнецы";
        }
        dateStart = LocalDate.of(localYear, 6, 20);
        dateEnd = LocalDate.of(localYear, 7, 23);
        if (localInputDate.isAfter(dateStart) && localInputDate.isBefore(dateEnd)) {
            return "Рак";
        }
        dateStart = LocalDate.of(localYear, 7, 22);
        dateEnd = LocalDate.of(localYear, 8, 23);
        if (localInputDate.isAfter(dateStart) && localInputDate.isBefore(dateEnd)) {
            return "Лев";
        }
        dateStart = LocalDate.of(localYear, 8, 22);
        dateEnd = LocalDate.of(localYear, 9, 24);
        if (localInputDate.isAfter(dateStart) && localInputDate.isBefore(dateEnd)) {
            return "Дева";
        }
        dateStart = LocalDate.of(localYear, 9, 23);
        dateEnd = LocalDate.of(localYear, 10, 24);
        if (localInputDate.isAfter(dateStart) && localInputDate.isBefore(dateEnd)) {
            return "Весы";
        }
        dateStart = LocalDate.of(localYear, 10, 23);
        dateEnd = LocalDate.of(localYear, 11, 22);
        if (localInputDate.isAfter(dateStart) && localInputDate.isBefore(dateEnd)) {
            return "Скорпион";
        }
        return "";
    }
}

