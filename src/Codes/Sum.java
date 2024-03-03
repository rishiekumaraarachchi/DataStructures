package Codes;

import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int [] arr=new int[5];
        Scanner sn = new Scanner(System.in);
        for (int i=0; i<arr.length;i++){
            arr[i]=sn.nextInt();
        }

        int sum=0;
        for (int j : arr) {
            sum += j;
        }
       double avg =(double) sum/arr.length;
        System.out.println("Sum is "+sum);
        System.out.println("Average is "+avg);
    }
}
