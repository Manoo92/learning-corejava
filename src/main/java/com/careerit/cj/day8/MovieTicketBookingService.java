package com.careerit.cj.day8;

public class MovieTicketBookingService {


    public static double getTicketPrice(Day day, int noOfTickets) {
        double basePrice = switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY -> 100;
            case THURSDAY, FRIDAY -> 150;
            case SATURDAY, SUNDAY -> 300;
        };
        
        return basePrice * noOfTickets;
    }

    public static void main(String[] args) {
        System.out.println("Movie Ticket Booking Service - Price Calculation");
        System.out.println("===============================================");
        
        Day[] testDays = {Day.MONDAY, Day.WEDNESDAY, Day.FRIDAY, Day.SATURDAY, Day.SUNDAY};
        int[] ticketCounts = {1, 2, 3, 4, 5};
        
        for (Day day : testDays) {
            for (int tickets : ticketCounts) {
                double price = getTicketPrice(day, tickets);
                System.out.printf("Day: %-10s | Tickets: %d | Price: ₹%.2f%n", 
                                 day, tickets, price);
            }
            System.out.println();
        }
        
        System.out.println("Price Rules:");
        System.out.println("- Monday-Wednesday: ₹100 per ticket");
        System.out.println("- Thursday-Friday: ₹150 per ticket");
        System.out.println("- Saturday-Sunday: ₹300 per ticket");
    }

}
