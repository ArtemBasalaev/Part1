package test;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    @Test
    void isPalindrome1() {
        boolean result = Palindrome.isPalindrome("\"А роза упала на лапу Азора\"");

        assertTrue(result);
    }

    @Test
    void isPalindrome2() {
        boolean result = Palindrome.isPalindrome("");

        assertTrue(result);
    }

    @Test
    void isPalindrome3() {
        boolean result = Palindrome.isPalindrome("Аргентина манит негра");

        assertTrue(result);
    }

    @Test
    void isPalindrome4() {
        boolean result = Palindrome.isPalindrome(" Аргентина манит 6+++ негра");

        assertTrue(result);
    }

    @Test
    void isPalindrome5() {
        boolean result = Palindrome.isPalindrome("1Аргентина мани66т негра");

        assertTrue(result);
    }

    @Test
    void isPalindrome6() {
        boolean result = Palindrome.isPalindrome("glп");

        assertFalse(result);
    }

    @Test
    void isPalindrome7() {
        boolean result = Palindrome.isPalindrome("   Аргентина     манит   негра   ");

        assertTrue(result);
    }

    @Test
    void isPalindrome8() {
        boolean result = Palindrome.isPalindrome("   12456   ");

        assertTrue(result);
    }

    @Test
    void isPalindrome9() {
        boolean result = Palindrome.isPalindrome("Аргентина не очень манит негра");

        assertFalse(result);
    }
}