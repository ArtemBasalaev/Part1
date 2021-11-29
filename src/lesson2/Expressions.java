package lesson2;

public class Expressions {
    public static void main(String[] args) {
        int x = 3 - ((56 - 12) / 44) * 4 / 2;
        double y = 2.0 * x / (33 - x);
        double z = -x / (2 * y);
        System.out.println("Переменная x = " + x + "; Переменная y = " + y + "; Переменная z = " + z);
    }
}