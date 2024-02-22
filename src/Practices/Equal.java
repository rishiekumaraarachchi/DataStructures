package Practices;

import java.util.Arrays;
import java.util.Scanner;

public class Equal {
    public static void main(String[] args) {
        int arr1[] = new int[5];
        int arr2[] = new int[5];
        System.out.println("Enter values for the 1 array: ");
        Scanner sn = new Scanner(System.in);
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = sn.nextInt();
        }
        System.out.println("Enter values for the 2 array: ");
        for (int i =0;i<arr2.length;i++){
            arr2[i]= sn.nextInt();
        }
        boolean result = Arrays.equals(arr1, arr2);
        if (result) {
            System.out.println("Both arrays are equal");
        } else {
            System.out.println("Both arrays are not equal");
        }
    }
}
