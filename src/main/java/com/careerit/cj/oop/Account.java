package com.careerit.cj.oop;

public class Account {

    protected String accNum;
    protected String name;
    protected double balance;

    public Account(String accNum, String name, double balance) {
        this.accNum = accNum;
        this.name = name;
        this.balance = balance;
    }

    protected void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("You don't have sufficient funds");
            return;
        }
        this.balance -= amount;
        System.out.println("Account :"+this.accNum+" has been credited with amount :"+amount+
                " and current balance is : "+balance);
    }

    protected void deposit(double amount) {
        this.balance += amount;
        System.out.println("Account :"+this.accNum+" has been debited with amount :"+amount+
                " and current balance is : "+balance);
    }

    public void showDetails() {
        IO.println("Account Number: " + this.accNum);
        IO.println("Name: " + this.name);
        IO.println("Balance: " + this.balance);
    }

}
