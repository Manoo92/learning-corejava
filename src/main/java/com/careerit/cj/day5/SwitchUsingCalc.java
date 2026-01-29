package com.careerit.cj.day5;

import java.util.List;
import java.util.Scanner;

public class SwitchUsingCalc {
    // num1, num2 => operator (+,-,*,/,%) using switch expression

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num1: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the num1: ");
        int num2 = sc.nextInt();
        sc.nextLine();
        while (true) {
            System.out.println("Enter the operator (-,+,*,/,%) ");
            String ope = sc.nextLine();
            int res = calculate(num1, num2, ope);
            System.out.println(num1 + " " + ope + " " + num2 + " = " + res);
            System.out.println("Do you want to continue .... (y/n)");
            String ch = sc.nextLine();
            if (!ch.equalsIgnoreCase("y")) {
                break;
            }
        }
    }

    public static int calculate(int num1, int num2, String operator) {
        return switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            case "%" -> num1 % num2;
            default -> throw new RuntimeException("Invalid operator: " + operator);
        };
    }

}


