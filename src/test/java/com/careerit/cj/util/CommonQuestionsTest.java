package com.careerit.cj.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CommonQuestionsTest {

    private CommonQuestions commonQuestions;

    @BeforeEach
    void setUp() {
        commonQuestions = new CommonQuestions();
    }

    @Nested
    @DisplayName("Factorial Tests")
    class FactorialTests {

        @Test
        @DisplayName("Factorial of 0 should be 1")
        void factorialOfZero() {
            assertEquals(1, commonQuestions.getFactorial(0));
        }

        @Test
        @DisplayName("Factorial of 1 should be 1")
        void factorialOfOne() {
            assertEquals(1, commonQuestions.getFactorial(1));
        }

        @Test
        @DisplayName("Factorial of 5 should be 120")
        void factorialOfFive() {
            assertEquals(120, commonQuestions.getFactorial(5));
        }

        @Test
        @DisplayName("Factorial of 10 should be 3628800")
        void factorialOfTen() {
            assertEquals(3628800, commonQuestions.getFactorial(10));
        }

        @Test
        @DisplayName("Factorial of negative number should return -1")
        void factorialOfNegative() {
            assertEquals(-1, commonQuestions.getFactorial(-5));
        }
    }

    @Nested
    @DisplayName("Fibonacci Tests")
    class FibonacciTests {

        @Test
        @DisplayName("Fibonacci of 0 should be 0")
        void fibonacciOfZero() {
            assertEquals(0, commonQuestions.getFibonacci(0));
        }

        @Test
        @DisplayName("Fibonacci of 1 should be 1")
        void fibonacciOfOne() {
            assertEquals(1, commonQuestions.getFibonacci(1));
        }

        @Test
        @DisplayName("Fibonacci of 6 should be 8")
        void fibonacciOfSix() {
            assertEquals(8, commonQuestions.getFibonacci(6));
        }

        @Test
        @DisplayName("Fibonacci of 10 should be 55")
        void fibonacciOfTen() {
            assertEquals(55, commonQuestions.getFibonacci(10));
        }

        @Test
        @DisplayName("Fibonacci of negative should be 0")
        void fibonacciOfNegative() {
            assertEquals(0, commonQuestions.getFibonacci(-5));
        }
    }

    @Nested
    @DisplayName("Prime Number Tests")
    class PrimeNumberTests {

        @Test
        @DisplayName("1st prime number should be 2")
        void firstPrime() {
            assertEquals(2, commonQuestions.getPrimeNumber(1));
        }

        @Test
        @DisplayName("2nd prime number should be 3")
        void secondPrime() {
            assertEquals(3, commonQuestions.getPrimeNumber(2));
        }

        @Test
        @DisplayName("5th prime number should be 11")
        void fifthPrime() {
            assertEquals(11, commonQuestions.getPrimeNumber(5));
        }

        @Test
        @DisplayName("10th prime number should be 29")
        void tenthPrime() {
            assertEquals(29, commonQuestions.getPrimeNumber(10));
        }

        @Test
        @DisplayName("0th prime should return -1")
        void zerothPrime() {
            assertEquals(-1, commonQuestions.getPrimeNumber(0));
        }
    }

    @Nested
    @DisplayName("Armstrong Number Tests")
    class ArmstrongNumberTests {

        @Test
        @DisplayName("153 is an Armstrong number")
        void armstrongNumber153() {
            assertEquals(153, commonQuestions.getArmstrongNumber(153));
        }

        @Test
        @DisplayName("370 is an Armstrong number")
        void armstrongNumber370() {
            assertEquals(370, commonQuestions.getArmstrongNumber(370));
        }

        @Test
        @DisplayName("9474 is an Armstrong number")
        void armstrongNumber9474() {
            assertEquals(9474, commonQuestions.getArmstrongNumber(9474));
        }

        @Test
        @DisplayName("123 is not an Armstrong number")
        void notArmstrongNumber() {
            assertEquals(-1, commonQuestions.getArmstrongNumber(123));
        }

        @Test
        @DisplayName("Single digit numbers are Armstrong numbers")
        void singleDigitArmstrong() {
            assertEquals(5, commonQuestions.getArmstrongNumber(5));
        }
    }

    @Nested
    @DisplayName("Perfect Number Tests")
    class PerfectNumberTests {

        @Test
        @DisplayName("6 is a perfect number (1+2+3=6)")
        void perfectNumber6() {
            assertEquals(6, commonQuestions.getPerfectNumber(6));
        }

        @Test
        @DisplayName("28 is a perfect number (1+2+4+7+14=28)")
        void perfectNumber28() {
            assertEquals(28, commonQuestions.getPerfectNumber(28));
        }

        @Test
        @DisplayName("496 is a perfect number")
        void perfectNumber496() {
            assertEquals(496, commonQuestions.getPerfectNumber(496));
        }

        @Test
        @DisplayName("12 is not a perfect number")
        void notPerfectNumber() {
            assertEquals(-1, commonQuestions.getPerfectNumber(12));
        }

        @Test
        @DisplayName("1 is not a perfect number")
        void oneIsNotPerfect() {
            assertEquals(-1, commonQuestions.getPerfectNumber(1));
        }
    }

    @Nested
    @DisplayName("Palindrome Number Tests")
    class PalindromeNumberTests {

        @Test
        @DisplayName("121 is a palindrome")
        void palindrome121() {
            assertEquals(121, commonQuestions.getPalindromeNumber(121));
        }

        @Test
        @DisplayName("1331 is a palindrome")
        void palindrome1331() {
            assertEquals(1331, commonQuestions.getPalindromeNumber(1331));
        }

        @Test
        @DisplayName("12321 is a palindrome")
        void palindrome12321() {
            assertEquals(12321, commonQuestions.getPalindromeNumber(12321));
        }

        @Test
        @DisplayName("123 is not a palindrome")
        void notPalindrome() {
            assertEquals(-1, commonQuestions.getPalindromeNumber(123));
        }

        @Test
        @DisplayName("Single digit is a palindrome")
        void singleDigitPalindrome() {
            assertEquals(7, commonQuestions.getPalindromeNumber(7));
        }

        @Test
        @DisplayName("Negative number returns -1")
        void negativePalindrome() {
            assertEquals(-1, commonQuestions.getPalindromeNumber(-121));
        }
    }

    @Nested
    @DisplayName("Prime In Range Tests")
    class PrimeInRangeTests {

        @Test
        @DisplayName("Primes between 1 and 10")
        void primesOneToTen() {
            int[] expected = {2, 3, 5, 7};
            assertArrayEquals(expected, commonQuestions.getPrimeInRange(1, 10));
        }

        @Test
        @DisplayName("Primes between 10 and 20")
        void primesTenToTwenty() {
            int[] expected = {11, 13, 17, 19};
            assertArrayEquals(expected, commonQuestions.getPrimeInRange(10, 20));
        }

        @Test
        @DisplayName("Primes between 20 and 30")
        void primesTwentyToThirty() {
            int[] expected = {23, 29};
            assertArrayEquals(expected, commonQuestions.getPrimeInRange(20, 30));
        }

        @Test
        @DisplayName("No primes in range returns empty array")
        void noPrimesInRange() {
            int[] expected = {};
            assertArrayEquals(expected, commonQuestions.getPrimeInRange(24, 28));
        }
    }

    @Nested
    @DisplayName("Sum Of Primes In Range Tests")
    class SumOfPrimesInRangeTests {

        @Test
        @DisplayName("Sum of primes between 1 and 10 is 17")
        void sumPrimesOneToTen() {
            assertEquals(17, commonQuestions.getSumOfPrimeInRange(1, 10));
        }

        @Test
        @DisplayName("Sum of primes between 10 and 20 is 60")
        void sumPrimesTenToTwenty() {
            assertEquals(60, commonQuestions.getSumOfPrimeInRange(10, 20));
        }

        @Test
        @DisplayName("Sum of primes between 1 and 100")
        void sumPrimesOneToHundred() {
            assertEquals(1060, commonQuestions.getSumOfPrimeInRange(1, 100));
        }

        @Test
        @DisplayName("Sum of primes with no primes in range is 0")
        void sumNoPrimesInRange() {
            assertEquals(0, commonQuestions.getSumOfPrimeInRange(24, 28));
        }
    }
}