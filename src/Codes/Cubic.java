package Codes;

import java.util.Arrays;

public class Cubic {
    public static void main(String[] args) {
        int[] arr = new int[]{
                1, 5, 6, 7, 9, 3, 4
        };
        int[] arr2 = new int[arr.length];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = (int) Math.pow(arr[i], 2);
            sum += arr2[i];
        }
        System.out.println(Arrays.toString(arr2));
        System.out.println("Sum of Cubes of all elements is " + sum);
    }
}
