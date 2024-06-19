package com.shubham.BasicMath;

public class FindMaxAndMinInArray {
    public static void main(String[] args) {
        int[] arr = {5,3,6,9,10,2,7,20,15,12};
        findMaxAndMin(arr);
    }

    private static void findMaxAndMin(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = arr[i];
            }
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.println("Maximum element is: " + max);
        System.out.println("Minimum element is: " + min);
    }
}
