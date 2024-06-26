package Practices;

//public class Duplicates {
//    public static void main(String[] args) {
//        //Initialize array
//        int [] arr = new int [] {1, 2, 3, 4, 2, 7, 8, 8, 3};
//        System.out.println("Duplicate elements in given array: ");
//        //Searches for duplicate element
//        for(int i = 0; i < arr.length; i++) {
//            for(int j = i + 1; j < arr.length; j++) {
//                if(arr[i] == arr[j])
//                    System.out.println(arr[j]);
//            }
//        }
//    }
//
//}

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
    public static void main(String[] args) {
        // Initialize array
        int[] arr = new int[]{1, 2, 3, 4, 2, 7, 8, 8, 3};
        System.out.println("Duplicate elements in given array: ");

        // HashSet to store unique elements encountered
       Set<Integer> set = new HashSet<>();

        for (int j : arr) {
            // If the element is already in the set, it's a duplicate
            if (!set.add(j)) {
                System.out.println(j);
            }
        }
    }
}
