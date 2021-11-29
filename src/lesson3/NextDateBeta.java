package lesson3;

import java.util.Scanner;

public class NextDateBeta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите день: ");
        int day = scanner.nextInt();

        System.out.print("Введите месяц: ");
        int month = scanner.nextInt();

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        boolean isLongestMonth = (month - 1) % 7 % 2 == 0;
        boolean isMonthFebruary = (month == 2);
        boolean isDateValid = (year > 0 && (month > 0 && month < 13) && (day > 0) && ((isLongestMonth && day <= 31) ||
                (!isLongestMonth && !isMonthFebruary && day <= 30) || (isMonthFebruary && isLeapYear && day <= 29) || (isMonthFebruary && !isLeapYear && day <= 28)));

        if (!isDateValid) {
            System.out.println("Введена неверная дата");
        } else {
            int nextDay;
            int nextMonth;
            int nextYear;

            if (isLongestMonth) {
                if (month == 12 && day == 31) {
                    nextDay = 1;
                    nextMonth = 1;
                    nextYear = year + 1;
                } else if (day == 31) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else {
                    nextDay = day + 1;
                    nextMonth = month;
                    nextYear = year;
                }
            } else {
                int daysCountInFebruary = isLeapYear ? 29 : 28;

                if (isMonthFebruary && day == daysCountInFebruary) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else if (day == 30) {
                    nextDay = 1;
                    nextMonth = month + 1;
                    nextYear = year;
                } else {
                    nextDay = day + 1;
                    nextMonth = month;
                    nextYear = year;
                }
            }

            System.out.printf("Введена дата: %02d.%02d.%02d%n", day, month, year);
            System.out.printf("Следующая дата: %02d.%02d.%02d ", nextDay, nextMonth, nextYear);
        }
    }
}