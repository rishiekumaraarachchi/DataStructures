package Practices;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int n1 = sn.nextInt();
        System.out.print("Enter num 2: ");
        int n2 = sn.nextInt();

        int GCD = 1;
        int min = Math.min(n1, n2);
        for (int i = 2; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                GCD = i;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + GCD);
    }
}

