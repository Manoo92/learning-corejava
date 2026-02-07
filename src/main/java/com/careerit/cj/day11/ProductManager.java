package com.careerit.cj.day11;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;

public class ProductManager {

    public static void main(String[] args) {

        String data = """
                [
                  {
                    "id": "P1001",
                    "name": "iPhone 16 Pro Max 256",
                    "price": 180000
                  },
                  {
                    "id": "P1002",
                    "name": "iPhone 16 Pro Max 512",
                    "price": 195000
                  }
                
                ]
                """;
        ObjectMapper obj = AppConfig.getObjectMapper();
        try {
            List<Product> products = obj.readValue(data, new TypeReference<List<Product>>() {
            });
            System.out.println(products);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
