package Codes;


import java.util.Collections;
import java.util.Arrays;

public class SOrtingAsc {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{
                1, 6, 9, 7, 3, 8, 6, 4, 5
        };

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int num : arr) {
            System.out.print(" " + num);
        }

        System.out.println();

        Arrays.sort(arr, Collections.reverseOrder());
        System.out.println("Sorted Array : "+Arrays.toString(arr));

    }
}
