/*
Given an integer n, return any array containing n unique integers such that they add up to 0.

Example 1:
Input: n = 5
Output: [-7,-1,1,3,4]
Explanation: These arrays also are accepted [-5,-1,1,2,3] , [-3,-1,2,-2,4] , [1,2,3,4,-10].

Example 2:
Input: n = 3
Output: [-1,0,1]
 */
import java.util.Arrays;
import java.util.Scanner;

public class _23_N_Unique_Integers_Sum_up_to_Zero {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter value of n: ");
        int n = in.nextInt();
        System.out.println("Array: "+ Arrays.toString(sumZero(n))+" of size"+n+" will give sum = 0");
    }
    static int[] sumZero(int n) {
        int sum = 0;
        int[] ans = new int[n];
        for (int i=0; i<n-1; i++) {
            sum += ans[i] = i + 1;
        }
        ans[n-1] = -sum;
        return ans;
    }
}
