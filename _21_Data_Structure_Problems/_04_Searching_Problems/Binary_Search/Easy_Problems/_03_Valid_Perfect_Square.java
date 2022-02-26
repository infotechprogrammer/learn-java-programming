package com.Searching_Problems.Binary_Search.Easy_Problems;
/*
Given a positive integer num, write a function which returns True if num is a perfect square else False.
Follow up: Do not use any built-in library function such as sqrt.

Example 1:
Input: num = 16
Output: true
 */
import java.util.Scanner;
public class _03_Valid_Perfect_Square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number: ");
        int x = in.nextInt();
        System.out.println(isPerfectSquare(x));
    }
    static boolean isPerfectSquare(int num) {
        // use square root code
        if(num == 1) {
            return true;
        }
        int start = 0;
        int end = num;
        int ans = 0;
        while (start <= end) {
            long mid = start + (end - start)/2;
            if(mid*mid == num) {
                return true;
            }
            if(mid*mid < num) {
                ans = (int)mid;
                start = (int)mid + 1;
            } else {
                end = (int)mid -1;
            }
        }
        return false;
    }
}
