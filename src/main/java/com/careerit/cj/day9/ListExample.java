package com.careerit.cj.day9;

import java.util.Arrays;


class DynamicArray {

    int[] arr;
    int size;

    DynamicArray() {
        arr = new int[2];
    }

    public void add(int num) {
        if (size == arr.length) {
            int[] temp = new int[arr.length * 2];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[size++] = num;

    }

    public void display() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

public class ListExample {

    public static void main(String[] args) {

        DynamicArray da = new DynamicArray();
        da.add(10);
        da.add(20);
        da.add(30);
        da.add(40);
        da.add(50);
        da.add(60);
        da.display();
        System.out.println();

        da.add(80);
        da.display();


        int[] arr1 = new int[]{1,2,3,4,5};
        int[] arr2 = new int[]{4,5,6,7,8,9,10};

        int[] arr3 = new int[arr1.length + arr2.length];
        System.out.println();
        System.arraycopy(arr1,0,arr3, 0, arr1.length);
        System.arraycopy(arr2,0, arr3, arr1.length, arr2.length);
        System.out.println(Arrays.toString(arr3));

    }
}
