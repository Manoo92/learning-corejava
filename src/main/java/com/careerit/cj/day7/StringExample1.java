package com.careerit.cj.day7;

public class StringExample1 {
    public static void main(String[] args) {

        String name1 = "Krish";
        String name2 = new String("Krish");
        String name3 = new String(new char[]{'K', 'r', 'i', 's', 'h'});

        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);

        System.out.println(name1.length());
        System.out.println(name1.charAt(0));

        String data = "COREJAVA";

        for(int i=0;i<data.length();i++){
            System.out.println(data.charAt(i));
        }

        char[] chArr = data.toCharArray();
        System.out.println(chArr);

        String data1 = "Hello World";
        System.out.println(data1.toUpperCase());


    }
}
