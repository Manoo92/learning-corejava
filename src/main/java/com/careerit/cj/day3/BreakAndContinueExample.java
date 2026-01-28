package com.careerit.cj.day3;

public class BreakAndContinueExample {


    public static void main(String[] args) {

        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("End of main method");

        for (int i = 1; i <= 20; i++) {
            if (i % 5 == 0) {
                continue;
            }
            System.out.println(i);
        }

        //

        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
