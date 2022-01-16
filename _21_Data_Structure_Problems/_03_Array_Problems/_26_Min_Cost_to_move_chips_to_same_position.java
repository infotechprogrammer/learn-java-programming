/*
We have n chips, where the position of the ith chip is position[i].
We need to move all the chips to the same position.
In one step, we can change the position of the ith chip from position[i] to:
position[i] + 2 or position[i] - 2 with cost = 0.
position[i] + 1 or position[i] - 1 with cost = 1.
Return the minimum cost needed to move all the chips to the same position.

Example 1:
Input: position = [1,2,3]
Output: 1
Explanation: First step: Move the chip at position 3 to position 1 with cost = 0.
Second step: Move the chip at position 2 to position 1 with cost = 1.
Total cost is 1.

Example 2:
Input: position = [2,2,2,3,3]
Output: 2
Explanation: We can move the two chips at position  3 to position 2. Each move has cost = 1. The total cost = 2.

Example 3:
Input: position = [1,1000000000]
Output: 1

Problem Link: https://leetcode.com/problems/minimum-cost-to-move-chips-to-the-same-position/
 */
public class _26_Min_Cost_to_move_chips_to_same_position {
    public static void main(String[] args) {
        int[] position = {2,2,2,3,3};
        System.out.println("Minimum Cost = "+minCostToMoveChips(position));
    }
    static int minCostToMoveChips(int[] position) {
        int even = 0, odd = 0;
//    Using simple for loop
//    for(int p = 0; p < position.length; p++) {
//        if(position[p]%2==0) even++;
//            else odd++;
//        }
// Using enhanced for loop
        for(int p : position) {
            if(p%2==0) even++;
            else odd++;
        }
        return Math.min(even,odd);
    }
}
