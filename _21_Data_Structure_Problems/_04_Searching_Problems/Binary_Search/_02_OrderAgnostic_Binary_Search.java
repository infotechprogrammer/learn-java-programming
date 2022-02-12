public class _02_OrderAgnostic_Binary_Search {
    public static void main(String[] args) {
        int[] ascArr = {-6, -1, 0, 10, 11, 16, 24, 34, 46, 76, 89, 92};
        int[] descArr = {92, 81, 46, 24, 11, 0, -6, -12, -16};
        int target = -6;
        System.out.println("Element "+target+" in ascending ordered array is at index: "+orderAgnosticBS(ascArr, target));
        System.out.println("Element "+target+" in descending ordered array is at index: "+orderAgnosticBS(descArr, target));
    }

    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether array is sorted in ascending or descending
        boolean isAsc = arr[start] < arr[end];

        while(start <= end) {
            // find the middle element
            int mid = start + (end - start) /2; // or (start + end)/2;

            if(arr[mid] == target) {
                return mid;
            }

            // for ascending ordered array
            if(isAsc) {
                if(target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
            // for descending ordered array
            else {
                if(target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return -1; // If element does not exist
    }
}
