package lesson4;

import java.util.Scanner;

public class ArithmeticalMean {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите последнее число: ");
        int lastNumber = scanner.nextInt();

        int i = firstNumber;

        int numbersSum = 0;
        int numbersCount = 0;

        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        while (i <= lastNumber) {
            if (i % 2 == 0) {
                evenNumbersSum += i;
                evenNumbersCount++;
            }

            numbersSum += i;
            numbersCount++;
            i++;
        }

        double numbersAverage = (double) numbersSum / numbersCount;
        System.out.printf("Среднее арифметическое рада чисел = %.1f%n", numbersAverage);

        if (evenNumbersCount == 0) {
            System.out.print("В ряду нет четных чисел");
        } else {
            double evenNumbersAverage = (double) evenNumbersSum / evenNumbersCount;
            System.out.printf("Среднее арифметическое четных чисел = %.1f", evenNumbersAverage);
        }
    }
}