package lesson11;

import java.util.Arrays;

public class HeapSort {
    public static void main(String[] args) {
        int[] array = {9, 2, 3, 1, 8, 6, 5, 4, 7, 0};
        System.out.println("Несортированный массив: " + Arrays.toString(array));

        heapSort(array);
        System.out.println("Сортированный массив:   " + Arrays.toString(array));
    }

    public static void heapSort(int[] array) {
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            siftElement(array, i, array.length);
        }

        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;

            siftElement(array, 0, i);
        }
    }

    public static void siftElement(int[] array, int i, int arrayLength) {
        while (2 * i + 1 < arrayLength) {
            int parent = array[i];

            int leftChildIndex = 2 * i + 1;
            int rightChildIndex = 2 * i + 2;
            int maxChildIndex = leftChildIndex;

            if (rightChildIndex < arrayLength && array[leftChildIndex] < array[rightChildIndex]) {
                maxChildIndex = rightChildIndex;
            }

            if (parent >= array[maxChildIndex]) {
                break;
            }

            array[i] = array[maxChildIndex];
            array[maxChildIndex] = parent;

            i = maxChildIndex;
        }
    }
}