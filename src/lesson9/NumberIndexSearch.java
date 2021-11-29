package lesson9;

public class NumberIndexSearch {
    public static void main(String[] args) {
        int[] array = {1, 2, 6, 8, 7};

        int numberIndexInArray = getNumberIndexInArray(array, 1);

        if (numberIndexInArray == -1) {
            System.out.println("Числа нет в массиве");
        } else {
            System.out.println("Индекс числа в массиве = " + numberIndexInArray);
        }
    }

    public static int getNumberIndexInArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }

        return -1;
    }
}