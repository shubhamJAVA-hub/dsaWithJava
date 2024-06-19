package com.shubham.BasicMath;

public class FindLargestNumber {
    public static int largestNumber(int[] arr){
        if(arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,6,4,8,10};
        System.out.println("Largest number in an array is: "+ largestNumber(arr));
    }
}
