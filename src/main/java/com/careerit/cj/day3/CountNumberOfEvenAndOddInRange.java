package com.careerit.cj.day3;

import java.util.Scanner;

public class CountNumberOfEvenAndOddInRange {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lb :");
        int lb = sc.nextInt();
        System.out.println("Enter the ub :");
        int ub = sc.nextInt();
        int evenCount = 0;
        int oddCount = 0;
        for (int i = lb; i <= ub; i++) {
            if(i % 2 == 0){
                evenCount++;
            }else{
                oddCount++;
            }
        }
        System.out.println("Even numbers count :"+evenCount);
        System.out.println("Odd numbers count  :"+oddCount);

    }
}
