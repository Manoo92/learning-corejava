package com.careerit.cj.day4;

public class MethodExample {

    public static void main(String[] args) {
        int big = biggestOf(2,3,5);
        System.out.println("Biggest is :"+big);
        greet("Krish");
        String osName = getOsName();
        System.out.println(osName);
        showSystemInfo();
    }

    // With return type and with arguments
    public static int biggestOf(int a, int b, int c){
        return Math.max(a,Math.max(b,c));
    }

    // With arguments without return type
    public static void greet(String user){
        System.out.println("Hi "+user+", Good morning");
    }

    // without arguments with return type
    public static String getOsName(){
         return System.getProperties().getProperty("os.name");
    }

    // Without argument without return type
    public static void showSystemInfo(){
        System
                .getProperties()
                .forEach((key, value) -> System.out.println(key + " => " + value));
    }

}
