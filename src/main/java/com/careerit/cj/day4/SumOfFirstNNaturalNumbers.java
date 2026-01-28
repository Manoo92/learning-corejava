package com.careerit.cj.day4;

public class SumOfFirstNNaturalNumbers {
    public static void main(String[] args) {

        int sum = sumOfNNaturalNumbers(100);
        System.out.println("Result is " + sum);

    }

    public static int sumOfNNaturalNumbers(int n) {
        int sum = 0;
        int i = 1;
        while(i <= n){
            sum += i;
            i++;
        }
        return sum;
    }
}
