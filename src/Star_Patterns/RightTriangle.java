package Star_Patterns;

import java.util.Scanner;

public class RightTriangle {
    public static void main(String[] args) {
        System.out.print("Enter # of rows: ");
        Scanner sn = new Scanner(System.in);
        int rowCount = sn.nextInt();
        printTriangle(rowCount);
    }

    public static void printTriangle(int rows) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}
