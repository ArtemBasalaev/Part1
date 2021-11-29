package lesson5;

import java.util.Scanner;

public class StringGame {
    public static void main(String[] args) {
        String magicWord = "puzzle";

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку: ");
            String answer = scanner.nextLine();

            if (magicWord.equals(answer)) {
                System.out.print("Ура! Вы угадали загаданную строку!");
                break;
            }

            System.out.println("Вы не угадали, попробуйте еще раз");
        }
    }
}