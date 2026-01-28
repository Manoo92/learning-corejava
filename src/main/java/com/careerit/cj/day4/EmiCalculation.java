package com.careerit.cj.day4;

import java.util.Scanner;

public class EmiCalculation {

    public static void main(String[] args) {

        // P x R x (1+R)^N / [(1+R)^N-1]
        // where-
        //P = Principal loan amount
        //N = Loan tenure in months

        //R = Monthly interest rate

        //The rate of interest (R) on your loan is calculated per month.

        //R = Annual Rate of interest/12/100
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principal amount :");
        double P = sc.nextDouble();
        System.out.println("Enter the loan tenure in months :");
        int N = sc.nextInt();
        System.out.println("Enter the interest rate :");
        double RI = sc.nextDouble();
        double EMI = emiCal(P, RI, N);
        System.out.println("Principal amount :" + P);
        System.out.println("Rate or interest :" + RI);
        System.out.println("Tenure in months :" + N);

        double totalAmount = EMI * N;
        double totalInterest = totalAmount - P;

        System.out.println("EMI amount       :" + Math.round(EMI));
        System.out.println("Total amount     :" + Math.round(totalAmount));
        System.out.println("Total interest   :" + Math.round(totalInterest));

    }

    static double emiCal(double P, double RI, int N){
        double R = RI / 12 / 100;
        return   (P * R * Math.pow((1 + R), N)) / (Math.pow((1 + R), N) - 1);
    }

}
