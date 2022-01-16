import java.util.Arrays;

public class _05_Reverse_and_Swap_Array {
    public static void main(String[] args) {
        int[] arr = {1,3,23,9,18};
        System.out.println("Original Array: "+Arrays.toString(arr));
        swap(arr, 1, 3);
        System.out.println("Swapped Array [1][3]: "+Arrays.toString(arr));
        reverse(arr);
        System.out.println("Reverse above Array: "+Arrays.toString(arr));
    }
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length-1;

        while(start < end) {
            //swap
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    static void swap(int [] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
