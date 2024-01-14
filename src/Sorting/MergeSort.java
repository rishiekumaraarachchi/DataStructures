package Sorting;

public class MergeSort {
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,2};
        mergeSort(arr,0,arr.length-1);
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void mergeSort(int[] arr, int start, int end) {
        if (start>=end){
            return;
        }
        int mid = (start+end)/2;
        mergeSort(arr,start,mid);
        mergeSort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }

    private static void merge(int[] arr, int start, int mid, int end) {
        int i = start;
        int j = mid+1;
        int k = 0;
        int [] temp = new int[end-start+1];
        while (i<=mid && j<=end){
            if (arr[i]<arr[j]){
                temp[k]=arr[i];
                i++;
                k++;
            }
            else{
                temp[k]=arr[j];
                j++;
                k++;
            }
        }
        while (i<=mid){
            temp[k]=arr[i];
            i++;
            k++;
        }
        while (j<=end){
            temp[k]=arr[j];
            j++;
            k++;
        }
        for (int l=0;l<temp.length;l++){
            arr[start+l]=temp[l];
        }
    }
}
