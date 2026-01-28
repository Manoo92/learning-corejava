package com.careerit.cj.day3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class DiceGame {

    public static void main(String[] args) {

        int genNum = ThreadLocalRandom.current().nextInt(1, 7);

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3; i++) {
            System.out.println("Guess the number in rage (1-6) only:");
            int num = sc.nextInt();
            if (genNum == num) {
                System.out.println("You guessed number in " + i + " attempts");
                break;
            } else {
                if(i == 3){
                    System.out.println("You reached max attempts, number is :"+genNum);
                }else {
                    System.out.println("Your guess is wrong");
                }
            }
        }
    }
}
