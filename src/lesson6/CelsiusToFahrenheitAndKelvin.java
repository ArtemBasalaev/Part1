package lesson6;

import java.util.Scanner;

public class CelsiusToFahrenheitAndKelvin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите температуру в градусах Цельсия: ");
        double celsiusDegrees = scanner.nextDouble();

        double fahrenheitDegrees = convertCelsiusToFahrenheit(celsiusDegrees);
        System.out.println("Температура в градусах по Фаренгейту: " + fahrenheitDegrees);

        double kelvinDegrees = convertCelsiusToKelvin(celsiusDegrees);
        System.out.println("Температура в градусах по Кельвину: " + kelvinDegrees);
    }

    public static double convertCelsiusToFahrenheit(double degrees) {
        return degrees * 1.8 + 32;
    }

    public static double convertCelsiusToKelvin(double degrees) {
        return degrees + 273.15;
    }
}