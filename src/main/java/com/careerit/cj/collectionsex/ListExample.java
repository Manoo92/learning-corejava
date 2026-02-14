package com.careerit.cj.collectionsex;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Krish");
        names.add("Kalyan");
        names.add("Charan");

        for(String name: names){
            System.out.println(name);
        }
        names.forEach(System.out::println);
    }
}
