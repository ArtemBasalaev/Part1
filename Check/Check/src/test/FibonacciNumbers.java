package test;

public class FibonacciNumbers {

    public static int test(int fibonacciNumberIndex) {
        int previousNumber = 0;
        int nextNumber = 1;

        if (fibonacciNumberIndex < 0) {
            return -1;
        } else if (fibonacciNumberIndex == 0) {
            return 0;
        } else if (fibonacciNumberIndex == 1) {
            return 1;
        } else  {
            int i = 1;
            while (i < fibonacciNumberIndex) {
                int currentNumber = previousNumber + nextNumber;
                previousNumber = nextNumber;
                nextNumber = currentNumber;
                i++;
            }
            return nextNumber;
        }
        //return nextFibonacciNumber;
    }
}