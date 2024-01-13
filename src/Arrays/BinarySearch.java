package Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int [] arr= {1,2,3,4,5};
        int target = 4;
        int ans = BinarySearch(arr, target);
        if (ans == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Element found at index "+ans);
        }
    }

    public static int BinarySearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;

    }
}
