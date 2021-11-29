package lesson3;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        String password = "Password";
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите пароль: ");
        String enteredPassword = scanner.nextLine();

        if (password.equals(enteredPassword)) {
            System.out.println("Пароль верный");
        } else if (password.length() > enteredPassword.length()) {
            System.out.println("Пароль неверный строка слишком короткая");
        } else if (password.length() < enteredPassword.length()) {
            System.out.println("Пароль неверный строка слишком длинная");
        } else {
            System.out.println("Пароль неверный");
        }
    }
}