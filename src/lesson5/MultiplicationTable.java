package lesson5;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите наибольший множитель: ");
        int tableLength = scanner.nextInt();

        System.out.print("       |");

        for (int i = 1; i <= tableLength; i++) {
            System.out.printf(" -%2d-   ", i);
        }

        System.out.println();

        for (int i = 1; i <= tableLength; i++) {
            System.out.printf("%4d   |", i);

            for (int j = 1; j <= tableLength; j++) {
                System.out.printf("%4d    ", i * j);
            }

            System.out.println();
        }
    }
}