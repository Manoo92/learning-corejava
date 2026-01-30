package com.careerit.cj.day6;

public class ArrayExample1 {

    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;
        /*for(int ele : arr){
            sum += ele;
        }*/

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }


        System.out.println(sum);

        for(int i = arr.length - 1 ; i >= 0; i--){
            System.out.println(arr[i]);
        }

    }
}
