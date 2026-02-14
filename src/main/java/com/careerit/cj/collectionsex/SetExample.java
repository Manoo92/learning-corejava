package com.careerit.cj.collectionsex;

import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

class Product{
    private int pid;
    private String name;
    private double price;

    public Product(int pid, String name, double price) {
        this.pid = pid;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pid=" + pid +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return pid == product.pid && Double.compare(price, product.price) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pid, name, price);
    }
}

public class SetExample {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        set.add(1001);
        set.add(1002);
        set.add(1001);
        set.add(1004);
        set.add(1002);
        System.out.println(set);

        Product p1 = new Product(1001,"iPhone16 Pro",125000);
        Product p2 = new Product(1002,"iPhone16 Pro Max",155000);
        Product p3 = new Product(1001,"iPhone17 Pro",125000);
        Product p4 = new Product(1002,"iPhone16 Pro Max",155000);
        Product p5 = new Product(1001,"iPhone17 Pro Max",185000);
        Product p6 = new Product(1001,"iPhone16 Pro",125000);

        Set<Product> products = new HashSet<>(List.of(p1,p2,p3,p4,p5,p6));

        System.out.println(products.size());




    }
}
