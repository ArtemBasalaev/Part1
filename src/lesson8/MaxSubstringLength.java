package lesson8;

public class MaxSubstringLength {
    public static void main(String[] args) {
        String string = "ааабББбБбдеггггВвВв";
        System.out.println("Строка: " + string);

        int maxSubstringLength = getMaxSubstringLength(string);
        System.out.println("длина максимальной подстроки состоящей из одного и того же символа = " + maxSubstringLength);
    }

    public static int getMaxSubstringLength(String string) {
        if (string.length() == 0) {
            return 0;
        }

        string = string.toLowerCase();

        int currentSubstringLength = 1;
        int maxSubstringLength = 1;

        for (int i = 1; i < string.length(); i++) {
            char previousSymbol = string.charAt(i - 1);
            char currentSymbol = string.charAt(i);

            if (previousSymbol == currentSymbol) {
                currentSubstringLength++;
            } else {
                if (maxSubstringLength < currentSubstringLength) {
                    maxSubstringLength = currentSubstringLength;
                }

                currentSubstringLength = 1;
            }
        }

        if (maxSubstringLength < currentSubstringLength) {
            maxSubstringLength = currentSubstringLength;
        }

        return maxSubstringLength;
    }
}