package Sorting;

public class Insertion {
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,2};
        insertionSort(arr);

    }

    public static void insertionSort(int[] arr) {
        for (int i=0;i<arr.length;i++){
            for (int j=i-1;j>=0;j--){
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j+1);
                }
                else{
                    break;
                }
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }

    public static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j]=arr[i];
        arr[i]=temp;
    }
}
