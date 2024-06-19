package com.shubham.BasicMath;

public class MaxOfTwoNums {
    public static int findMaximumOfTwoNum(int num1, int num2){
        int max = 0;
        if(num1 > num2){
            max = num1;
        } else {
            max = num2;
        }
        return max;
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 29;
        System.out.println("Maximum of two number is: "+ findMaximumOfTwoNum(num1, num2));
    }
}
