package com.shubham.recursion;

public class PrintNumberInDescendingOrder {
    public static void main(String[] args) {
        int N = 10;
        fun(N);
    }

    private static void fun(int n) {
        if (n < 1){
            return;
        }
        System.out.println(n);
        n--;
        fun( n);
    }
}
