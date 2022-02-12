public class _03_Ceiling_of_Number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 20;
        int ans = binarySearchCeiling(arr, target);
        System.out.println("Ceiling of "+target+" = "+ans);
    }

    // return the ceiling element : smallest number >= target
    static int binarySearchCeiling(int[] arr, int target) {

        //but if target is greater than the greatest number
        if(target > arr[arr.length - 1]) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) /2; // or (start + end)/2;

            if(target < arr[mid]) {
                end = mid - 1;
            } else if(target > arr[mid]) {
                start = mid + 1;
            } else { // means target == mid
                return arr[mid];
            }
        }
        return arr[start]; // If ceiling does not found means it is start
    }
}
