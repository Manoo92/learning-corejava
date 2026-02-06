package com.careerit.cj.day9;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Krish");
        list.add("Lakshmi");
        list.add("Sai");
        list.add("Lakshmi");
        list.add("John");
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.get(1));

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------");
        for (String name : list) {
            System.out.println(name);
        }
        System.out.println("----------------");
        list.forEach(name ->
                System.out.println(name)
        );
    }
}
