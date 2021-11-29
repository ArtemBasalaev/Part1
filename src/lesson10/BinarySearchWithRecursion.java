package lesson10;

import java.util.Arrays;

public class BinarySearchWithRecursion {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(Arrays.toString(array));

        int number = 5;
        int numberIndexInArray = binarySearchWithRecursion(array, 0, array.length - 1, number);

        if (numberIndexInArray == -1) {
            System.out.printf("Числа %d нет в массиве", number);
        } else {
            System.out.printf("Индекс числа %d в массиве равен %d", number, numberIndexInArray);
        }
    }

    public static int binarySearchWithRecursion(int[] array, int left, int right, int number) {
        if (left > right) {
            return -1;
        }

        int middle = (left + right) / 2;

        if (number == array[middle]) {
            return middle;
        }

        if (number > array[middle]) {
            return binarySearchWithRecursion(array, middle + 1, right, number);
        }

        return binarySearchWithRecursion(array, left, middle - 1, number);
    }
}