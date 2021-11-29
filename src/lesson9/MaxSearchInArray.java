package lesson9;

public class MaxSearchInArray {
    public static void main(String[] args) {
        double[] array = {1.1, 2.3, 4.6, 8.8, 7.1};

        double maxInArray = getMaxInArray(array);
        System.out.println("Максимум в массиве: " + maxInArray);
    }

    public static double getMaxInArray(double[] array) {
        double max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        return max;
    }
}