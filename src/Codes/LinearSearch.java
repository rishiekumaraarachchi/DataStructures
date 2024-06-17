package Codes;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 7, 6, 9, 5, 3, 4};
        System.out.print("Enter num to Search: ");
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();
        int result = linearSearch(arr,num);
        if(result !=-1){
            System.out.println(num + " Found in array");
        }else {
            System.out.println("num not found");
        }

    }

    public static int linearSearch(int[] arr, int num) {
        for (int j : arr) {
            if (j == num) {
                return j;
            }
        }
        return -1;
    }
}
