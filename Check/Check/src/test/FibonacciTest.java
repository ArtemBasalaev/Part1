package test;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {
    @Test
    void getFibonacciNumber0() {
        int result = FibonacciNumbers.test(0);

        assertEquals(0, result);
    }

    @Test
    void getFibonacciNumber1() {
        int result = FibonacciNumbers.test(1);

        assertEquals(1, result);
    }

    @Test
    void getFibonacciNumber2() {
        int result = FibonacciNumbers.test(2);

        assertEquals(1, result);
    }

    @Test
    void getFibonacciNumber3() {
        int result = FibonacciNumbers.test(3);

        assertEquals(2, result);
    }

    @Test
    void getFibonacciNumber7() {
        int result = FibonacciNumbers.test(7);

        assertEquals(13, result);
    }
}