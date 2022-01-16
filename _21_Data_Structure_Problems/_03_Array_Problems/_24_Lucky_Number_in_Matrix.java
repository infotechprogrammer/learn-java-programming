/*
Given an m x n matrix of distinct numbers, return all lucky numbers in the matrix in any order.
A lucky number is an element of the matrix such that it is the minimum element in its row and maximum in its column.

Example 1:
Input: matrix = [[3,7,8],[9,11,13],[15,16,17]]
Output: [15]
Explanation: 15 is the only lucky number since it is the minimum in its row and the maximum in its column.

Example 2:
Input: matrix = [[1,10,4,2],[9,3,8,7],[15,16,17,12]]
Output: [12]
Explanation: 12 is the only lucky number since it is the minimum in its row and the maximum in its column.
 */
import java.util.ArrayList;
public class _24_Lucky_Number_in_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,10,4,2},{9,3,8,7},{15,16,17,12}};
        System.out.println("Lucky Number = "+luckyNumber(matrix));
    }
    static ArrayList<Integer> luckyNumber (int[][] matrix) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int minElement = matrix[i][0];
            int minIndex = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                if(matrix[i][j]<minElement) {
                    minElement = matrix[i][j];
                    minIndex = j;
                }
            }
            int maxElement = minElement;
            for (int k = 0; k < matrix.length; k++) {
                if(matrix[k][minIndex] >= maxElement) {
                    maxElement = matrix[k][minIndex];
                }
            }
            if(minElement == maxElement) {
                list.add(minElement);
            }
        }
        return list;
    }
}
