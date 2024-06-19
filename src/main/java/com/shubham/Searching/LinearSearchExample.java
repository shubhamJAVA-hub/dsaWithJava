package com.shubham.Searching;

public class LinearSearchExample {
    public static void main(String[] args) {
        //int[] nums = {};
        //int[] nums = {11,2,4,33,65,23,15,12,43};
        int[] nums = {11,2,4,33,65,23,10,12,43};
        int target = 10;
        System.out.println(linearSearch(nums,target));

    }

    public static int linearSearch(int[] nums, int target){
        if (nums.length == 0){
            return  -1;
        }

        for (int ind = 0; ind < nums.length; ind++) {

            if (nums[ind] == target) {
                return ind;
            }
        }
        return -1;
    }
}
