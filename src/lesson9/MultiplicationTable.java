package lesson9;

public class MultiplicationTable {
    public static void main(String[] args) {
        int tableLength = 10;
        int[][] array = createMultiplicationTable(tableLength);

        for (int[] subArray : array) {
            for (int e : subArray) {
                System.out.printf("%4d", e);
            }

            System.out.println();
        }
    }

    public static int[][] createMultiplicationTable(int tableLength) {
        int[][] array = new int[tableLength][tableLength];

        for (int i = 0; i < tableLength; i++) {
            for (int j = 0; j < tableLength; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }

        return array;
    }
}