/*
You are given an m x n integer grid accounts where accounts[i][j]
is the amount of money the i^th customer has in the j^th bank.
Return the wealth that the richest customer has.
Example:

Input: accounts = [[1,5],[7,3],[3,5]]
Output: 10
Explanation:
1st customer has wealth = 6
2nd customer has wealth = 10
3rd customer has wealth = 8
The 2nd customer is the richest with a wealth of 10.
 */
public class _09_Richest_Customer_Wealth {
    public static void main(String[] args) {
        int[][] acc = {{1,2,3},{4,2,1},{5,3,0},{3,4,5}};
        System.out.println(maximumWealth(acc));
    }
    static int maximumWealth(int[][] accounts) {
        int max = 0;
        for(int i = 0; i<accounts.length; i++) {
            int current = 0;
            for(int j = 0; j<accounts[i].length; j++) {
                current += accounts[i][j]; //or current = current + accounts[i][j];
            }
            if(current > max) { // If we not use if then below thing can be done
                max = current;  // or max = Math.max(max,current);
            }                   // From this speed of execution will be fast
        }
        return max;
    }
}
