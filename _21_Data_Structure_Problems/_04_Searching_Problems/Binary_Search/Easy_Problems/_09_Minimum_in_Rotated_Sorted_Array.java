package com.Searching_Problems.Binary_Search.Easy_Problems;
/*
Given the sorted rotated array nums of unique elements, return the minimum element of this array.
You must write an algorithm that runs in O(log n) time.

Example 1:
Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.
 */
public class _09_Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(findMin(arr));
    }
    static int findMin(int[] nums) {
        int start = 0;
        int end =nums.length -1;
        int mid = 0;
        while(start <= end) {
            mid = start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && nums[mid] > nums[mid + 1]) {
                return nums[mid + 1];
            }
            if(mid > start && nums[mid] < nums[mid - 1]) {
                return nums[mid];
            }
            if(nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return nums[0];
    }
}
