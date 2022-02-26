package com.Searching_Problems.Binary_Search.Easy_Problems;
/*
Given an array arr of integers, check if there exists two integers
N and M such that N is the double of M ( i.e. N = 2 * M).
More formally check if there exists two indices i and j such that :
i != j
0 <= i, j < arr.length
arr[i] == 2 * arr[j]

Example 1:
Input: arr = [10,2,5,3]
Output: true
Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5.
 */
import java.util.Arrays;
public class _06_Check_if_N_and_its_double_exists {
    public static void main(String[] args) {
        int[] arr = {10,2,5,3};
        System.out.println(checkIfExist(arr));
    }
    static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        int result;
        for (int i = 0; i < arr.length; i++) {
            result = binarySearch(arr, arr[i]*2);
            if(result != i && result !=-1) {
                return true;
            }
        }
        return false;
    }
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) /2; // or (start + end)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else { // means target == mid
                return mid;
            }
        }
        return -1; // If element does not exist
    }
}
