package Sorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {64, 25, 12, 22, 11};

        System.out.println("Array before sorting: ");
        printArray(arr);

        selectionSort(arr);

        System.out.println("Array after sorting: ");
        printArray(arr);
    }

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Iterate through the array from index 0 to N-1
        for (int i = 0; i < n - 1; i++) {
            int smallSub = i;

            // Find the index of the smallest element in the unsorted portion of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[smallSub]) {
                    smallSub = j;
                }
            }

            // Swap the smallest element with the element at index i
            int temp = arr[smallSub];
            arr[smallSub] = arr[i];
            arr[i] = temp;
        }
    }

    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
