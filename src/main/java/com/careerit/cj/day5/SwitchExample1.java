package com.careerit.cj.day5;

public class SwitchExample1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 12; i++) {
            System.out.println( i + ". " + getMonthName(i));
        }
    }


    public static String getMonthName(int monthNum) {
        return switch (monthNum) {
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid month";
        };

    }
}
