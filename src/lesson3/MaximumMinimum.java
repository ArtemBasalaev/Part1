package lesson3;

import java.util.Scanner;

public class MaximumMinimum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        int max = number1 > number2 ? number1 : number2;
        System.out.println("Наибольшее число: " + max);

        int min = number1 < number2 ? number1 : number2;
        System.out.println("Наименьшее число: " + min);

        if (number1 > number2) {
            System.out.println("Наибольшее число: " + number1 + ", наименьшее число: " + number2);
        } else {
            System.out.println("Наибольшее число: " + number2 + ", наименьшее число: " + number1);
        }
    }
}