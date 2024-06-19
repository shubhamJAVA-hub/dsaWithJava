package com.shubham.Array;

import java.util.Arrays;

public class ReverseArray {
    public static int[] reverseArr(int[] arr){
        int l = 0;
        int r = arr.length-1;
        while(l < r){
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {11,3,8,5,12,56};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));
    }
}
