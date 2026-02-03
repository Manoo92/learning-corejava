package com.careerit.cj.day7;

import java.util.Arrays;
import java.util.Collections;

class Product{

    private String id;
    private String name;
    private double price;

    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class ProductManager {

    public static void main(String[] args) {
        String productData = "1001-iPhone16-120000,1001-iPhone16 pro-180000,1001-iPhone16 pro max-190000,1001-iPhone17-130000";

        String[] products = productData.split(",");

        Product[] productArr = new Product[products.length];
        int index = 0;
        for(String proData: products){
            String[] data = proData.split("-");
            Product product = new Product(data[0],data[1],Double.parseDouble(data[2]));
            productArr[index++] = product;
        }

        for(Product product: productArr){
            System.out.println(product);
        }

        String data = "cat";
        char[] arr = data.toCharArray();
        System.out.println(arr);
        Arrays.sort(arr);
        System.out.println(arr);

        int[] arr1 = {1,2,2,4,5};
        int[] arr2 = {1,2,3,4,5};
        System.out.println(Arrays.equals(arr1, arr2));
    }

    public static boolean isAnagram(String str1, String str2){
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }
}
