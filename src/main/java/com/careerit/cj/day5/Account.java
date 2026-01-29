package com.careerit.cj.day5;

public class Account {

        private String accNum;
        private String name;
        private double balance;

        public Account(String accNum, String name, double balance){
            this.accNum = accNum;
            this.name = name;
            this.balance = balance;
        }

        public void showDetails(){
            System.out.println("Account number  :"+accNum);
            System.out.println("Name            :"+name);
            System.out.println("Balance         :"+balance);
        }

        public void withdrawAmount(double amount){
            if(amount < balance){
                System.out.println("Sorry! you don't have sufficient funds");
            }else{
                balance -= amount;
                System.out.println("You current balance :"+balance);
            }
        }
        public void deposit(double amount){
            balance += amount;
            System.out.println("You current balance :"+balance);
        }
}
