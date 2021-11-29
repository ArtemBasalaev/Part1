package lesson3;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите коэффицент а: ");
        double a = scanner.nextDouble();

        System.out.print("Введите коэффицент b: ");
        double b = scanner.nextDouble();

        System.out.print("Введите коэффицент c: ");
        double c = scanner.nextDouble();

        double epsilon = 1.0e-6;

        if (Math.abs(a) <= epsilon && Math.abs(b) <= epsilon && Math.abs(c) <= epsilon) {
            System.out.print("Корень уравнения любое число");
        } else if (Math.abs(a) <= epsilon && Math.abs(b) <= epsilon) {
            System.out.print("Уравнение не имеет корней");
        } else if (Math.abs(a) <= epsilon) {
            double x = -c / b;
            System.out.printf("Это не квадратное уравнение, результат решения линейного уравнения: %.2f", x);
        } else {
            double discriminant = Math.pow(b, 2) - 4 * a * c;

            if (discriminant < -epsilon) {
                System.out.print("Квадратное уравнение не имеет корней");
            } else if (Math.abs(discriminant) <= epsilon) {
                double x = -b / (2 * a);
                System.out.printf("Квадратное уравнение имеет один корень: %.2f", x);
            } else {
                double x1 = (-b + Math.sqrt(discriminant)) / (2 * a);
                double x2 = (-b - Math.sqrt(discriminant)) / (2 * a);
                System.out.printf("Квадратное уравнение имеет два корня: первый корень = %.2f второй корень = %.2f", x1, x2);
            }
        }
    }
}