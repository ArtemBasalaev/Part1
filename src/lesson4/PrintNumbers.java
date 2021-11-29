package lesson4;

import java.util.Scanner;

public class PrintNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Введите последнее число: ");
        int lastNumber = scanner.nextInt();

        System.out.print("Сколько чисел в строке выводить: ");
        int numbersCountInRow = scanner.nextInt();

        int numberIndex = 0;
        int i = firstNumber;

        while (i <= lastNumber) {
            if (numberIndex % numbersCountInRow == 0) {
                System.out.println();
            }

            System.out.printf("%4d", i);

            i++;
            numberIndex++;
        }
    }
}