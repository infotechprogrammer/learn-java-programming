/*
Given the array nums consisting of 2n elements in the form [x1,x2,...,xn,y1,y2,...,yn].
Return the array in the form [x1,y1,x2,y2,...,xn,yn].

Example 1:

Input: nums = [2,5,1,3,4,7], n = 3
Output: [2,3,5,4,1,7]
Explanation: Since x1=2, x2=5, x3=1, y1=3, y2=4, y3=7 then the answer is [2,3,5,4,1,7].
 */
import java.util.Arrays;
public class _10_Shuffle_the_Array {
    public static void main(String[] args) {
        int[] nums = {2,5,1,3,4,7};
        System.out.println("Original Array: "+Arrays.toString(nums));
        System.out.print("Shuffled Array: "+Arrays.toString(shuffle(nums,3)));
    }
    static int[] shuffle(int[] nums, int n) {
        int[] s_arr = new int[2*n];
        int j = 0;
        for (int i = 0; i < n; i++) {
                s_arr[j++] = nums[i];
                s_arr[j++] = nums[i+n];
        }
        return s_arr;
    }
}
