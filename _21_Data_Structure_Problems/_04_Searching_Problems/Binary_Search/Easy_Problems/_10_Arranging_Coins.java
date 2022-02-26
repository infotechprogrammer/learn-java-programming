package com.Searching_Problems.Binary_Search.Easy_Problems;
/*
You have n coins and you want to build a staircase with these coins.
The staircase consists of k rows where the ith row has exactly i coins.
The last row of the staircase may be incomplete.
Given the integer n, return the number of complete rows of the staircase you will build.

Problem Link: https://leetcode.com/problems/arranging-coins/
(Understand problem by watching images in examples)

Example 1:
Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

Example 2:
Input: n = 8
Output: 3
Explanation: Because the 4th row is incomplete, we return 3.
 */
public class _10_Arranging_Coins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(5));
    }
    static int arrangeCoins(int n) {
        long start = 1;
        long end = n;
        long mid = 0;
        while(start<=end) {
            mid = start + (end-start)/2;
            if((mid*(mid+1))/2==n) {
                return (int)mid;
            } else if((mid*(mid+1))/2<n) {
                start = mid + 1;
            } else if((mid*(mid+1))/2>n) {
                end = mid - 1;
            }
        }
        return (int)end;
    }
}
