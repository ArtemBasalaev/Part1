package lesson9;

import java.util.Arrays;

public class ArrayCheckSorting {
    public static void main(String[] args) {
        int[] array1 = {10, 8, 5, 3, 1};
        System.out.print(Arrays.toString(array1));

        boolean isArraySortedDescending = isArraySortedDescending(array1);

        if (isArraySortedDescending) {
            System.out.println(" - массив отсортирован по убыванию");
        } else {
            System.out.println(" - массив не отсортирован по убыванию");
        }

        int[] array2 = {1, 7, 8, 9, 20};
        System.out.print(Arrays.toString(array2));

        boolean isArraySortedAscending = isArraySortedAscending(array2);

        if (isArraySortedAscending) {
            System.out.println(" - массив отсортирован по возрастанию");
        } else {
            System.out.println(" - массив не отсортирован по возрастанию");
        }
    }

    public static boolean isArraySortedDescending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] < array[i]) {
                return false;
            }
        }

        return true;
    }

    public static boolean isArraySortedAscending(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if (array[i - 1] > array[i]) {
                return false;
            }
        }

        return true;
    }
}