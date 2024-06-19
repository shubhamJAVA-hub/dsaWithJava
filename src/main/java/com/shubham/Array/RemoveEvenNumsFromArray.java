package com.shubham.Array;

public class RemoveEvenNumsFromArray {

    public static int[] removeEvens(int[] arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                count++;
            }
        }
        int[] oddArr = new int[count];
        int index = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 != 0){
                oddArr[index] = arr[i];
                index++;
            }
        }
        return oddArr;
    }



}
