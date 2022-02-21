/*
Given a mountain array mountainArr,
return the minimum index such that mountainArr.get(index) == target.
If such an index does not exist, return -1.

Example 1:
Input: array = [1,2,3,4,5,3,1], target = 3
Output: 2
Explanation: 3 exists in the array, at index=2 and index=5. Return the minimum index, which is 2.

Example 2:
Input: array = [0,1,2,4,2,1], target = 3
Output: -1
Explanation: 3 does not exist in the array, so we return -1.
 */
public class _05_Search_in_Mountain_Array {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,3,1};
        int target = 3;
        System.out.println("Minimum index where "+target+" is present: "+search(array,target));
    }

    static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnosticBS(arr, target, 0, peak);
        if(firstTry != -1) {
            return firstTry;
        }
        // try to search in second half
        return orderAgnosticBS(arr, target, peak+1, arr.length - 1);
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid+1]) {
                // You are in decreasing part of an array
                // This may be the answer but look at left
                // This is why end != mid - 1
                end = mid;
            } else {
                // You are in ascending part of array
                start = mid + 1; //because we know that mid+1 element is greater than mid element
            }
        }
        // In the end start == end and pointing to the largest number because of the two checks above
        return start; // or end
    }

    static int orderAgnosticBS(int[] arr, int target, int start, int end) {
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
