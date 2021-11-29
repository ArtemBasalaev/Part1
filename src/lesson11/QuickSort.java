package lesson11;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {9, 2, 3, 1, 8, 6, 5, 4, 7, 0};
        System.out.println("Несортированный массив: " + Arrays.toString(array));

        quickSort(array, 0, array.length - 1);
        System.out.println("Сортированный массив:   " + Arrays.toString(array));
    }

    public static void quickSort(int[] array, int left, int right) {
        if (left >= right) {
            return;
        }

        if (left + 1 == right) {
            if (array[right] < array[left]) {
                int temp = array[right];
                array[right] = array[left];
                array[left] = temp;
            }

            return;
        }

        int i = left;
        int j = right;
        int sortPivot = (array[left] + array[right]) / 2;

        while (i <= j) {
            while (array[i] < sortPivot) {
                i++;
            }

            while (array[j] > sortPivot) {
                j--;
            }

            if (i <= j) {
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                i++;
                j--;
            }
        }

        if (j > left) {
            quickSort(array, left, j);
        }

        if (i < right) {
            quickSort(array, i, right);
        }
    }
}