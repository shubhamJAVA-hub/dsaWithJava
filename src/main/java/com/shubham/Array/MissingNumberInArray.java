package com.shubham.Array;

public class MissingNumberInArray {
    private static int findMissingElement(int[] arr, int n) {
        //find sum of the n natural number
        int sumN = n * (n + 1) / 2;
        // and subtract all the element of array to sumN
        for (int i = 0; i < arr.length; i++) {
            sumN = sumN - arr[i];
        }
        return sumN;
    }
    public static void main(String[] args) {
        int n = 8;
        int[] arr = {1,8,5,4,3,7,2};
        System.out.println(findMissingElement(arr, n));
    }
}
