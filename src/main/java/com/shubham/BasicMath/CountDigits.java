package com.shubham.BasicMath;

public class CountDigits {

    public static int countNum(int n){

        int cnt = 0;

        while (n > 0){
            int ld = n % 10;
            cnt ++;
            n = n / 10;
        }

        return cnt;
    }

    public static void main(String[] args) {
        int num = 7709;
        System.out.println(countNum(num));
    }
}
