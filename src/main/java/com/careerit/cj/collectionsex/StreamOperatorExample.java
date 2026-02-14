package com.careerit.cj.collectionsex;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamOperatorExample {


    public static void main(String[] args) {

        List<List<Integer>> dataList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5,6,7,8,10,11,12,13,14,15,16));
        List<Integer> list2 = new ArrayList<>(List.of(13,14,15,16,17,18,19,20));

        dataList.add(list1);
        dataList.add(list2);
        // Even, Double, Divisible by 3 get it as list

        List<Integer> result =
                list1.stream()
                        .filter(ele->ele % 2==0)
                        .map(ele -> ele * 2)
                        .filter(ele -> ele % 3 == 0)
                        .toList();
        System.out.println(result);

        List<Integer> divisibleBy3List = dataList
                .stream()
                .flatMap(Collection::stream)
                .filter(ele -> ele % 3 == 0)
                .toList();
        System.out.println(divisibleBy3List);

    }

}
