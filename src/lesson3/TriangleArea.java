package lesson3;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите координаты первой вершины:");
        System.out.print("x1 = ");
        double x1 = scanner.nextDouble();

        System.out.print("y1 = ");
        double y1 = scanner.nextDouble();

        System.out.println("Введите координаты второй вершины:");
        System.out.print("x2 = ");
        double x2 = scanner.nextDouble();

        System.out.print("y2 = ");
        double y2 = scanner.nextDouble();

        System.out.println("Введите координаты третьей вершины:");
        System.out.print("x3 = ");
        double x3 = scanner.nextDouble();

        System.out.print("y3 = ");
        double y3 = scanner.nextDouble();

        double epsilon = 1.0e-6;

        if (Math.abs((x1 - x3) * (y2 - y3) - (x2 - x3) * (y1 - y3)) <= epsilon) {
            System.out.println("Точки лежат на одной прямой");
        } else {
            double sideA = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
            double sideB = Math.sqrt(Math.pow(x2 - x3, 2) + Math.pow(y2 - y3, 2));
            double sideC = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

            double semiPerimeter = (sideA + sideB + sideC) / 2;

            double triangleArea = Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
            System.out.printf("Площадь треугольника = %.1f", triangleArea);
        }
    }
}