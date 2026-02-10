package com.careerit.cj.oop;

public class SavingsAccount extends Account {

    private double minBalance;

    public SavingsAccount(String accNum, String name, double balance) {
        super(accNum, name, balance);
        this.minBalance = 1000;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > (balance - minBalance)) {
            System.out.println("You don't have sufficient funds");
            return;
        }
        this.balance -= amount;
        System.out.println("Account :"+this.accNum+" has been credited with amount :"+amount+
                " and current balance is : "+balance);
    }
}
