package com.careerit.cj.accessmodifiers.two;

import com.careerit.cj.accessmodifiers.one.C1;

public class C4 extends C1 {

    public void showDetails(){
        //System.out.println("Private Number: " + pri_num);
        //System.out.println("Default Number: " + def_num);
        System.out.println("Protected Number: " + prot_num);
        System.out.println("Public Number: " + pub_num);
    }
}
