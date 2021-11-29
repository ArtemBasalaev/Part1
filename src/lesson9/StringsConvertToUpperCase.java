package lesson9;

public class StringsConvertToUpperCase {
    public static void main(String[] args) {
        String[] array = {"Hello", "world", "hello", "world"};

        convertStringsToUpperCase(array);

        for (String e : array) {
            System.out.println(e);
        }
    }

    public static void convertStringsToUpperCase(String[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase();
        }
    }
}