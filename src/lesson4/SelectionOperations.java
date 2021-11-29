package lesson4;

import java.util.Scanner;

public class SelectionOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.print("Введите второе число: ");
        double number2 = scanner.nextDouble();

        System.out.print("Введите код операции: ");
        int commandCode = scanner.nextInt();

        double result;

        switch (commandCode) {
            case 1:
                result = number1 + number2;
                System.out.printf("Результат сложения двух чисел = %.1f", result);
                break;
            case 2:
                result = number1 - number2;
                System.out.printf("Результат вычитания двух чисел = %.1f", result);
                break;
            case 3:
                result = number1 * number2;
                System.out.printf("Результат умножения двух чисел = %.1f", result);
                break;
            case 4:
                result = number1 / number2;
                System.out.printf("Результат деления двух чисел = %.1f", result);
                break;
            default:
                System.out.print("Неизвестная операция");
        }
    }
}
