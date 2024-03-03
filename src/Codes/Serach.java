package Codes;

import java.util.Scanner;

public class Serach {
    public static void main(String[] args) {
        System.out.print("Enter num to search: ");
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();

        int [] arr = new int[]{1,3,6,8,7,4,5,5,7,2,4,5,1,4};
        for(int j :arr){
            if(j==num){
                System.out.println("Number Found");
                break;
            }
        }
    }
}
