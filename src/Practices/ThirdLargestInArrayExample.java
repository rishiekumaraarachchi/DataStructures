package Practices;

import java.util.Arrays;

public class ThirdLargestInArrayExample {
//
//    public static int getThirdLargest(int[] a) {
//        int temp;
//        boolean[] visited = new boolean[a.length]; // Flag array to keep track of visited elements
//        for (int i = 0; i < a.length - 1; i++) {
//            for (int j = i + 1; j < a.length; j++) {
//                if (!visited[j] && a[i] < a[j]) { // Check if element at index j has not been visited
//                    temp = a[i];
//                    a[i] = a[j];
//                    a[j] = temp;
//                }
//            }
//            visited[i] = true; // Mark the element at index i as visited
//        }
//        // The third largest element will be at index 2 (0-indexed)
//        return a[2];
//    }ba
//
//    public static void main(String[] args) {
//        int[] a = {1, 2, 5, 6,6,6, 3, 2,2};
//        int[] b = {44, 66, 99, 77, 33, 22, 22};
//        System.out.println("Third Largest: " + getThirdLargest(a));
//        System.out.println("Third Largest: " + getThirdLargest(b));
//    }
public static void main(String[] args) {
    int [] arr = new int[]{1,5,6,7,6,3,7,9};
    Arrays.sort(arr);
    System.out.println(arr[2]);
}
}
