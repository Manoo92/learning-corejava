package com.careerit.cj.day11;

import com.fasterxml.jackson.databind.ObjectMapper;

public class ReadingAndWritingJson {

    public static void main(String[] args) {

        String productJson = """
                {
                    "id": "P1001",
                    "name": "iPhone 16 Pro Max",
                    "price": 180000
                }
                """;

        ObjectMapper objectMapper = AppConfig.getObjectMapper();
        try {
            Product product = objectMapper.readValue(productJson, Product.class);
            System.out.println(product);

            String jsonStr = objectMapper.writeValueAsString(product);
            System.out.println(jsonStr);

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
