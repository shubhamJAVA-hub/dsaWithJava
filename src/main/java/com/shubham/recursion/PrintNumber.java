package com.shubham.recursion;

public class PrintNumber {
    public static void main(String[] args) {
        int N = 10;
        fun(1, N);
    }

    private static void fun(int cnt, int n) {
        if (cnt > n){
            return;
        }
        System.out.println(cnt);
        cnt++;
        fun(cnt, n);
    }
}
