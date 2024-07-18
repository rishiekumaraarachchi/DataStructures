package Array;

import java.util.Arrays;

public class ArrReverse {
    public static void main(String[] args) {
        int []arr = new int[]{1,2,3,4,5,6};
        int [] reverse = reverseArray(arr);
        for (int i =0; i< reverse.length-1;i++){
            System.out.print(reverse[i]+",");
        }

    }
    public static int[] reverseArray(int []arr){
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
