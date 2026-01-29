package com.careerit.cj.day5;

public class DaysInMonthAndYearUsingSwitch {

    public static void main(String[] args) {

        int year = 2024;
        int month = 2;
        System.out.println("Year " + year + " and " + month + " has " + getDaysIn(month, year) + " days ");

    }

    public static int getDaysIn(int month, int year) {
        return switch (month) {
            case 1, 3, 5, 7, 8, 10, 12 -> 31;
            case 2 -> {
                int days;
                if (isLeapYear(year)) {
                    days = 29;
                } else {
                    days = 28;
                }
                yield days;
            }
            case 4, 6, 9, 11 -> 30;
            default -> throw new RuntimeException("Invalid month " + month);
        };
    }

    private static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

}
