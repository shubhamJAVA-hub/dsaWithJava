package com.shubham.recursion;

public class FactorialProblem {

    static int fact(int n){
        if (n == 0){
            return 1;
        }
        return n * fact(n-1);
    }


    public static void main(String[] args) {
        int num = 12;
        System.out.println(fact(num));
    }
}
