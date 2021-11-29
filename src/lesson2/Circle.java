package lesson2;

public class Circle {
    public static void main(String[] args) {
        double radius1 = 10.1;
        double circleArea1 = Math.PI * Math.pow(radius1, 2);
        double circumference1 = 2 * Math.PI * radius1;
        System.out.printf("Круг с радиусом = %.1f имеет площадь = %.1f и длину окружности = %.1f%n", radius1, circleArea1, circumference1);

        double circleArea2 = 320.2;
        double radius2 = Math.sqrt(circleArea2 / Math.PI);
        System.out.printf("Круг с площадью =  %.1f имеет радиус = %.1f%n", circleArea2, radius2);

        double radius3 = 10.1;
        double sectorDegrees3 = 20;
        double sectorArea3 = Math.PI * Math.pow(radius3, 2) * (sectorDegrees3 / 360);
        System.out.printf("Площадь сектора с уголом = %.0f градусов и радиусом = %.1f составляет %.1f%n", sectorArea3, radius3, sectorDegrees3);

        double radius4 = 10.1;
        double segmentDegrees4 = 100;
        double radians4 = Math.toRadians(segmentDegrees4);
        double segmentArea4 = 0.5 * Math.pow(radius4, 2) * (Math.PI * segmentDegrees4 / 180 - Math.sin(radians4));
        System.out.printf("Площадь сегмента с углом = %.0f градусов и радиусом = %.1f составляет %.1f", segmentDegrees4, radius4, segmentArea4);
    }
}