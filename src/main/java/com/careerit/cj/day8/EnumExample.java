package com.careerit.cj.day8;

enum ShirtSize {
    S(36), M(38), L(40), XL(42), XXL(44);
    final int size;

    ShirtSize(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }
}

public class EnumExample {

    public static void main(String[] args) {

        ShirtSize[] shirtSizes = ShirtSize.values();
        for(ShirtSize ele: shirtSizes){
            System.out.println(ele.name() + " - " + ele.getSize());
        }
    }
}
