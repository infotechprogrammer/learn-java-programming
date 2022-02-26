package com.Searching_Problems.Binary_Search.Easy_Problems;
/*
Given a sorted array of distinct integers and a target value, return the index if the target is found.
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.

Example 1:
Input: nums = [1,3,5,6], target = 5
Output: 2
 */
public class _05_Search_Insert_Position {
    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        int target = 7;
        System.out.println("Insert Position: "+searchInsert(arr,target));
    }
    static int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) /2; // or (start + end)/2;

            if(target < nums[mid]) {
                end = mid - 1;
            } else if(target > nums[mid]) {
                start = mid + 1;
            } else { // means target == mid
                return mid;
            }
        }
        return start; // If element does not exist
    }
}
