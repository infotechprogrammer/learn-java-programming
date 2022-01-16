/*
Given an n x n binary matrix image, flip the image horizontally, then invert it, and return the resulting image.
To flip an image horizontally means that each row of the image is reversed.

For example, flipping [1,1,0] horizontally results in [0,1,1].
To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0.
For example, inverting [0,1,1] results in [1,0,0].

Example 1:

Input: image = [[1,1,0],[1,0,1],[0,0,0]]
Output: [[1,0,0],[0,1,0],[1,1,1]]
Explanation: First reverse each row: [[0,1,1],[1,0,1],[0,0,0]].
Then, invert the image: [[1,0,0],[0,1,0],[1,1,1]]
 */
import java.util.Arrays;
public class _17_Flipping_an_array_Image {
    public static void main(String[] args) {
        int[][] image = {{1,1,0},{1,0,1}};
        System.out.println("Original Array:");
        for (int row = 0; row < image.length; row++) {
            System.out.println(Arrays.toString(image[row]));
        }
        System.out.println();

        System.out.println("Flipped Array:");
        for (int row = 0; row < flipArray(image).length; row++) {
            System.out.println(Arrays.toString(flipArray(image)[row]));
        }
        System.out.println();

        System.out.println("Inverted Array:");
        for (int row = 0; row < invertArray(image).length; row++) {
            System.out.println(Arrays.toString(invertArray(image)[row]));
        }
        System.out.println();

        System.out.println("Flipped + Inverted Array:");
        for (int row = 0; row < flipAndInvertImage(image).length; row++) {
            System.out.println(Arrays.toString(flipAndInvertImage(image)[row]));
        }
    }
    static  int[][] flipArray(int[][] image) {
        int[][] arr = new int[image.length][image[0].length];
        //Flipping Array
        for(int row = 0; row < image.length; row++) {
            for (int ncol = image[row].length-1, col = 0; ncol >= 0; ncol--,col++) {
                arr[row][col] = image[row][ncol];
            }
        }
        return arr;
    }

    static int[][] invertArray(int[][] image) {
        int[][] arr = new int[image.length][image[0].length];
        //Inverting Array
        for(int row = 0; row < image.length; row++) {
            for (int col = 0; col < image.length; col++) {
                arr[row][col] = image[row][col];
                if(arr[row][col] == 1) {
                    arr[row][col] = 0;
                } else {
                    arr[row][col] = 1;
                }
            }
        }
        return arr;
    }

    static int[][] flipAndInvertImage(int[][] image) {
        int[][] arr = new int[image.length][image[0].length];
        // Flipping and Inverting Together in less time
        for(int row = 0; row < image.length; row++) {
            for (int ncol = image[row].length-1, col = 0; ncol >= 0; ncol--,col++) {
                arr[row][col] = image[row][ncol];
                if(arr[row][col] == 1) {
                    arr[row][col] = 0;
                } else {
                    arr[row][col] = 1;
                }
            }
        }
        return arr;
    }
}
