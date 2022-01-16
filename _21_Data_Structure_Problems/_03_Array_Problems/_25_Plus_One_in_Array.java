/*
You are given a large integer represented as an integer array digits,
where each digits[i] is the ith digit of the integer.
The digits are ordered from most significant to least significant in left-to-right order.
The large integer does not contain any leading 0's.

Example 1:
Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Increment the large integer by one and return the resulting array of digits.

Example 2:
Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */

import java.util.Arrays;
public class _25_Plus_One_in_Array {
    public static void main(String[] args) {
        int[] digits = {9};
        System.out.println("Original Array: "+Arrays.toString(digits));
        System.out.println("Added Array: "+Arrays.toString(plusOne(digits)));
    }
    static int[] plusOne(int[] digits) {
        int n = digits.length;
        // move along the input array starting from the end
        for (int i = n-1; i >= 0; i--) {
            // set all the nines at the end of array to zeros
            if (digits[i] == 9) {
                digits[i] = 0;
            }
            // here we have the rightmost not-nine, increase this rightmost not-nine by 1
            else {
                digits[i]++;
                return digits;
            }
        }
        // we're here because all the digits are nines
        digits = new int[n + 1];
        digits[0] = 1;
        return digits;
    }
}
