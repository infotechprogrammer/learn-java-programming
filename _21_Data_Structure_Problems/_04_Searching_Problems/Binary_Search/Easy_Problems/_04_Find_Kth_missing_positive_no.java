package com.Searching_Problems.Binary_Search.Easy_Problems;
/*
Given an array arr of positive integers sorted in a strictly increasing order, and an integer k.
Find the kth positive integer that is missing from this array.

Example 1:
Input: arr = [2,3,4,7,11], k = 5
Output: 9
Explanation: The missing positive integers are [1,5,6,8,9,10,12,13,...]. The 5th missing positive integer is 9.
 */
public class _04_Find_Kth_missing_positive_no {
    public static void main(String[] args) {
        int[] arr = {2,3,4,7,11};
        int k = 5;
        System.out.println(k+"th missing positive number is "+findKthPositive(arr,k));
    }
    static int findKthPositive(int[] arr, int k) {
        int start = 0, end =arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(arr[mid]-mid-1<k)
                start=mid+1;
            else
                end=mid-1;

        }
        return k+start;
    }
}
