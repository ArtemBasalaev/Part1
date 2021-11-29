package lesson5;

import java.util.Scanner;

public class DepositWithMonthCapitalization {
    public static void main(String[] args) {
        final int monthsInYear = 12;
        final int percent = 100;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите сумму вклада: ");
        double depositAmount = scanner.nextDouble();

        double depositRate = 0.04;
        double depositRatePerMonth = depositRate / monthsInYear;

        int depositPeriod = 6;

        System.out.printf("Доходность вклада: %.1f%% годовых, срок вклада(месяцев): %d%n", depositRate * percent, depositPeriod);

        double depositAmountWithMonthlyIncome = depositAmount;

        for (int i = 1; i <= depositPeriod; i++) {
            double monthlyIncome = depositAmountWithMonthlyIncome * depositRatePerMonth;
            depositAmountWithMonthlyIncome += monthlyIncome;

            System.out.printf("Номер месяца: %d, проценты за месяц = %.2f, сумма вклада = %.2f%n", i, monthlyIncome, depositAmountWithMonthlyIncome);
        }

        double depositProfit = depositAmountWithMonthlyIncome - depositAmount;
        System.out.printf("Сумма на конец периода: %.2f, прибыль за весь период = %.2f%n", depositAmountWithMonthlyIncome, depositProfit);
    }
}