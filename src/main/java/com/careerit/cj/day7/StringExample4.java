package com.careerit.cj.day7;

public class StringExample4 {

    public static void main(String[] args) {

        String id = "C1001";
        String name = "Krish";
        String city = "Hyderabad";

        StringBuilder sb = new StringBuilder();
        String data =
                sb
                        .append(id)
                        .append("-")
                        .append(name)
                        .append("-")
                        .append(city)
                        .toString();
        System.out.println(data);
    }
}
