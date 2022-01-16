/*
Given an array nums of integers, return how many of them contain an even number of digits.
Example 1:
Input: nums = [12,345,2,6,7896]
Output: 2

Example 2:
Input: nums = [555,901,482,1771]
Output: 1
 */
public class _19_Find_Even_No_of_Digits {
    public static void main(String[] args) {
        int nums[] = {12,345,2,6,7896};
        System.out.println("Even Number of digits = "+findNumbers(nums));
    }
    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if(even(num)) {
                count++;
            }
        }
//        for(int i =0;i<nums.length;i++){
//            if((String.valueOf(nums[i]).length())%2==0)
//                count++;
//        }
        return count;
    }

    static boolean even(int num) {
        int numberofDigits = digits2(num);
        return (numberofDigits % 2 == 0);
    }

    static int digits(int num) {
        if(num < 0) {
            num = num * -1;
        }

        if(num == 0) {
            return 1;
        }

        int count = 0;
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
    static int digits2(int num) {
        if(num < 0) {
            num = num * -1;
        }

        if(num == 0) {
            return 1;
        }
        return (int)(Math.log10(num) + 1);
    }
}
