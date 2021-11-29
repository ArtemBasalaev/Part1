package lesson11;

import java.util.Arrays;

public class InsertSort {
    public static void main(String[] args) {
        int[] array = {9, 2, 3, 1, 8, 6, 5, 4, 7, 0};
        System.out.println("Несортированный массив: " + Arrays.toString(array));

        insertSort(array);
        System.out.println("Сортированный массив:   " + Arrays.toString(array));
    }

    public static void insertSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];

            int j = i - 1;

            while (j >= 0 && array[j] > temp) {
                array[j + 1] = array[j];
                j--;
            }

            array[j + 1] = temp;
        }
    }
}