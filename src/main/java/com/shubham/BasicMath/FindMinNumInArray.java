package com.shubham.BasicMath;

public class FindMinNumInArray {

    public static int findMin(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }


    public static void main(String[] args) {
        int[] arr = {3,5,2,6,4,8,10};
        System.out.println("Minimum Number of given array is: "+ findMin(arr));
    }
}
