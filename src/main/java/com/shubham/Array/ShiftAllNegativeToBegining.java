package com.shubham.Array;

import java.util.Arrays;

public class ShiftAllNegativeToBegining {
    private static int[] shiftAllNegativeToBegin(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > 0){
            } else if (arr[i] < 0){
                i++;
            } else if ((arr[i] > 0) && (arr[j] < 0)) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        //int[] arr = {-12, 11, -13, -5, 6, -7, 5, -3, -6};
        int[] arr = { 1, 2,  -4, -5, 2, -7, 3, 2, -6, -8, -9, 3, 2, 1};
        System.out.println(Arrays.toString(shiftAllNegativeToBegin(arr)));
    }
}
