package lesson4;

import java.util.Scanner;

public class NumbersExpressionResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество чисел: ");
        int numbersCountInExpression = scanner.nextInt();

        int number = 1;
        int expressionResult = 0;

        while (number <= numbersCountInExpression) {
            int numberSign;

            if (number % 2 == 0) {
                numberSign = -1;
            } else {
                numberSign = 1;
            }

            expressionResult += numberSign * number * number;

            number++;
        }

        System.out.print("Результат выражения = " + expressionResult);
    }
}