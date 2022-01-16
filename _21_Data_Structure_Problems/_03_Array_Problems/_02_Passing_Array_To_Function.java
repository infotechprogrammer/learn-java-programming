import java.util.Arrays;

public class _02_Passing_Array_To_Function {
    public static void main(String[] args) {
        int[] nums = {3,4,5,6};
        System.out.print("Value of original array: ");
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.print("Value changed at array index [0]: ");
        System.out.print(Arrays.toString(nums));

        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] arr) {
        arr[0] = 99;
    }
}
