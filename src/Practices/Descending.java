package Practices;

import java.util.Arrays;

public class Descending {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 4, 7, 8};
        arrangeDescending(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void arrangeDescending(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
