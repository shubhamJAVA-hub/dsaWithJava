package com.shubham.BasicMath;

public class MaxOfTwoNums {
    public static int maxi(int num1, int num2){
        int max = 0;
        if(num1 > num2){
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }
}
