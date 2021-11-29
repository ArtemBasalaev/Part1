package lesson9;

public class EvenNumbersAverageInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 5, 8, 7};

        double evenNumbersAverage = getEvenNumbersAverageInArray(array);
        System.out.printf("Среднее арифметическое чётных чисел массива = %.2f", evenNumbersAverage);
    }

    public static double getEvenNumbersAverageInArray(int[] array) {
        int evenNumbersSum = 0;
        int evenNumbersCount = 0;

        for (int e : array) {
            if (e % 2 == 0) {
                evenNumbersSum += e;
                evenNumbersCount++;
            }
        }

        return (double) evenNumbersSum / evenNumbersCount;
    }
}