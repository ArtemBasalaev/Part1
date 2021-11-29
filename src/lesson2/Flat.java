package lesson2;

import java.util.Scanner;

public class Flat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество этажей в доме: ");
        int floorsCount = scanner.nextInt();

        System.out.print("Введите количество подъездов в доме: ");
        int sectionsCount = scanner.nextInt();

        final int flatsCountAtFloor = 4;
        int flatsCountInSection = floorsCount * flatsCountAtFloor;
        int flatsCount = sectionsCount * flatsCountInSection;

        System.out.print("Введите номер квартиры в доме: ");
        int flatNumber = scanner.nextInt();

        if (flatNumber > flatsCount || flatNumber <= 0) {
            System.out.print("Квартиры с таким номером нет в доме");
        } else {
            int sectionNumber = (flatNumber - 1) / flatsCountInSection + 1;
            System.out.println("Номер подъезда в котором расположена квартира: " + sectionNumber);

            int floorNumber = ((flatNumber - 1) % flatsCountInSection) / flatsCountAtFloor + 1;
            System.out.println("Квартира расположена на " + floorNumber + " этаже");

            int flatLocation = flatNumber % flatsCountAtFloor;

            switch (flatLocation) {
                case 1:
                    System.out.print("Расположение квартиры: ближняя слева");
                    break;
                case 2:
                    System.out.print("Расположение квартиры: дальняя слева");
                    break;
                case 3:
                    System.out.print("Расположение квартиры: дальняя справа");
                    break;
                default:
                    System.out.print("Расположение квартиры: ближняя справа");
                    break;
            }
        }
    }
}