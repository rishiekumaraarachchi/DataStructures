package Practices;

import java.util.Scanner;

public class Contains {
    public static void main(String[] args) {

        int [] arr = new int []{
                1,5,6,7,5,9,4,1,5
        };
        System.out.print("Enter the number to search: ");
        Scanner sn = new Scanner(System.in);
        int number = sn.nextInt();

        boolean found = false;

        for(int n: arr){
            if (number==n){
                found= true;
                break;
            }
        }
        if(found){
            System.out.println("number " + number +" found");
        }else
            System.out.println("number " + number +" is not found");
    }
}
