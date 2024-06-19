package com.shubham.Array;

public class RemoveElementsFromArray {
    public static void main(String[] args) {
        //[0,1,2,2,3,0,4,2], val = 2
        //int[] nums = {3,2,2,3};
        int[] nums = {4,5};
        int val = 4;
        System.out.println(removeElements(nums, val));
    }
    static int removeElements(int[] nums, int val){

        int start = 0;
        int end = nums.length - 1;
        while (start < end){
            if (nums[start] != val){
                start++;
            } else {
                if (nums[start] == nums[end]){
                    end--;
                } else {
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    end--;
                    start++;
                }
            }
        }
        if((start == end) && (val == nums[end])){
            return end;
        }
        return end + 1;
    }
}
