package com.careerit.cj.day3;

public class MultiplicationOfTables {

    public static void main(String[] args) {

        for(int num = 20; num >= 1; num--){
            for (int i = 1; i <= 10; i++) {
                System.out.println(num + " * " + i + " = " + num * i);
            }
            System.out.println("-".repeat(15));
        }

    }
}
