package com.careerit.cj.day6;

import java.util.Arrays;

public class ArrayExample2 {

    public static void main(String[] args) {
        int lb = 1;
        int ub = 10;
        int[] arr = getPrimesInRange(lb, ub);
        System.out.println(Arrays.toString(arr));
    }

    private static boolean isPrime(int num) {
        if (num < 2 || (num % 2 == 0 && num != 2)) {
            return false;
        }
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int primeCount(int lb, int ub) {
        int count = 0;
        for (int num = lb; num <= ub; num++) {
            if (isPrime(num)) {
                count++;
            }
        }
        return count;
    }

    public static int[] getPrimesInRange(int lb, int ub) {
        int[] primeArr = new int[primeCount(lb, ub)];
        int index = 0;
        for (int num = lb; num <= ub; num++) {
            if(isPrime(num)){
                primeArr[index++] = num;
            }
        }
        return primeArr;
    }

    private static int biggestOf(int[] arr){
        return 0;
    }

    // if element present return index otherwise return -1
    private static int getIndexOf(int[] arr, int ele){
        return -1;
    }
}
