package Practices;

public class SortAscending {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 4, 3, 8, 6, 2};
        sortAscending(arr);
        for (int m : arr) {
            System.out.print(m + " ");
        }

    }

    static void sortAscending(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

