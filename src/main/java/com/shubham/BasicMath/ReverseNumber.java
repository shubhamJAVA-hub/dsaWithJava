package com.shubham.BasicMath;

public class ReverseNumber {
    public static int reverseNumber(int n){
        boolean flag = false;
        if (n < 0){
            n = n * (-1);
            flag = true;
        }
        int res = 0;
        while (n > 0){
            int ld = n % 10;
            res = res * 10 + ld;
            n = n / 10;
        }
        if (flag == true){
            return res * -1;
        } else {
            return res;
        }

    }
    public static void main(String[] args) {
        int num = 7700;
        System.out.println(reverseNumber(num));
    }
}
