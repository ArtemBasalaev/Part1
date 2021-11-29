package lesson8;

import java.util.Scanner;

public class SymbolsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите строку: ");
        String string = scanner.nextLine();

        int lettersCount = 0;
        int digitsCount = 0;
        int spacesCount = 0;
        int otherSymbolsCount = 0;

        for (int i = 0; i < string.length(); i++) {
            char c = string.charAt(i);

            if (Character.isLetter(c)) {
                lettersCount++;
            } else if (Character.isDigit(c)) {
                digitsCount++;
            } else if (Character.isWhitespace(c)) {
                spacesCount++;
            } else {
                otherSymbolsCount++;
            }
        }

        System.out.println("Количество букв в строке: " + lettersCount);
        System.out.println("Количество цифр в строке: " + digitsCount);
        System.out.println("Количество пробелов в строке: " + spacesCount);
        System.out.println("Количество остальных символов в строке: " + otherSymbolsCount);
    }
}