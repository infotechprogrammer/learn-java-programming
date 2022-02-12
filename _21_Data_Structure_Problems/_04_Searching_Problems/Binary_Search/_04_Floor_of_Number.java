public class _04_Floor_of_Number {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 4;
        int ans = binarySearchFloor(arr, target);
        System.out.println("Floor of "+target+" = "+ans);
    }

    // return the floor element : greatest number <= target
    static int binarySearchFloor(int[] arr, int target) {
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
        return arr[end]; // If floor does not found means it is start
    }
}
