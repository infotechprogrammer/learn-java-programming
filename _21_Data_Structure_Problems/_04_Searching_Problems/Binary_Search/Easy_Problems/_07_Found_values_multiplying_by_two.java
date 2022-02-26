package com.Searching_Problems.Binary_Search.Easy_Problems;

/*
You are given an array of integers nums.
You are also given an integer original which is the first number that needs to be searched for in nums.
You then do the following steps:
If original is found in nums, multiply it by two (i.e., set original = 2 * original).
Otherwise, stop the process.
Repeat this process with the new number as long as you keep finding the number.
Return the final value of original.

Example 1:
Input: nums = [5,3,6,1,12], original = 3
Output: 24
Explanation:
- 3 is found in nums. 3 is multiplied by 2 to obtain 6.
- 6 is found in nums. 6 is multiplied by 2 to obtain 12.
- 12 is found in nums. 12 is multiplied by 2 to obtain 24.
- 24 is not found in nums. Thus, 24 is returned.
 */
import java.util.Arrays;
public class _07_Found_values_multiplying_by_two {
    public static void main(String[] args) {
        int[] arr = {5,3,6,1,12};
        int original = 3;
        System.out.println(findFinalValue(arr,original));
    }
    static int findFinalValue(int[] nums, int original) {
        Arrays.sort(nums);
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) /2; // or (start + end)/2;

            if(original < nums[mid]) {
                end = mid - 1;
            } else if(original > nums[mid]) {
                start = mid + 1;
            } else { // means target == mid
                original *= 2;
                start = mid + 1;
                end = nums.length - 1;
            }
        }
        return original;
    }
}
