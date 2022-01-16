import java.util.Arrays;
/*
Given an integer array nums of length n, you want to create an array ans of length 2n where
ans[i] == nums[i] and ans[i + n] == nums[i] for 0 <= i < n (0-indexed).

Example 1:

Input: nums = [1,2,1]
Output: [1,2,1,1,2,1]
Explanation: The array ans is formed as follows:
- ans = [nums[0],nums[1],nums[2],nums[0],nums[1],nums[2]]
- ans = [1,2,1,1,2,1]
 */
public class _07_Concatenation_of_Array {
    static int[] getConcatenation(int[] nums) {
        int ansLength = (nums.length) * 2;
        int[] ans = new int[ansLength];
        for(int i = 0; i<nums.length; i++) {
            ans[i] = nums[i];
            ans[i+nums.length] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println("Original Array: "+Arrays.toString(nums));
        System.out.println(nums.length);
        System.out.println("Concatenated Array: "+Arrays.toString(getConcatenation(nums)));
    }
}
