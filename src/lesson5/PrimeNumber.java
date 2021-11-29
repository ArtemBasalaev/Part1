package lesson5;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        System.out.print("Простые числа, не превышающие ваше число: ");

        for (int i = 2; i <= number; i++) {
            boolean isPrimeNumber = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }

            if (isPrimeNumber) {
                System.out.print(i + " ");
            }
        }
    }
}