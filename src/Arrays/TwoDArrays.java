package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArrays {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        System.out.println("Enter numbers for Array");
        Scanner sn = new Scanner(System.in);

        // Get dimensions of the array
        int rows = arr.length;
        int columns = arr[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter row " + i + " Column " + j + ": ");
                arr[i][j] = sn.nextInt();
            }
        }

        System.out.println(Arrays.deepToString(arr));
        System.out.println("Array is");
        for (int[] x : arr) {
            for (int y : x) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}
