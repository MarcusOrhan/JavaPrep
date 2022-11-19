package com.coba;

public class SwapNumbers {
    public static void main(String[] args) {
        int a = 5, b= 17;
        a = a^b^(b=a);
        System.out.println("a = " + a+ " b: "+ b);
    }
}
