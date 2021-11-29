package lesson12;

public class StringSplit {
    public static void main(String[] args) {
        String numbersLine = "1, 2, 3, 4, 5";
        String[] numberStrings = numbersLine.split(", ");

        int[] array = new int[numberStrings.length];

        int arraySum = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(numberStrings[i]);
            arraySum += array[i];
        }

        System.out.println("Сумма чисел массива = " + arraySum);
    }
}