package Sorting;

public class QuickSort {
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,2};
        quickSort(arr,0,arr.length-1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void quickSort(int[] arr, int start, int end) {
        if (start>=end){
            return;
        }
        int pivot = partition(arr,start,end);
        quickSort(arr,start,pivot-1);
        quickSort(arr,pivot+1,end);
    }

    private static int partition(int[] arr, int start, int end) {
        int pivot = arr[end];
        int i = start-1;
        for (int j=start;j<=end-1;j++){
            if (arr[j]<pivot){
                i++;
                swap(arr,i,j);
            }
        }
        swap(arr,i+1,end);
        return i+1;
    }

    public static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
