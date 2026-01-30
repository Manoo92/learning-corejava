package com.careerit.cj.day6;

import java.util.Arrays;

public class ProductManager {
    public static void main(String[] args) {

        Product[] products = getProducts();
        // Show all product details

        for (Product p : products) {
            System.out.println(p);
        }

        // Get max priced product
        System.out.println(Arrays.toString(maxPricedProducts(products)));

    }

    private static Product[] maxPricedProducts(Product[] products){
        int count = 0;
        double maxPrice = maxPrice(products);
        for(Product product: products){
            if(maxPrice == product.getPrice()){
                count++;
            }
        }
        Product[] arr = new Product[count];
        int index = 0;
        for(Product product: products){
            if(maxPrice == product.getPrice()){
                arr[index++] = product;
            }
        }
        return arr;
    }



    private static double maxPrice(Product[] products) {
        double maxPrice = products[0].getPrice();
        for (int i = 1; i < products.length; i++) {
            if(maxPrice < products[i].getPrice()){
                maxPrice = products[i].getPrice();
            }
        }
        return maxPrice;
    }


    public static Product[] getProducts() {
        Product p1 = new Product("iPhone16", 120000);
        Product p2 = new Product("iPhone17", 130000);
        Product p3 = new Product("iPhone18", 140000);
        Product p4 = new Product("iPhone19 pro max", 190000);
        Product p5 = new Product("iPhone20", 160000);
        Product p6 = new Product("iPhone21 pro Max", 190000);
        return new Product[]{p1, p2, p3, p4, p5, p6};
    }
}
