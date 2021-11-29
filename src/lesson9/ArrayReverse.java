package lesson9;

public class ArrayReverse {
    public static void main(String[] args) {
        double[] array = {1.1, 2.3, 4.6, 8.8, 7.1};
        reverseArray(array);

        System.out.println("Развернутый массив: ");

        for (double e : array) {
            System.out.print(e + "  ");
        }
    }

    public static void reverseArray(double[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            double tmp = array[i];
            array[i] = array[j];
            array[j] = tmp;
        }
    }
}