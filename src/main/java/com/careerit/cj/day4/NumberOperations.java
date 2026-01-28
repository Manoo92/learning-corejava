package com.careerit.cj.day4;

public class NumberOperations {

    public static void main(String[] args) {
        // Write you logic to test methods
    }

    // Sum of digits of given number
    public static int sumOfDigits(int num){
        int sum = 0;
        while(num != 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }

    // Reverse of give number
    public static int reverseOfNum(int num){
        int rev = 0;
        while(num != 0){
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }
    // Palindrome or not
    public static boolean isPalindrome(int num){
          return num == reverseOfNum(num);
    }
    // Example: 9279 => 27 => 9
    public static int sumOfDigitsUntilSumGetsSingleDigit(int num){
        // TODO
        return 0;
    }


}
