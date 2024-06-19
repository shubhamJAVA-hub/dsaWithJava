package com.shubham.BasicMath;

public class FindSecondLargestNumber {

    public static int secondLargestNumber(int[] arr){
        if (arr == null || arr.length == 0){
            throw new IllegalArgumentException("Invalid Input");
        }
        int largest = FindLargestNumber.largestNumber(arr);
        System.out.println("Largest number in given array is: "+ largest);
        int secondLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > secondLargest && largest > arr[i]){
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }
    public static void main(String[] args) {
        int[] arr = {3,5,2,6,4,8,10};
        System.out.println("The second largest number in given array is: "+ secondLargestNumber(arr));
    }
}
