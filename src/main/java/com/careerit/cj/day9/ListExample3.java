package com.careerit.cj.day9;

import java.util.ArrayList;
import java.util.List;

public class ListExample3 {

    public static void main(String[] args) {

        List<Integer> list1 = List.of(10,20,30,40,10,50,60,60,70,80,90,100);
        List<Integer> list2 = List.of(15,20,35,45,50,65,70,80,95,100);
        List<Integer> list3 = new ArrayList<>();

        for(int ele: list1){
            if(!list3.contains(ele)){
                list3.add(ele);
            }
        }

        for(int ele: list2){
            if(!list3.contains(ele)){
                list3.add(ele);
            }
        }

        System.out.println(list3);

    }
}
