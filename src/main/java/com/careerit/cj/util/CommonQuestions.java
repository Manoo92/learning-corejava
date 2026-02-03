package com.careerit.cj.util;

public class CommonQuestions {

    // Returns factorial of num (e.g., 5! = 120)
    public int getFactorial(int num) {
        if (num < 0) {
            return -1;
        }
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Returns the nth Fibonacci number (0, 1, 1, 2, 3, 5, 8...)
    public int getFibonacci(int num) {
        if (num <= 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        }
        int prev = 0;
        int curr = 1;
        for (int i = 2; i <= num; i++) {
            int next = prev + curr;
            prev = curr;
            curr = next;
        }
        return curr;
    }

    // Returns the nth prime number (1st=2, 2nd=3, 3rd=5...)
    public int getPrimeNumber(int num) {
        if (num <= 0) {
            return -1;
        }
        int count = 0;
        int number = 1;
        while (count < num) {
            number++;
            if (isPrime(number)) {
                count++;
            }
        }
        return number;
    }

    // Returns the number if it's Armstrong, otherwise returns -1
    // Armstrong: sum of digits^n equals the number (e.g., 153 = 1^3 + 5^3 + 3^3)
    public int getArmstrongNumber(int num) {
        if (num < 0) {
            return -1;
        }
        int original = num;
        int digits = String.valueOf(num).length();
        int sum = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return sum == original ? original : -1;
    }

    // Returns the number if it's Perfect, otherwise returns -1
    // Perfect: sum of divisors (excluding itself) equals the number (e.g., 6 = 1+2+3)
    public int getPerfectNumber(int num) {
        if (num <= 1) {
            return -1;
        }
        int sum = 0;
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num ? num : -1;
    }

    // Returns the number if it's Palindrome, otherwise returns -1
    // Palindrome: reads same forwards and backwards (e.g., 121, 1331)
    public int getPalindromeNumber(int num) {
        if (num < 0) {
            return -1;
        }
        int original = num;
        int reversed = 0;
        int temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }
        return reversed == original ? original : -1;
    }

    // Returns array of all prime numbers in the given range [start, end]
    public int[] getPrimeInRange(int start, int end) {
        int count = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                count++;
            }
        }
        int[] primes = new int[count];
        int index = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                primes[index++] = i;
            }
        }
        return primes;
    }

    // Returns sum of all prime numbers in the given range [start, end]
    public int getSumOfPrimeInRange(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    // Helper method to check if a number is prime
    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(num); i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
