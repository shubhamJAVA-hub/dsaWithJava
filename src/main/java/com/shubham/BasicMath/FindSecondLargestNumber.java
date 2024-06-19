package com.shubham.BasicMath;

public class FindSecondLargestNumber {

    public static int secondLargestNumber(int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        int largest = FindLargestNumber.largestNumber(arr);
        int secondLargest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && largest > arr[i]){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
}
