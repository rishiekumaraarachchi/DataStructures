package Practices;

import java.util.Arrays;

public class Remove {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 96, 9, 4, 3, 5, 6};
        int[] arr2 = remove(arr, 3);
        System.out.println(Arrays.toString(arr2));
    }

    public static int[] remove(int[] arr, int index) {
        for (int i = index; i < arr.length - 1 ; i++) {
            arr[i] = arr[i + 1];
        }
        return arr;
    }
}
