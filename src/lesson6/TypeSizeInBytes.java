package lesson6;

public class TypeSizeInBytes {
    public static void main(String[] args) {
        int byteSize = getTypeSize((byte) 5);
        System.out.println("Размер аргумента функции в байтах: " + byteSize);

        int shortSize = getTypeSize((short) 5);
        System.out.println("Размер аргумента функции в байтах: " + shortSize);

        int intSize = getTypeSize(5);
        System.out.println("Размер аргумента функции в байтах: " + intSize);

        int longSize = getTypeSize(5L);
        System.out.println("Размер аргумента функции в байтах: " + longSize);

        int floatSize = getTypeSize(5f);
        System.out.println("Размер аргумента функции в байтах: " + floatSize);

        int doubleSize = getTypeSize(5.0);
        System.out.println("Размер аргумента функции в байтах: " + doubleSize);
    }

    public static int getTypeSize(byte variable) {
        return 1;
    }

    public static int getTypeSize(short variable) {
        return 2;
    }

    public static int getTypeSize(int variable) {
        return 4;
    }

    public static int getTypeSize(long variable) {
        return 8;
    }

    public static int getTypeSize(float variable) {
        return 4;
    }

    public static int getTypeSize(double variable) {
        return 8;
    }
}