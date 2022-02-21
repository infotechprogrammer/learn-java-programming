// Find no of times array is rotated
public class _07_Rotated_Array_Count {
    public static void main(String[] args) {
        int[] arr = {5,6,7,0,1,2,3,4};
        int target = 1;
        System.out.println("No of rotations = "+countRotations(arr));
    }
    static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot + 1;
    }

    // this will not work for duplicate values
    static int findPivot(int[] arr) {
        int start = 0;
        int end =arr.length -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }
            if(arr[mid] <= arr[start]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    // it will work with duplicate elements array
    static int findPivotWithDuplicates(int[] arr) {
        int start = 0;
        int end =arr.length -1;
        while(start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if(mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if(mid > start && arr[mid] < arr[mid - 1]) {
                return mid-1;
            }

            //if elements at middle, start, end are equal then just skip the duplicates
            if(arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // skip the duplicates
                // NOTE: what if these elements at start and end were pivot??
                // check if start is pivot
                if(arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                // check whether end is pivot
                if(arr[end] < arr[end - 1]) {
                    return end;
                }
                end--;
            }
            // left side is sorted, so pivot should be in right
            else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid +1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }
}
