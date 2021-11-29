package lesson6;

import java.util.Scanner;

public class PrintAndRead {
    public static void main(String[] args) {
        int enteredNumber1 = printAndRead("Введите число: ");
        System.out.println("Вы ввели число: " + enteredNumber1);

        int enteredNumber2 = printAndRead("Введите число еще раз: ");
        System.out.println("Вы ввели число: " + enteredNumber2);

        int enteredNumber3 = printAndRead("Попробуйте ввести число еще раз: ");
        System.out.println("Вы ввели число: " + enteredNumber3);
    }

    public static int printAndRead(String text) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(text);
        return scanner.nextInt();
    }
}