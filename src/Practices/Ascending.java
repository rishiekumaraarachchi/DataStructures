package Practices;

import java.util.Arrays;

public class Ascending {
    //    public static void main(String[] args) {
//        int[] arr = new int[]{1, 5, 96, 9, 4, 3, 5, 6};
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            for (int j = 0; j < arr.length - 1 - i; j++) {
//                if (arr[j] > arr[j + 1]) {
//                    int temp = arr[j+1];
//                    arr[j+1]=arr[j];
//                    arr[j]=temp;
//                }
//            }
//        }
//        for (int i :arr){
//            System.out.print(i+" ");
//        }
//    }
//}
    public static void main(String[] args) {
        int[] arr = new int[]{
                1, 2, 3, 4, 5, 7, 9, 6, 5};

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
