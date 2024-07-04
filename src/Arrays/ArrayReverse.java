package Arrays;

import java.util.Arrays;

public class ArrayReverse {
    public static void main(String[] args) {
        int []arr = new int []{1,2,3,4,5,6};
        System.out.println("Reversed array: " + Arrays.toString(arrayReverse(arr)));
    }
    public static int[] arrayReverse(int[] arr){
        int left=0;
        int right = arr.length-1;
        while (left<right){
            int temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return arr;
    }

}
