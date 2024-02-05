package Practices;

import java.util.Scanner;

public class LCM {
    public static void main(String[] args) {
        int n1,n2,lcm;
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        n1=sn.nextInt();
        System.out.print("Enter num 2: ");
        n2= sn.nextInt();
        lcm= Math.max(n1, n2);

        while (true){
            if(lcm%n1==0 && lcm % n2==0){
                System.out.println("lcm of " + n1+ " and " +n2 + " is " +lcm);
                break;
            }
            ++lcm;
        }
    }
}
