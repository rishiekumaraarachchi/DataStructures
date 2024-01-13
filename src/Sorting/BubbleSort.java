package Sorting;

public class BubbleSort {
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,2};
        bubbleSort(arr);

    }

    public static void bubbleSort(int[] arr) {
        boolean swapped;
        for (int i=0;i<arr.length;i++){
            swapped = false;
            for (int j=1;j<arr.length-i;j++){
                if (arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    swapped = true;
                }
            }
            if (!swapped){
                break;
            }
        }
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }
}
