package Array;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = new int[]{5, 1, 6, 9, 3, 4, 2};

        // Print the original array
        System.out.print("Original array: ");
        printArray(arr);

        // Sort the array using optimized bubble sort
        optimizedBubbleSort(arr);

        // Print the sorted array
        System.out.print("Sorted array: ");
        printArray(arr);
    }

    public static void optimizedBubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;

                }
            }
            // If no elements were swapped, break the loop
            if (!swapped) {
                break;
            }
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
