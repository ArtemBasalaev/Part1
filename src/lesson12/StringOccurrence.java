package lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class StringOccurrence {
    public static void main(String[] args) {
        String stringForSearch = "JAVA";

        try {
            int substringOccurrencesCount = getSubstringOccurrencesCount(stringForSearch, "input.txt");
            System.out.printf("Количество вхождений строки: \"%s\" без учета регистра = %d", stringForSearch, substringOccurrencesCount);
        } catch (FileNotFoundException e) {
            System.out.println("Такого файла нет или путь введен ошибочно");
        }
    }

    public static int getSubstringOccurrencesCount(String stringForSearch, String filePath) throws FileNotFoundException {
        if (stringForSearch.length() == 0) {
            return 0;
        }

        try (Scanner scanner = new Scanner(new FileInputStream(filePath))) {
            stringForSearch = stringForSearch.toLowerCase();

            int substringOccurrencesCount = 0;

            while (scanner.hasNextLine()) {
                String string = scanner.nextLine().toLowerCase();

                int substringStartIndex = string.indexOf(stringForSearch, 0);

                while (substringStartIndex != -1) {
                    substringOccurrencesCount++;

                    substringStartIndex += stringForSearch.length();
                    substringStartIndex = string.indexOf(stringForSearch, substringStartIndex);
                }
            }

            return substringOccurrencesCount;
        }
    }
}