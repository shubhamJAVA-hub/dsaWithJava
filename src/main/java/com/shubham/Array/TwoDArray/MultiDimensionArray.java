package com.shubham.Array.TwoDArray;

import java.util.Arrays;

public class MultiDimensionArray {
    public static void main(String[] args) {

        String [][] strArr = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"},
                {"10", "11","12"}
        };
        for (int i = 0; i < strArr.length; i++) {
            System.out.println(Arrays.toString(strArr[i]));
        }
        System.out.println();
        int [][] arr = {
                {1,2,3,3,3,3},
                {4,5,6,4,5,5},
                {1,2,3,3,3,3},
                {4,5,6,4,5,5}

        };
        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }
}
