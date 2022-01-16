/*
Given a 2D integer array matrix, return the transpose of matrix.
The transpose of a matrix is the matrix flipped over its main diagonal,
switching the matrix's row and column indices.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Example 2:
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
 */
import java.util.Arrays;
public class _20_Transpose_Matrix {
    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        System.out.println("Original Matrix :");
        for (int row = 0; row < matrix.length; row++) {
            System.out.println(Arrays.toString(matrix[row]));
        }
        System.out.println();
        System.out.println("Transpose Matrix :");
        for (int row = 0; row < transpose(matrix).length; row++) {
            System.out.println(Arrays.toString(transpose(matrix)[row]));
        }
    }

    static int[][] transpose(int[][] matrix) {
        int[][] arr = new int[matrix[0].length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                arr[col][row] = matrix[row][col];
            }
        }
        return arr;
    }
}
