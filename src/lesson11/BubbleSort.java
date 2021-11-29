package lesson11;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {9, 2, 3, 1, 8, 6, 5, 4, 7, 0};
        System.out.println("Несортированный массив: " + Arrays.toString(array));

        bubbleSort(array);
        System.out.println("Сортированный массив:   " + Arrays.toString(array));
    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isArraySorted = true;

            for (int j = 1; j < array.length - i; j++) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;

                    isArraySorted = false;
                }
            }

            if (isArraySorted) {
                break;
            }
        }
    }
}