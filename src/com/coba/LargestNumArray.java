package com.coba;

import java.util.Arrays;

public class LargestNumArray {
    public static void main(String[] args) {
        int [] arr = {5, 6, 76, 42, 13, 17, 1, };

        Arrays.sort(arr);
        System.out.println("arr[arr.length-1] = " + arr[arr.length-1]);
        for (int i=0; i<=arr.length-1;i++){
            System.out.println("arr[i] = " + arr[i]);
        }
    }
}
