package Codes;

import java.util.Arrays;

public class AllOdd {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 6, 7, 9, 3, 4};

        int sum = 0;
        for (int j : arr) {
            if (j % 2 != 0) {
                System.out.print(j + " ");
                sum += j;
            }
        }
        System.out.println("\nSum of all odd numbers is " + sum);

        System.out.println();
        Arrays.stream(arr)
                .filter(num -> num % 2 != 0)
                .forEach(System.out::println);
    }

}

