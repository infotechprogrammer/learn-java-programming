import java.util.Arrays;

public class _04_Finding_Max_and_Min {
    public static void main(String[] args) {
        int[] arr = {20, 16, 2, 7, 25, 22, 60, 6};
        System.out.println("Minimum Element in "+ Arrays.toString(arr)+" = "+min(arr));
        System.out.println("Maximum Element in "+ Arrays.toString(arr)+" = "+max(arr));
    }
    // assume arr.length != 0
    // return the minimum value in the array
    static int min(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
    // return the maximum value in the array
    static int max(int[] arr) {
        int ans = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > ans) {
                ans = arr[i];
            }
        }
        return ans;
    }
}
