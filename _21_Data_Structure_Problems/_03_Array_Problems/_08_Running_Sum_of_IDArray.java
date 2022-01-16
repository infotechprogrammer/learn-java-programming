/*
Given an array nums. We define a running sum of an array as runningSum[i] = sum(nums[0]…nums[i]).
Example 1:

Input: nums = [1,2,3,4]
Output: [1,3,6,10]
Explanation: Running sum is obtained as follows: [1, 1+2, 1+2+3, 1+2+3+4].
 */
import java.util.Arrays;

public class _08_Running_Sum_of_IDArray {
    static int[] runningSum(int[] nums) {
        int[] sum = new int[nums.length];
        int tsum = 0;
        for(int i = 0; i<nums.length; i++) {
            tsum = tsum + nums[i];
            sum[i] = tsum;
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {0,2,1,5,3,4};
        System.out.println("Original Array: "+ Arrays.toString(nums));
        System.out.println("Running Sum: "+Arrays.toString(runningSum(nums)));
    }
}
