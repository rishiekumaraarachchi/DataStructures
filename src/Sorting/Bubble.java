package Sorting;

import java.util.Arrays;

public class Bubble {
    public static void main(String[] args) {
        int [] arr = new int[]{1,2,6,8,4,7,9,6,3};
        System.out.println("Before Sorting");
        System.out.println(Arrays.toString(arr)); // Print the array before sorting
        System.out.println("After Sorting");
        sorting(arr);
        System.out.println(Arrays.toString(arr)); // Print the array after sorting
    }

    public static void sorting(int [] arr){
        for (int i = 0; i < arr.length - 1; i++){
            for (int j = 0; j < arr.length - 1 - i; j++){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}
