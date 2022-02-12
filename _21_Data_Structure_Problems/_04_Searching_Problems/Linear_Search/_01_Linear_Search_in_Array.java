//Array of elements is given, we have to apply binary search to search target element
public class _01_Linear_Search_in_Array {
    public static void main(String[] args) {
        int[] nums = {5,19,23,45,1,2,3,7,8,45};
        int target = 45;

        System.out.println("Number "+target+" is array index:"+linearSearch1(nums, target));
        System.out.println(linearSearch2(nums, target));
        System.out.println(linearSearch3(nums, target));
    }

    //Search the target and return true if found else false
    static boolean linearSearch3(int[] arr, int target) {
        if (arr.length == 0) {
            return false;
        }
        // run a for loop
        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return true;
            }
        }
        // If none of the above statement run
        return false;
    }

    //Search the target and return element
    static int linearSearch2(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int element : arr) {
            // check for element at every index if it is = target
            if (element == target) {
                return element;
            }
        }
        // If none of the above statement run
        return Integer.MAX_VALUE;
    }

    // Search in the array: return index if item found else return -1
    static int linearSearch1(int[] arr, int target) {
        if(arr.length == 0) {
            return -1;
        }
        // run a for loop
        for (int index = 0; index < arr.length; index++) {
            // check for element at every index if it is = target
            if(arr[index] == target) {
                return index;
            }
        }
        // If none of the above statement run
        return -1;
    }
}

