package com.Searching_Problems.Binary_Search.Easy_Problems;

/*
Given a non-negative integer x, compute and return the square root of x.
Since the return type is an integer, the decimal digits are truncated,
and only the integer part of the result is returned.
Note: You are not allowed to use any built-in exponent function or operator,
such as pow(x, 0.5) or x ** 0.5.

Example 1:
Input: x = 4
Output: 2
 */
import java.util.Scanner;
public class _01_Square_Root_of_Number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = in.nextInt();
        System.out.println("Square root of "+x+" = "+mySqrt(x));
    }
    static int mySqrt(int x) {
        if(x == 1) {
            return 1;
        }
        int start = 0;
        int end = x;
        int ans = 0;
        while (start <= end) {
            long mid = start + (end - start)/2;
            if(mid*mid == x) {
                return (int)mid;
            }
            if(mid*mid < x) {
                ans = (int)mid;
                start = (int)mid + 1;
            } else {
                end = (int)mid -1;
            }
        }
        return ans;
    }
}
