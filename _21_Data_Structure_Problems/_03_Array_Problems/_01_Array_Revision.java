import java.util.Arrays;
import java.util.Scanner;

public class _01_Array_Revision {
    public static void main(String[] args) {
        /*
         datatype[] variable_name = new datatype[size];
          int[] rnos1 = new int[5];
          int[] rnos2 = {23, 12, 45, 32, 15};
        */

        //array of primitive
        int[] arr = new int[5];
        arr[0] = 25;
        arr[1] = 225;
        arr[2] = 255;
        arr[3] = 2255;
        arr[4] = 22055;

        for(int i=0; i<arr.length; i++) {
            System.out.println("arr["+i+"] = "+arr[i]);
        }

        System.out.println(Arrays.toString(arr));
        Scanner in = new Scanner(System.in);
        int[] arr_in = new int[3];
        int val;
        for(int j=0; j<arr_in.length; j++) {
            val = j + 1;
            System.out.print("Enter value-"+val+" = ");
            arr_in[j] = in.nextInt();
        }
        for(int k=0; k<arr_in.length; k++) {
            System.out.println("arr["+k+"] = "+arr_in[k]);
        }

        // array of objects
        System.out.println("Enter 4 strings");
        String[] str = new String[4];
        for(int i=0; i<str.length; i++) {
            str[i] = in.next();
        }

        System.out.println(Arrays.toString(str));

        //Multi dimensional arrays

        int array[][] = new int[3][2];
//      Input of 2D array
        System.out.print("Enter values of 2D Array of size [3][2]: ");
        for(int row = 0; row < array.length; row++) {
            // for each col in every row
            for(int col = 0; col < array[row].length; col++) {
                array[row][col] = in.nextInt();
            }
        }
//      Output of 2D array
        for(int row = 0; row < array.length; row++) {
            // for each col in every row
            for(int col = 0; col < array[row].length; col++) {
                System.out.print(array[row][col] +" ");
            }
            System.out.println();
        }

//      Output of 2D array using Arrays.toString
        for(int row = 0; row < array.length; row++) {
            System.out.println(Arrays.toString(array[row]));
        }
//      Enhanced for loop
        for(int[] a: array) {
            System.out.println(Arrays.toString(a));
        }

        // Manually entered values
        int array2D[][] = {
                {1,2,3}, // 0th index
                {4,5}, // 1st index
                {6,7,8,9}// array2D[2] = {6,7,8,9}
        };
//      Output of that
        for (int row = 0; row < array2D.length; row++) {
            for (int col = 0; col < array2D[row].length; col++) {
                System.out.print(array2D[row][col]+" ");
            }
            System.out.println();
        }
        // Output using this method of Array to String
        for (int row = 0; row < array2D.length; row++) {
            System.out.println(Arrays.toString(array2D[row]));
        }
    }
}
