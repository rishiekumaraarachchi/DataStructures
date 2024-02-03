package Practices;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 6, 8, 3, 9};
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter num to search: ");
        int check = sn.nextInt();
        int result= searchInArr(arr,check);
        if (result!=-1){
            System.out.println("Found "+ check +" in arr" );
        }else {
            System.out.println("Not Found");
        }
    }

    public static int searchInArr(int[] arr, int check) {
        for (int j : arr) {
            if (j == check) {
                return j;
            }
        }
        return -1;
    }
}
