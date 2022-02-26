package com.Searching_Problems.Binary_Search.Easy_Problems;
/*
Given a 1-indexed(array whose index start from 1) array of
integers numbers that is already sorted in non-decreasing order,
find two numbers such that they add up to a specific target number.
Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
Return the indices of the two numbers, index1 and index2,
added by one as an integer array [index1, index2] of length 2.
The tests are generated such that there is exactly one solution. You may not use the same element twice.
Your solution must use only constant extra space.

Example 1:
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2].
 */
import java.util.Arrays;
public class _02_Two_Sum_Sorted_Array {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 22;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    static int[] twoSum(int[] numbers, int target) {
        int start=0;
        int end = numbers.length-1;
        int mid = -1;
        while(start<end){
            if(numbers[start]+numbers[end]==target){
                return new int[] {start+1, end+1};
            }
            else if(numbers[start]+numbers[end]<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[] {-1,-1};
    }
}
