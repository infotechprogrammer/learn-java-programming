import java.util.ArrayList;

/*
There are n kids with candies. You are given an integer array candies,
where each candies[i] represents the number of candies the ith kid has,
and an integer extraCandies, denoting the number of extra candies that you have.

Return a boolean array result of length n, where result[i] is true if,
after giving the ith kid all the extraCandies,
they will have the greatest number of candies among all the kids,
or false otherwise. Note that multiple kids can have the greatest number of candies.
Example 1:

Input: candies = [2,3,5,1,3], extraCandies = 3
Output: [true,true,true,false,true]

Explanation: If you give all extraCandies to:
- Kid 1, they will have 2 + 3 = 5 candies, which is the greatest among the kids.
- Kid 2, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
- Kid 3, they will have 5 + 3 = 8 candies, which is the greatest among the kids.
- Kid 4, they will have 1 + 3 = 4 candies, which is not the greatest among the kids.
- Kid 5, they will have 3 + 3 = 6 candies, which is the greatest among the kids.
 */

//LOGIC: Find the max of candies, then traverse to check if each candy[i] + extraCandies >= max

public class _11_Kids_with_Greatest_No_of_Candies {
    public static void main(String[] args) {
        int[] candies = {2,3,5,1,4};
        System.out.println(kidsWithCandies(candies,3));
    }
    static ArrayList<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Integer.MIN_VALUE;
        for(int i=0; i<candies.length; i++) {
            max = Math.max(candies[i], max);
        }
        ArrayList<Boolean> list = new ArrayList<>(candies.length);
//        for(int j=0; j<candies.length; j++) {
//            if(extraCandies + candies[j] >= max) {
//                list.add(true);
//            } else {
//                list.add(false);
//            }
//        } //or
        for(int j=0; j<candies.length; j++) {
            list.add(extraCandies + candies[j] >= max);
        }
        return list;
    }
}
