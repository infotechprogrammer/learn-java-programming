public class _04_Max_Item {
    public static void main(String[] args) {
        int[] arr = {1,4,18,90,180,36,68,32};
        System.out.print("Maximum Value: "+max(arr));
        System.out.println();
        System.out.print("Maximum Value between indexes [1] and [3]: "+maxRange(arr,1,3));
    }
    static int max(int[] arr) {
        if(arr.length == 0){
            return -1;
        }
        int maxVal = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
    static int maxRange(int[] arr, int start, int end) {
        if(end < start) {
            return -1;
        }
        if(arr == null) {
            return -1;
        }
        int maxVal = arr[start];
        for (int i = start; i <= end; i++) {
            if(arr[i] > maxVal) {
                maxVal = arr[i];
            }
        }
        return maxVal;
    }
}
