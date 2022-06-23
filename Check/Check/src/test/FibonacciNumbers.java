package test;

public class FibonacciNumbers {

    public static int test(int fibonacciNumberIndex) {
        int previousFibonacciNumber = 0;
        int currentFibonacciNumber = 1;

        if (fibonacciNumberIndex == 0) {
            return 0;
        } else {
            for (int i = 1; i < fibonacciNumberIndex; i++) {
                int sumPreviousAndCurrent = previousFibonacciNumber + currentFibonacciNumber;
                previousFibonacciNumber = currentFibonacciNumber;
                currentFibonacciNumber = sumPreviousAndCurrent;
            }

            return currentFibonacciNumber;
        }
        //return nextFibonacciNumber;
    }
}