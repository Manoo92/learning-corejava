package com.careerit.cj.oop;

class A {
    A(){
        IO.println("A");
    }
}
class B extends A{
    B(String message){
        IO.println("B");
    }
}
class C extends  B{
    C(){
        super("Some Data");
        IO.println("C");
    }

}
public class ConstructorChainManager {

    public static void main(String[] args) {

        A obj = new C();
    }
}
