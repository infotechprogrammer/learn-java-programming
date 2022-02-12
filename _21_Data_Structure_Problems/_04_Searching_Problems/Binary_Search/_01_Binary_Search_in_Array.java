//Array is sorted we have to apply binary search to search target element
public class _01_Binary_Search_in_Array {
    public static void main(String[] args) {
        int[] arr = {-6, -1, 0, 10, 11, 16, 24, 34, 46, 76, 89, 92};
        int target = 24;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }

    // return the index
    // return - if it does not exist
    static int binarySearch(int[] arr, int target) {
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
                return mid;
            }
        }
        return -1; // If element does not exist
    }
}
