package Codes;

import java.util.Arrays;

public class Arrayreverse {
    public static void main(String[] args) {
        int [] arr= new int[]{1,2,3,4,5,6};
        System.out.println("before reverse ; " + Arrays.toString(arr));
        arrayReverse(arr);

    }
    public static void arrayReverse(int [] arr){
        int start=0;
        int end = arr.length-1;
        while (start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
