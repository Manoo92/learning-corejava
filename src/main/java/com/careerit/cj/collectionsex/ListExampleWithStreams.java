package com.careerit.cj.collectionsex;

import java.util.List;
import java.util.stream.IntStream;

public class ListExampleWithStreams {

    public static void main(String[] args) {

        List<Integer> list = IntStream.range(101, 1000).boxed().toList();
        System.out.println(list);

        // get all numbers which are even

        List<Integer> evenList =
                         list
                                 .stream()
                                 .filter(ele -> ele % 2 == 0)
                                 .toList();


        System.out.println("Even list :" + evenList);

        // get all numbers which are divisible by 9
        List<Integer> divisibleBy9List = list
                .stream()
                .filter(ele->ele% 9 == 0)
                .toList();


        System.out.println("Divisible by 9 list :" + divisibleBy9List);

        // get all numbers which are divisible by 3 but not with 6

        // get all numbers which are divisible by 9
        List<Integer> divisibleBy3NotWith6List = list
                .stream()
                .filter(ele->ele% 3 == 0 && ele % 6 != 0)
                .toList();

        System.out.println("Divisible By 3 but Not With 6 list:" + divisibleBy3NotWith6List);

    }
}
