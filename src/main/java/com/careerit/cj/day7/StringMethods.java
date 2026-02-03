package com.careerit.cj.day7;

public class StringMethods {

    public static void main(String[] args) {
        demonstrateBasicStringOperations();
        demonstrateStringComparison();
        demonstrateStringManipulation();
        demonstrateStringBuilder();
    }
    
    public static void demonstrateBasicStringOperations() {
        System.out.println("=== Basic String Operations ===");
        
        String name1 = "Krish";
        String name2 = new String("Krish");
        String name3 = new String(new char[]{'K', 'r', 'i', 's', 'h'});
        
        System.out.println("name1: " + name1);
        System.out.println("name2: " + name2);
        System.out.println("name3: " + name3);
        
        System.out.println("Length of name1: " + name1.length());
        System.out.println("First character of name1: " + name1.charAt(0));
        
        String data = "COREJAVA";
        System.out.println("\nCharacters in " + data + ":");
        for(int i = 0; i < data.length(); i++) {
            System.out.println(data.charAt(i));
        }
        
        char[] chArr = data.toCharArray();
        System.out.println("Character array: " + new String(chArr));
        
        String data1 = "Hello World";
        System.out.println("Uppercase: " + data1.toUpperCase());
        System.out.println("Lowercase: " + data1.toLowerCase());
        System.out.println();
    }
    
    public static void demonstrateStringComparison() {
        System.out.println("=== String Comparison ===");
        
        String s1 = "Core";
        s1 = s1.concat(" Java");
        System.out.println("After concat: " + s1);
        
        String s2 = "CoreJava";
        String s3 = "CoreJava";
        
        System.out.println("s2 == s3: " + (s2 == s3));
        System.out.println("s2.equals(s3): " + s2.equals(s3));
        
        String s4 = new String("CoreJava");
        String s5 = new String("CoreJava");
        
        System.out.println("s4 == s5: " + (s4 == s5));
        System.out.println("s4.equals(s5): " + s4.equals(s5));
        System.out.println("s2.equals(s5): " + s2.equals(s5));
        System.out.println();
    }
    
    public static void demonstrateStringManipulation() {
        System.out.println("=== String Manipulation ===");
        
        String data = "Learning java is fun";
        System.out.println("Original: " + data);
        System.out.println("Substring from index 17: " + data.substring(17));
        System.out.println("Substring from index 2 to 5: " + data.substring(2, 5));
        
        String result = data.substring(16)
                .trim()
                .toUpperCase()
                .substring(1);
        System.out.println("Complex manipulation result length: " + result.length());
        
        String data1 = "Krish, Charan , Rajesh,Manish, Jayesh, Rani";
        String[] names = data1.split(",");
        
        System.out.println("\nNames processing:");
        for(String name : names) {
            System.out.println(name.trim().substring(0, 3).toUpperCase());
        }
        System.out.println();
    }
    
    public static void demonstrateStringBuilder() {
        System.out.println("=== StringBuilder Example ===");
        
        String id = "C1001";
        String name = "Krish";
        String city = "Hyderabad";
        
        StringBuilder sb = new StringBuilder();
        String data = sb
                .append(id)
                .append("-")
                .append(name)
                .append("-")
                .append(city)
                .toString();
        
        System.out.println("Formatted data: " + data);
        
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Hello").append(" ").append("World").append("!");
        System.out.println("StringBuilder result: " + sb2.toString());
        
        sb2.insert(5, " Beautiful");
        System.out.println("After insert: " + sb2.toString());
        
        sb2.delete(5, 15);
        System.out.println("After delete: " + sb2.toString());
    }
}
