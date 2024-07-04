package Arrays;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = new int []{1,2,4,7,8,4};
        System.out.println("Original Array : "+Arrays.toString(arr));
        bubbleSort(arr);

    }

    public static void bubbleSort(int []arr){
        for (int i=0; i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted array: "+ Arrays.toString(arr));
    }
}
