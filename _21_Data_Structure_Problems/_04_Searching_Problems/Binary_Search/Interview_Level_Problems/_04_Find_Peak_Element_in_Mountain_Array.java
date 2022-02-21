/*
Let's call an array arr a mountain if the following properties hold:
arr.length >= 3
There exists some i with 0 < i < arr.length - 1 such that:
arr[0] < arr[1] < ... arr[i-1] < arr[i]
arr[i] > arr[i+1] > ... > arr[arr.length - 1]
Given an integer array arr that is guaranteed to be a mountain,
return any i such that arr[0] < arr[1] < ... arr[i - 1] < arr[i] > arr[i + 1] > ... > arr[arr.length - 1].

Example 1:
Input: arr = [0,1,0]
Output: 1

Example 2:
Input: arr = [0,2,1,0]
Output: 1
 */
public class _04_Find_Peak_Element_in_Mountain_Array {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,4,3,2};
        System.out.println("Peak Element is at index: "+peakIndexInMountainArray(arr));
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
}
