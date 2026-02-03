package com.careerit.cj.day8;


public class ProductManager {

    public static void main(String[] args) {

        Product[] products = getProducts();

        for(Product product: products){
            product.setPrice(-1000);
            System.out.println(product.getName());
        }

    }

    private static Product[] getProducts(){
        Product[] products = new Product[5];
        products[0]= new Product("iPhone 16 Pro",150000,2);
        products[1]= new Product("iPhone 16",120000,3);
        products[2]= new Product("iPhone 15 Pro",100000,4);
        products[3]= new Product("iPhone 15",80000,5);
        products[4]= new Product("iPhone 14",60000,6);
        return products;
    }
}