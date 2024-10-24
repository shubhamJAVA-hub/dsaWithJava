package com.shubham.BasicMath;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 100;
        findPrimeNum(n);
    }

    private static void findPrimeNum(int n) {
        int i , j , cnt;
        boolean isPrime = true;
        for (i = 2; i <= n; i++) {
            cnt = 0;
            for (j = 2 ; j < i; j++) {
                if (i % j == 0) {
                    cnt++;
                    break;
                }
            }
            if (cnt == 0){
                if (isPrime){
                    System.out.println(i);
                }
                isPrime = !isPrime;// alternative prime
            }
        }

    }
}
