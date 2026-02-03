package com.careerit.cj.accessmodifiers.one;

public class C1 {
    private int pri_num = 10;
    int def_num = 20;
    protected int prot_num = 30;
    public int pub_num = 40;


    public void showDetails(){
        System.out.println("Private Number: " + pri_num);
        System.out.println("Default Number: " + def_num);
        System.out.println("Protected Number: " + prot_num);
        System.out.println("Public Number: " + pub_num);
    }
}
