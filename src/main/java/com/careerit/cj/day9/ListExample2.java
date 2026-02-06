package com.careerit.cj.day9;

import java.util.ArrayList;
import java.util.List;

public class ListExample2 {

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list1.add(10);
        list1.add(20);
        list1.add(30);

        list2.add(40);
        list2.add(50);
        list2.add(60);
        List<Integer> list3 = new ArrayList<>();
        list3.addAll(list1);
        list3.addAll(list2);
        System.out.println(list3);

        System.out.println(list3.contains(20));
        System.out.println(list3.containsAll(list1));

    }
}
