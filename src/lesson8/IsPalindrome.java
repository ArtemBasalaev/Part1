package lesson8;

public class IsPalindrome {
    public static void main(String[] args) {
        String string = "\"А роза упала на лапу Азора\"";
        System.out.println("Строка: " + string);

        boolean isPalindrome = isPalindrome(string);

        if (isPalindrome) {
            System.out.println("является палиндромом");
        } else {
            System.out.println("не является палиндромом");
        }
    }

    public static boolean isPalindrome(String string) {
        /*if (string.length() == 0) {
            return true;
        }*/ // Можно отдельно не проверять пустую строку

        for (int i = 0, j = string.length() - 1; i < j; i++, j--) {
            char leftSymbol = string.charAt(i);
            char rightSymbol = string.charAt(j);

            while (!Character.isLetter(leftSymbol)) {
                i++;

                if (i == string.length() - 1) {
                    return true;
                }

                leftSymbol = string.charAt(i);
            }

            while (!Character.isLetter(rightSymbol)) {
                j--;
                rightSymbol = string.charAt(j);
            }

            if (Character.toLowerCase(leftSymbol) != Character.toLowerCase(rightSymbol)) {
                return false;
            }
        }

        return true;
    }
}