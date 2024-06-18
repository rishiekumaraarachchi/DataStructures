package Codes;

import java.util.Arrays;

public class ThirdLargest {
    public static int findThirdLargest(int[] array) {
        if (array.length < 3) {
            throw new IllegalArgumentException("Array must contain at least three elements.");
        }

        // Sort the array in ascending order
        Arrays.sort(array);

        // Initialize variables to keep track of the count of distinct elements
        int distinctCount = 0;
        int thirdLargest = Integer.MIN_VALUE;

        // Iterate from the end of the sorted array to find the third distinct largest element
        for (int i = array.length - 1; i >= 0; i--) {
            // Check if the current element is distinct from the previous one
            if (i == array.length - 1 || array[i] != array[i + 1]) {
                distinctCount++;
                // If we have found the third distinct element, record it
                if (distinctCount == 3) {
                    thirdLargest = array[i];
                    break;
                }
            }
        }
        // If we did not find three distinct elements, throw an exception
        if (distinctCount < 3) {
            throw new IllegalArgumentException("There is no distinct third largest element in the array.");
        }

        return thirdLargest;
    }

    public static void main(String[] args) {
        int[] array = {12, 13, 1, 10, 34, 16};

        try {
            int thirdLargest = findThirdLargest(array);
            System.out.println("The third largest element is: " + thirdLargest);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
//    public static int getThirdLargest(int[] a) {
//        // Ensure the array has at least 3 elements
//        if (a.length < 3) {
//            throw new IllegalArgumentException("Array must have at least three elements");
//        }
//
//        // Initialize the first, second, and third largest variables
//        int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;
//
//        for (int num : a) {
//            if (num > first) {
//                third = second;
//                second = first;
//                first = num;
//            } else if (num > second && num != first) {
//                third = second;
//                second = num;
//            } else if (num > third && num != second && num != first) {
//                third = num;
//            }
//        }
//
//        // If there are not enough distinct values, throw an exception
//        if (third == Integer.MIN_VALUE) {
//            throw new IllegalArgumentException("Array does not have a third distinct largest element");
//        }
//
//        return third;
//    }
//
//    public static void main(String[] args) {
//        int[] a = {1, 2, 5, 6, 6, 6, 3, 2, 2};
//        int[] b = {44, 66, 99, 77, 33, 22, 22};
//        System.out.println("Third Largest: " + getThirdLargest(a));
//        System.out.println("Third Largest: " + getThirdLargest(b));

