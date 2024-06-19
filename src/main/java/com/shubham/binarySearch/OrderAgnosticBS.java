package com.shubham.binarySearch;

public class OrderAgnosticBS {
    private static int search(int[] nums, int target) {

        int s = 0;
        int e = nums.length - 1;
        boolean isAsc = nums[s] < nums[e];

        while (s <= e){
            int mid = s + (e - s) / 2;
             if (nums[mid] == target){
                 return mid;
             } else if (isAsc){
                 if (target < nums[mid]){
                     e = mid - 1;
                 } else {
                     s = mid + 1;
                 }
             } else {
                 if (target > nums[mid]){
                     e = mid - 1;
                 } else {
                     s = mid + 1;
                 }
             }


        }
        return -1;
    }

    public static void main(String[] args) {
        //int[] nums = {2,3,5,7,10,29,30,38,46,47,59,77,89,101,110};
        int[] nums = {110, 101, 99, 89, 78, 66, 55, 34,23,14,12,8,4,2,1};
        int target = 4;
        System.out.println(search(nums, target));
    }
}
