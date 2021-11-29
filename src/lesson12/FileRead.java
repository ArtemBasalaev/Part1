package lesson12;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class FileRead {
    public static void main(String[] args) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new FileInputStream("input1.txt"))) {

            int count = scanner.nextInt();
            double[] numbers = new double[count];

            for (int i = 0; i < count; i++) {
                numbers[i] = scanner.nextDouble();
            }

            System.out.println(Arrays.toString(numbers));
        }
    }
}