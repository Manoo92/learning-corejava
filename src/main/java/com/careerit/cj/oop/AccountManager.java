package com.careerit.cj.oop;

public class AccountManager {
    public static void main(String[] args) {

            Account acc1 = new Account("SB1001","Krish",45000);
            acc1.showDetails();
            acc1.deposit(5000);
            acc1.withdraw(10000);
            acc1.showDetails();

    }
}
