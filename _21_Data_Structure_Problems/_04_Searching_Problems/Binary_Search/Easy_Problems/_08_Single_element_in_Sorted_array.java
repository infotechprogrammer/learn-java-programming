package com.Searching_Problems.Binary_Search.Easy_Problems;
/*
You are given a sorted array consisting of only integers where every element appears exactly twice,
except for one element which appears exactly once.
Return the single element that appears only once.
Your solution must run in O(log n) time and O(1) space.

Example 1:
Input: nums = [1,1,2,3,3,4,4,8,8]
Output: 2
 */
public class _08_Single_element_in_Sorted_array {
    public static void main(String[] args) {
        int[] arr = {1,1,2,3,3,4,4,8,8};
        System.out.println("Single element in sorted array is "+singleNonDuplicate(arr));
    }
    static int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n-1;
        while (start<=end) {
            int mid = start+(end-start)/2;
            if (mid%2 == 0) {
                if (mid>0 && (nums[mid-1]==nums[mid])) { end = mid-1; }
                else { start = mid+1; }
            } else {
                if (mid>0 && (nums[mid-1]==nums[mid])) { start = mid+1; }
                else { end = mid-1; }
            }
        }
        return nums[start-1];
    }
}