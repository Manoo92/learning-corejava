package com.careerit.cj.abs;

public class CurrentAccount extends Account {

    private double overDraft;

    public CurrentAccount(String accNum, String name, double balance){
        super(accNum, name, balance);
        this.overDraft = 10000;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > (balance + overDraft)) {
            System.out.println("You don't have sufficient funds");
            return;
        }
        this.balance -= amount;
        System.out.println("Account :"+this.accNum+" has been credited with amount :"+amount+
                " and current balance is : "+balance);
    }

}
