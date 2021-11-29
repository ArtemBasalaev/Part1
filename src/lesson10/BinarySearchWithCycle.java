package lesson10;

import java.util.Arrays;

public class BinarySearchWithCycle {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));

        int number = 10;
        int numberIndexInArray = binarySearchWithCycle(array, number);

        if (numberIndexInArray == -1) {
            System.out.printf("Числа %d нет в массиве", number);
        } else {
            System.out.printf("Индекс числа %d в массиве равен %d", number, numberIndexInArray);
        }
    }

    public static int binarySearchWithCycle(int[] array, int number) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (number == array[middle]) {
                return middle;
            }

            if (number > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }
}