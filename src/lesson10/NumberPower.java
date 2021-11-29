package lesson10;

public class NumberPower {
    public static void main(String[] args) {
        int number = 2;
        int power = 10;

        int numberRaisedToPower = raiseToPowerWithRecursion(number, power);
        System.out.printf("%d^%d = %d", number, power, numberRaisedToPower);

        System.out.println();

        numberRaisedToPower = raiseToPowerWithCycle(number, power);
        System.out.printf("%d^%d = %d", number, power, numberRaisedToPower);
    }

    public static int raiseToPowerWithRecursion(int number, int power) {
        if (power == 0) {
            return 1;
        }

        return raiseToPowerWithRecursion(number, power - 1) * number;
    }

    public static int raiseToPowerWithCycle(int number, int power) {
        int numberRaisedToPower = 1;

        for (int i = 0; i < power; i++) {
            numberRaisedToPower *= number;
        }

        return numberRaisedToPower;
    }
}