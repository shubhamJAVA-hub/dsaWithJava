package com.shubham.Array;

import java.util.Arrays;

public class SortTheArrayOf012 {
    // 2nd approach
    private static int[] sort123(int[] a){
        int l = 0;
        int m = 0;
        int h = a.length-1;

        while(m <= h){
            if(a[m] == 0){
                int temp = a[m];
                a[m] = a[l];
                a[l] = temp;
                l++;
                m++;
            } else if(a[m] == 1){
                m++;
            } else if(a[m] == 2){
                int temp = a[m];
                a[m] = a[h];
                a[h] = temp;
                h--;
            }
        }
        return a;
    }
    //1st approach
    private static int[] doSort(int[] arr) {
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                cnt0++;
            }
            if (arr[i] == 1) {
                cnt1++;
            }
            if (arr[i] == 2) {
                cnt2++;
            }
        }
        int idx = 0;
        for (int i = 0; i < cnt0; i++) {
            arr[idx] = 0;
            idx++;
        }

        for (int i = idx; i < cnt0+cnt1; i++) {
            arr[idx] = 1;
            idx++;
        }

        for (int i = idx; i < arr.length; i++) {
            arr[idx] = 2;
            idx++;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,0,0,2,0,1,2,1,0};
        System.out.println(Arrays.toString(doSort(arr)));
        System.out.println();
        System.out.println(Arrays.toString(sort123(arr)));
    }


}
