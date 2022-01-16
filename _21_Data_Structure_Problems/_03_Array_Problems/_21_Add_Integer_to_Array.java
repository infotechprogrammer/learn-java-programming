/*
The array-form of an integer num is an array representing its digits in left to right order.
For example, for num = 1321, the array form is [1,3,2,1].
Given num, the array-form of an integer, and an integer k, return the array-form of the integer num + k.

Example 1:
Input: num = [1,2,0,0], k = 34
Output: [1,2,3,4]
Explanation: 1200 + 34 = 1234

Example 2:
Input: num = [2,7,4], k = 181
Output: [4,5,5]
Explanation: 274 + 181 = 455
 */
import java.util.*;
public class _21_Add_Integer_to_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] nums = {1,2,0,0};
        System.out.print("Original Array: "+ Arrays.toString(nums));
        System.out.println();
        System.out.print("Enter number you want to add: ");
        int num = in.nextInt();
        System.out.println();
        System.out.println("Array after Addition = "+addToArrayForm(nums,num));
    }
    static ArrayList<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = num.length-1; i>=0 || k>0; i--) {
            if(i>=0) {
                list.add((num[i]+k)%10);
                k=(num[i]+k)/10;
            } else {
                list.add(k%10);
                k/=10;
            }
        }
        Collections.reverse(list);
        return list;
    }
}
