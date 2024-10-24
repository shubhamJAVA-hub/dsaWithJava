package com.shubham.recursion;

public class PrintName {
    public static void main(String[] args) {

        print(1);
    }

    private static void print(int cnt) {
        if (cnt > 5){
            return;
        }
        System.out.println(cnt + " - Shubham");
        cnt++;
        print(cnt);
    }


}
