package lesson4;

import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите индекс числа в последовательности Фибоначчи: ");
        int fibonacciNumberIndex = scanner.nextInt();

        int currentFibonacciNumber = 0;
        int nextFibonacciNumber = 1;

        int i = 0;

        while (i < fibonacciNumberIndex) {
            int nextNextFibonacciNumber = currentFibonacciNumber + nextFibonacciNumber;
            currentFibonacciNumber = nextFibonacciNumber;
            nextFibonacciNumber = nextNextFibonacciNumber;

            i++;
        }

        System.out.print("Число в последовательности Фибоначчи с этим индексом = " + currentFibonacciNumber);
    }
}