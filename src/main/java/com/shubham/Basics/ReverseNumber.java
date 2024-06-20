package com.shubham.Basics;

public class ReverseNumber {
    public static void main(String[] args) {
        int num = -1234;
        System.out.println("Reversed Number is: " + reverseNumber(num));
    }

    private static int reverseNumber(int num) {
        boolean flag = false;
        if (num < 0){
            num = num * (-1);
            flag = true;
        }
        int ans = 0;
        int temp = num;
        while(temp > 0){
            int ld = temp % 10;
            ans = ans * 10 + ld;
            temp = temp / 10;
        }
        if (flag == true){
            return -ans;
        }
        return ans;
    }
}
