package com.careerit.cj.day1;

import java.util.Scanner;

public class NumberBoxesRequired {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the item count   :");
        int itemCount = sc.nextInt();
        System.out.println("Enter the box capacity :");
        int boxCapacity = sc.nextInt();

        int requiredBoxCount = itemCount / boxCapacity;

        if (itemCount % boxCapacity != 0) {
            requiredBoxCount++;
        }
        System.out.println("Item count            :" + itemCount);
        System.out.println("Box Capacity          :" + boxCapacity);
        System.out.println("Required box count is :" + requiredBoxCount);

    }
}
