package lesson11;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {9, 2, 3, 1, 8, 6, 5, 4, 7, 0};
        System.out.println("Несортированный массив: " + Arrays.toString(array));

        selectionSort(array);
        System.out.println("Сортированный массив:   " + Arrays.toString(array));
    }

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int minimumIndex = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minimumIndex]) {
                    minimumIndex = j;
                }
            }

            int temp = array[i];
            array[i] = array[minimumIndex];
            array[minimumIndex] = temp;
        }
    }
}