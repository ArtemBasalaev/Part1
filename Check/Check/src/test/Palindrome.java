package test;

public class Palindrome {
    public static void main(String[] args) {

    }

    public static boolean isPalindrome(String enteredLine) {
        for (int i = 0, j = enteredLine.length() - 1; i < j; ++i, --j) {
            char firstSymbol = enteredLine.charAt(i);
            char lastSymbol = enteredLine.charAt(j);

            while (!Character.isLetter(firstSymbol)) {
                if (i == enteredLine.length() - 1) {
                    return true;
                }

                firstSymbol = Character.toLowerCase(enteredLine.charAt(i + 1));
                ++i;
            }

            while (!Character.isLetter(lastSymbol)) {
                lastSymbol = Character.toLowerCase(enteredLine.charAt(j - 1));
                --j;
            }

            firstSymbol = Character.toLowerCase(enteredLine.charAt(i));
            lastSymbol = Character.toLowerCase(enteredLine.charAt(j));

            if (firstSymbol != lastSymbol) {
                return false;
            }
        }

        return true;
    }
}
