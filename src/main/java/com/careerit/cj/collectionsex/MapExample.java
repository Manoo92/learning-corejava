package com.careerit.cj.collectionsex;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

    public static void main(String[] args) {

        Map<String,Integer> map = new HashMap<>();
        map.put("Krish",1000);
        map.put("John", 1001);
        map.put("Raj", 1003);
        map.put("Krish",1010);

        System.out.println(map.get("Krish"));
        System.out.println(map.get("Karana"));

        System.out.println(map.getOrDefault("Krish",4000));

        map.putIfAbsent("Raj",1020);
        map.putIfAbsent("Charan",1030);

        System.out.println(map.get("Raj"));
        System.out.println(map.get("Charan"));

        Set<String> keys = map.keySet();
        System.out.println(keys);
        Collection<Integer> values = map.values();
        System.out.println(values);
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();

        for(Map.Entry<String,Integer> entry: entrySet){
            System.out.println(entry.getKey()+" => "+entry.getValue());
        }

        map.forEach((key, value) -> System.out.println(key + " => " + value));

    }
}
