package com.careerit.cj.day5;

public class AccountManager {

    public static void main(String[] args) {

            Account acc1 = new Account("SB1001","Krish",50000);
            Account acc2 = new Account("SB1201","John Doe",550000);
            Account acc3 = new Account("SB1301","Charan",150000);


            acc1.showDetails();
            System.out.println("-".repeat(50));
            acc2.showDetails();
            System.out.println("-".repeat(50));
            acc3.showDetails();


            acc1.deposit(5000);
            acc1.showDetails();

    }
}
