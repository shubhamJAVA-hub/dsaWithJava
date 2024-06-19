package com.shubham.BasicMath;

public class FindMinNumInArray {

    public static int findMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] < arr[i+1]){
                min = arr[i];
            } else {
                min = arr[i+1];
            }
        }

        return min;
    }

    public static int findMin2(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }
}
