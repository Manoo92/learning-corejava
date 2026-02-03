package com.careerit.cj.accessmodifiers.two;

import com.careerit.cj.accessmodifiers.one.C1;

public class C5 {
    C1 obj = new C1();

    public void show(){
        // System.out.println("Private Number: " + obj.pri_num);
        // System.out.println("Default Number: " + obj.def_num);
        // System.out.println("Protected Number: " + obj.prot_num);
        System.out.println("Public Number: " + obj.pub_num);
    }
}
