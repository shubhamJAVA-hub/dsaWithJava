package com.shubham.BasicMath;

public class FindSumOfANumber {

    public static int findSum(int num){
        int sum = 0;
        while(num > 0){
            int ld = num % 10;
            sum = sum + ld;
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        int num = 1234;
        System.out.println("Sum of each digit of a number is: " + findSum(num));
    }
}
