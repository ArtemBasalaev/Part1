package lesson3;

import java.util.Scanner;

public class Age {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше возраст: ");
        int age = scanner.nextInt();

        int ageLastDigit = age % 10;

        if (age < 1) {
            System.out.print("Вы слишком малы");
        } else if (age > 112) {
            System.out.print("Вы слишком стары");
        } else if ((age / 10) % 10 == 1) {
            System.out.print("Вам " + age + " лет");
        } else if (ageLastDigit == 1) {
            System.out.print("Вам " + age + " год");
        } else if (ageLastDigit >= 2 && ageLastDigit <= 4) {
            System.out.print("Вам " + age + " года");
        } else {
            System.out.print("Вам " + age + " лет");
        }
    }
}