package lesson5;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        Random random = new Random();

        int randomNumber = random.nextInt(100) + 1;

        Scanner scanner = new Scanner(System.in);

        int triesCount = 1;

        while (true) {
            System.out.print("Введите целое число: ");
            int enteredNumber = scanner.nextInt();

            if (randomNumber == enteredNumber) {
                System.out.println("Вы угадали! Число ваших попыток: " + triesCount);
                break;
            }

            if (enteredNumber > randomNumber) {
                System.out.println("Ваше число больше заданного");
            } else {
                System.out.println("Ваше число меньше заданного");
            }

            System.out.println("Вы не угадали, попробуйте еще раз");

            triesCount++;
        }
    }
}