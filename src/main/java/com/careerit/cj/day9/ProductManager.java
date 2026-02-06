package com.careerit.cj.day9;

import java.util.ArrayList;
import java.util.List;

class Product{

    private String name;
    private double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class ProductManager {

    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("iPhone 16 Pro",150000));
        products.add(new Product("iPhone 16",120000));
        products.add(new Product("iPhone 15 Pro",100000));
        products.add(new Product("iPhone 15",80000));
        products.add(new Product("iPhone 14",60000));
        products.add(new Product("iPhone 16 Pro",160000));

        for(Product product: products){
            System.out.println(product);
        }

        // Get all unique product names into a list
        List<String> productNames = new ArrayList<>();

        for(Product product: products){
            if(!productNames.contains(product.getName())){
                productNames.add(product.getName());
            }
        }
        System.out.println(productNames);

    }
}
