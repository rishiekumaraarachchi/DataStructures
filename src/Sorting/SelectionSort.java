package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,2};
        selectionSort(arr);

    }

    public static void selectionSort(int[] arr) {
        for (int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void swap(int[] arr, int max, int last) {
        int temp = arr[max];
        arr[max]=arr[last];
        arr[last]=temp;
    }

    public static int getMaxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i=start;i<=end;i++){
            if (arr[max]<arr[i]){
                max=i;
            }
        }
        return max;
    }
}
