package lesson4;

import java.util.Scanner;

public class NumberDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int digitsSum = 0;
        int oddDigitsSum = 0;
        int maxDigit = 0;

        while (number != 0) {
            int numberDigit = number % 10;

            digitsSum += numberDigit;

            if (numberDigit % 2 != 0) {
                oddDigitsSum += numberDigit;
            }

            if (maxDigit < numberDigit) {
                maxDigit = numberDigit;
            }

            number /= 10;
        }

        System.out.println("Сумма цифр числа равна = " + digitsSum);
        System.out.println("Сумма нечетных цифр числа равна = " + oddDigitsSum);
        System.out.println("Максимальная цифра числа равна = " + maxDigit);
    }
}