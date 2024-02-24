package Practices;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.print("Enter the number to check factorial : ");
        Scanner sn = new Scanner(System.in);
        int check = sn.nextInt();
        int fact =1;
        for (int i = 1 ; i<=check;i++){
          fact *=i;
        }
        System.out.println("Factorial of number "+ check+" is : "+fact);
    }
}
