/*
Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and
all the elements on the secondary diagonal that are not part of the primary diagonal.

Example 1:

Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
 */
public class _18_Matrix_Diagonal_Sum {
    public static void main(String[] args) {
        int[][] mat = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("Sum of Matrix Diagonal = "+diagonalSum(mat));
    }
    static int diagonalSum(int[][] mat) {
        int l = mat.length-1;
        int firstDiag = 0, secondDiag = 0;
        for (int i = 0; i < mat.length; i++,l--) {
            firstDiag += mat[i][i];
            if(i != l){
                secondDiag += mat[i][l];
            }
        }
        return  firstDiag+secondDiag;
    }
}
