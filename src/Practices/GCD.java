package Practices;

public class GCD {
    public static void main(String[] args) {
        int n1 = 46;
        int n2 = 50;

        int GCD = 1;
        int min = Math.min(n1, n2);
        for (int i = 1; i <= min; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                GCD = i;
            }
        }
        System.out.println("GCD of " + n1 + " and " + n2 + " is " + GCD);
    }
}

