package lesson3;

import java.util.Scanner;

public class isEven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            System.out.println("Данное число - четное");
        } else {
            System.out.println("Данное число - нечетное");
        }

        if (number % 5 == 0) {
            System.out.println("Данное число - картно 5");
        } else {
            System.out.println("Данное число - не кратно 5");
        }
    }
}