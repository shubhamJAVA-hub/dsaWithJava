package com.shubham.Array;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        //[0,0,1,1,2,2,3,4,5,5,6,6,6,6,7], val = 2
        int[] nums = {0,0,1,1,2,2,3,4,5,5,6,6,6,6,7};
        //int[] nums = {4,4,5,5};

        System.out.println(removeDuplicates(nums));
    }
    static int removeDuplicates(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] != nums[j]) {
                nums[i + 1] = nums[j];
                i++;
            } else {
                j++;
            }
        }
        return i + 1;
    }
}
