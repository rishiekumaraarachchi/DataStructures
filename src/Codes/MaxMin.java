package Codes;

import java.util.Arrays;

public class MaxMin {
//    public static void main(String[] args) {
//        int[] arr = new int[]{
//                4, 5, 6, 7, 9, 3, 4
//        };
//        int min = arr[0];
//        int max = arr[0];
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//            }
//            if (min > arr[i])
//                min = arr[i];
//        }
//        System.out.println("Maximum Element of Array : " + max);
//        System.out.println("Minimum Element of Array : " + min);
//    }

    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 6, 7, 9, 3, 4};
        Arrays.sort(arr);
        System.out.println("Max is "+arr[arr.length-1]);
        System.out.println("Min is "+ arr[0]);
    }
}

