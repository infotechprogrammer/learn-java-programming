public class _03_Binary_Search_in_Infinite_Array {
    public static void main(String[] args) {
        int[] arr = {3,5,7,8,9,10,18,90,80,100,120,130,145,160,170,320,502,830};
        int target = 145;
        System.out.println(answer(arr, target));
    }
    static int answer(int[] arr, int target) {
        // first find the range
        // first start with a box of size 2
        int start = 0;
        int end = 1;

        //condition for the target to lie in the range
        while (target > arr[end]) {
            int newStart = end + 1;
            //double the box value
            // end = previous end + size of box*2
            end = end + (end - start + 1) * 2;
            start = newStart;
        }
        return binarySearch(arr, target, start, end);
    }
    static int binarySearch(int[] arr, int target, int start, int end) {
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
