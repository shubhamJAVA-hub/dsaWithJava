package com.shubham.binarySearch;

public class FindTheElement {

    private static int search(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        while (s <= e){
            int mid = s + (e - s) / 2;//7
            if (target < nums[mid]){ //10 < 38
                e = mid - 1;
            } else if (target > nums[mid]) {
                s = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,5,7,10,29,30,38,46,47,59,77,89,101,110};
        int target = 10;
        System.out.println(search(nums, target));
    }


}
