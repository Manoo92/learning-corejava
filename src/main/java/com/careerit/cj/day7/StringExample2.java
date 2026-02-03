package com.careerit.cj.day7;

public class StringExample2 {

    public static void main(String[] args) {

        String s1 = "Core";
        s1 = s1.concat(" Java");
        System.out.println(s1);

        String s2 = "CoreJava";
        String s3 = "CoreJava";

        System.out.println(s2 == s3);
        System.out.println(s2.equals(s3));

        String s4 = new String("CoreJava");
        String s5 = new String("CoreJava");

        System.out.println(s4 == s5);
        System.out.println(s4.equals(s5));

        System.out.println(s2.equals(s5));

        String data = "Learning java is fun";
        System.out.println(data.substring(17));
        System.out.println(data.substring(2, 5));

        System.out.println(data.substring(16)
                .trim()
                .toUpperCase()
                .substring(1)
                .length());

        String data1 = "Krish, Charan , Rajesh,Manish, Jayesh, Rani";

        String[] names = data1.split(",");

        for(String name : names){
            System.out.println(name.trim().substring(0,3).toUpperCase());
        }


    }
}
