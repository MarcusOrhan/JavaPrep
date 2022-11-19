package com.coba;

public class Palindrome {
    public static void main(String[] args) {
        String str = "Palindrome";
        isPalindrome(str);
    }


public static boolean isPalindrome(String str) {
        if (str == null)
            return false;
            StringBuilder sb = new StringBuilder(str);
            return sb.reverse().toString().equals(str);
}
}
