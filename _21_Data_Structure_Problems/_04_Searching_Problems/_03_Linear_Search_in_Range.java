public class _03_Linear_Search_in_Range {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        System.out.println(linearSearch1(arr, target, 1, 4));
    }

    static int linearSearch1(int[] arr, int target, int start, int end) {
        if(arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = start; index <= end; index++) {
            // check for element at every index if it is = target
            if(arr[index] == target) {
                return index;
            }
        }
        // If none of the above statement run
        return -1;
    }
}
