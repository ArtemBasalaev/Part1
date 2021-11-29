package lesson5;

import java.util.Scanner;

public class EuclideanAlgorithm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int number1 = scanner.nextInt();

        System.out.print("Введите второе число: ");
        int number2 = scanner.nextInt();

        if (number1 == 0 && number2 == 0) {
            System.out.print("Оба числа равны нулю. НОД искать нельзя");
        } else {
            while (true) {
                int divisionRemainder = number1 % number2;

                if (divisionRemainder == 0) {
                    System.out.print("Наибольший общий делитель чисел: " + number2);
                    break;
                }

                number1 = number2;
                number2 = divisionRemainder;
            }
        }
    }
}