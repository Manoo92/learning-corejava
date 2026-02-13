package com.careerit.cj.collectionsex;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class MangoService {

    public static void main(String[] args) {

        List<Mango> mangoList = getMangoesFromJsonFile();

        List<Mango> yellowMangoes = getMangoes(mangoList, mango -> mango.getColor().equalsIgnoreCase("yellow"));
        yellowMangoes
                .forEach(System.out::println);

        List<Mango> weightMoreThan300 = getMangoes(mangoList, mango -> mango.getWeight() > 300);
        System.out.println(weightMoreThan300.size());

        // Get mango names in upper case which are yellow color, weight is more 400 unique names
        List<String> mangoNames = mangoList
                .stream()
                .filter(m -> m.getColor().equalsIgnoreCase("yellow") && m.getWeight() > 300)
                .map(m -> m.getName().toUpperCase())
                .distinct()
                .toList();
        System.out.println(mangoNames);


    }


    private static List<Mango> getMangoesFromJsonFile() {

        ObjectMapper objectMapper = new ObjectMapper();
        List<Mango> mangoList = new ArrayList<>();
        try {
            mangoList =
                    objectMapper.readValue(MangoService.class.getResourceAsStream("/mangoes.json"),
                            new TypeReference<List<Mango>>() {
                            });
        } catch (Exception e) {
            System.out.println(e);
        }
        return mangoList;
    }

    public static List<Mango> getMangoes(List<Mango> mangoList, Predicate<Mango> predicate) {
        return mangoList
                .stream()
                .filter(predicate)
                .filter(predicate)
                .filter(predicate)
                .toList();
    }
}
