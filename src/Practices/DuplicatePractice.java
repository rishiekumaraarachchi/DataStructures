package Practices;

public class DuplicatePractice {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 4, 5, 2};
        int[] arr2 = new int[]{1, 3, 4, 9, 5, 3, 7};

        int count = 0;

        // Find the maximum length among the two arrays
        int minLength = Math.min(arr1.length, arr2.length);

        // Create a boolean array to keep track of visited elements in arr2
        boolean[] visited = new boolean[arr2.length];

        // Iterate over arr1
        for (int i = 0; i < arr1.length; i++) {
            // Iterate over arr2 to find duplicates
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !visited[j]) {
                    // If duplicate found and not visited before
                    System.out.print(arr1[i] + " ");
                    count++;
                    visited[j] = true; // Mark as visited to avoid duplicate counting
                    break; // Move to the next element in arr1
                }
            }
        }

        System.out.println();
        System.out.println("The duplicate count is: " + count);
    }
}

//import java.util.HashSet;
//
//public class DuplicatePractice {
//    public static void main(String[] args) {
//        int[] arr1 = new int[]{1, 2, 4, 5, 2};
//        int[] arr2 = new int[]{1, 3, 4, 9, 5, 3, 7};
//
//        HashSet<Integer> set = new HashSet<>();
//        HashSet<Integer> duplicates = new HashSet<>();
//
//        for (int num : arr1) {
//            set.add(num);
//        }
//
//        int count = 0;
//        for (int num : arr2) {
//            if (set.contains(num) && !duplicates.contains(num)) {
//                System.out.print(num + " ");
//                count++;
//                duplicates.add(num);
//            }
//        }
//
//        System.out.println();
//        System.out.println("The duplicate count is: " + count);
//    }
//}
