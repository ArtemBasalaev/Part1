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
        if (string.length() == 0) {
            return true;
        }

        for (int i = 0, j = string.length() - 1; i < j; i++, j--) {
            char firstLetter = string.charAt(i);
            char lastLetter = string.charAt(j);

            while (!Character.isLetter(firstLetter)) {
                i++;

                if (i == string.length()) {
                    return true;
                }

                firstLetter = string.charAt(i);
            }

            while (!Character.isLetter(lastLetter)) {
                j--;
                lastLetter = string.charAt(j);
            }

            firstLetter = Character.toLowerCase(firstLetter);
            lastLetter = Character.toLowerCase(lastLetter);

            if (firstLetter != lastLetter) {
                return false;
            }
        }

        return true;
    }
}