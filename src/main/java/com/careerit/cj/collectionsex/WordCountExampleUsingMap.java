package com.careerit.cj.collectionsex;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCountExampleUsingMap {

    public static void main(String[] args) {

        String data = "learning java is fun to have fun learn java anything can be learn in fun way finally learning is fun have fun with java";
        Map<String, Long> wordCountMap =
                Arrays.stream(data.split(" ")).
                        collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(wordCountMap);
    }
}
