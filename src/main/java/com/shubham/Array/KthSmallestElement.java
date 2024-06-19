package com.shubham.Array;

import java.util.PriorityQueue;

public class KthSmallestElement {

    public static int kthSmallest(int[] arr, int k) {
        // Create a max heap
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);

        for (int i = 0; i < arr.length; i++) {
            // add all element onto the max heap
            pq.offer(arr[i]);

            // If the size of the max heap is greater than k, remove the largest element from pq
            if (pq.size() > k){
                pq.poll();
            }

        }

        // Return top of the max heap
        return pq.peek();
    }

    public static void main(String[] args) {

        int[] arr = {5,6,2,7,9,10,40,20,34,65,11};
        int k = 3;

        System.out.println(k + " Smallest Element is: " + kthSmallest(arr, k));
    }
}
