package lesson7;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Range range = new Range(1.5, 3.2);
        System.out.printf("Начало диапазона: %.2f%n", range.getFrom());
        System.out.printf("Конец диапазона: %.2f%n", range.getTo());
        System.out.printf("Длина диапазона: %.2f%n", range.getLength());

        Scanner scanner = new Scanner(System.in);

        System.out.println("Измените границы диапазона");

        System.out.print("Введите начало диапазона: ");
        range.setFrom(scanner.nextDouble());

        System.out.print("Введите конец диапазона: ");
        range.setTo(scanner.nextDouble());

        System.out.printf("Начало диапазона: %.2f%n", range.getFrom());
        System.out.printf("Конец диапазона: %.2f%n", range.getTo());
        System.out.printf("Длина диапазона: %.2f%n", range.getLength());

        System.out.print("Введите вещественное число: ");
        double number = scanner.nextDouble();

        boolean isNumberInsideRange = range.isInside(number);

        if (isNumberInsideRange) {
            System.out.printf("Число: %.2f принадлежит диапазону", number);
        } else {
            System.out.printf("Число: %.2f не принадлежит диапазону", number);
        }
    }
}