package lesson3;

import java.util.Scanner;

public class NextDate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день: ");
        int day = scanner.nextInt();

        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        boolean isLongestMonth = (month - 1) % 7 % 2 == 0;

        int daysCountInMonth;

        if (isLongestMonth) {
            daysCountInMonth = 31;
        } else if (month != 2) {
            daysCountInMonth = 30;
        } else {
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            daysCountInMonth = isLeapYear ? 29 : 28;
        }

        boolean isDateValid = year > 0 && (month > 0 && month <= 12) && (day > 0 && day <= daysCountInMonth);

        if (!isDateValid) {
            System.out.println("Введена неверная дата");
        } else {
            int nextDay;
            int nextMonth;
            int nextYear;

            if (daysCountInMonth == day && month == 12) {
                nextDay = 1;
                nextMonth = 1;
                nextYear = year + 1;
            } else if (daysCountInMonth == day) {
                nextDay = 1;
                nextMonth = month + 1;
                nextYear = year;
            } else {
                nextDay = day + 1;
                nextMonth = month;
                nextYear = year;
            }

            System.out.printf("Введена дата: %02d.%02d.%02d%n", day, month, year);
            System.out.printf("Следующая дата: %02d.%02d.%02d ", nextDay, nextMonth, nextYear);
        }
    }
}