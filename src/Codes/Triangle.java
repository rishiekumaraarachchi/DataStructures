package Codes;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        System.out.print("How many rows you need to print : ");
        Scanner sn = new Scanner(System.in);
        int rows = sn.nextInt();
        printTriangle(rows);

    }
    public static void printTriangle(int rows){
        for(int i=0;i<rows;i++){
            for (int j=rows-i;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0; k<=i;k++){
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
