package Practices;

import java.util.Arrays;

public class Sorting {
    public static void main(String[] args) {
        int[] arr = new int[]{
                1, 8, 9, 6, 7, 3, 5, 4, 9, 6
        };
        int[] arr2 = new int[]{
                1, 8, 9, 6, 7, 3, 5, 4, 9, 6
        };

        int result = Arrays.compare(arr, arr2);
        System.out.println(result);
    }
}
