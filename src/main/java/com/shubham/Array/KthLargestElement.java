package com.shubham.Array;

import java.util.PriorityQueue;

public class KthLargestElement {

    public static int kthLargest(int arr[], int k)
    {
        // Create a min heap
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        for (int i = 0; i < arr.length; ++i) {

            // add all elements into the min heap
            pq.add(arr[i]);

            // If size of the priority queue exceeds k, remove the top(min) elements from the pq
            if (pq.size() > k) {
                pq.poll();
            }
        }
        //return the top element
        return pq.peek();
    }

    public static void main(String[] args)
    {
        int[] arr = {5,6,2,7,9,10,40,20,34,65,11};
        int k = 3;
        System.out.print(k + " largest element is : " + kthLargest(arr, k));

    }
}
