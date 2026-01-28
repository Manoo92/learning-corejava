package com.careerit.cj.day4;

public class MultiplicationOfTableWithMethods {

    public static void main(String[] args) {
            showTables(11,15);
    }


    public static void showTables(int lb, int ub) {
        for (int i = lb; i <= ub; i++) {
            showTable(i);
            System.out.println("-----------------");
        }
    }

    public static void showTable(int num) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " * " + i + " = " + num * i);
        }
    }
}
