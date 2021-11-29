package lesson2;

import java.io.*;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class StringClass {
    public static void main(String[] args) throws IOException {
        /*System.out.println("\"30\" августа 2014г.");
        System.out.println("C:\\Windows\\System32\\Drivers\\etc\\hosts");
        System.out.println("\"30\" \августа 2014г. \nC:\\Windows\\System32\\Drivers\\etc\\hosts");
        String str1 = "30\" августа 2014г.";
        String str2 = "C:\\Windows\\System32\\Drivers\\etc\\hosts";
        System.out.println(str1 + "\n" + str2);
        String str3 = new String(str1 + str2);
        System.out.println("Тест конструткора: " + str3);
        String str4 = new String(new char[]{'h', 'e', 'l', 'l', 'о'});
        System.out.println("Тест конструткора: " + str4);
        char[] str5 = new char[]{'h', 'e', 'l', 'l', 'о'};
        System.out.println(str5);
        str5[1] = 'a';
        System.out.println(str5);
        byte num = (byte) (127 + 1);
        System.out.println("Тест переполнения: " + num);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Привет, " + name + "!");

        System.out.print("Введите ваше возвраст: ");
        int age = scanner.nextInt();

        System.out.print("Введите ваше вес: ");
        double weight = scanner.nextDouble();

        System.out.println("Ваш возраст:" + age + "\n" + "Ваш вес:" + weight);*/

        /*String str9 = "строка1";
        String str10 = str9;
        str9 += str10;

        String str11 = str9.toUpperCase();

        System.out.println(str9);
        System.out.println(str10);
        System.out.println(str11);

        char[] array = str11.toCharArray();
        array[0] = 'Z';
        System.out.println(array.length);
        System.out.println(array[array.length - 1]);

        String string15 = "";
        System.out.println("-" + string15.length() + "-");


        double variable = -1.9;
        Math.round(variable);
        System.out.println((int) variable);*/


        /*InputStreamReader inputStream = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStream);
        String inputString;

        inputString =  reader.readLine();
        System.out.println(inputString);*/

        /*FileOutputStream fs = new FileOutputStream("data.bin");
        DataOutputStream ds = new DataOutputStream(fs);

        ds.writeInt(16);

        FileInputStream inputFile = new FileInputStream("data.bin");
        DataInputStream inputData = new DataInputStream(inputFile);

        int number1 = inputData.readInt();
        System.out.println(number1);*/


        String inputString = "\"\"ghb";

        StringBuilder stringBuilder = new StringBuilder(inputString);

        for (int i= 0; i < stringBuilder.length(); i++){
            if (stringBuilder.charAt(i) == '"'){
                stringBuilder.deleteCharAt(i);

                i++;
            }
        }


        System.out.println(stringBuilder);

    }
}