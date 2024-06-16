package Codes;

import java.util.Scanner;

public class Fibbonacchi {
    public static void main(String[] args) {
        System.out.print("Add the number: ");
        Scanner sn = new Scanner(System.in);
        int num = sn.nextInt();
        calculateFibbonacchi(num);
    }
    public static void calculateFibbonacchi(int num){
        int n1=0,n2=1;
        System.out.print(n1 + " " + n2+ " ");
        for(int i=0;i<num-2;i++){
            int n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(n3 + " ");
        }
    }
}
