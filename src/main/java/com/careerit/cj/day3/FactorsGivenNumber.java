package com.careerit.cj.day3;

import java.util.Scanner;

public class FactorsGivenNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num :");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if(num % i == 0){
                count++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        if(count == 2){
            System.out.println(num+" is a prime");
        }else{
            System.out.println(num+" is not a prime");
        }
    }
}
