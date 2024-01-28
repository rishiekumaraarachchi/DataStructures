package Practices;

//public class Fibonacci {
//    public static void main(String[] args) {
//        int n1=0,n2=1,n3,count=10;
//        System.out.print(n1+" "+n2);//printing 0 and 1
//
//        for (int i =2; i<count;i++){
//            n3=n1+n2;
//            System.out.print(" "+n3);
//            n1=n2;
//            n2=n3;
//
//        }
//    }
//}

public class Fibonacci {
    // Recursive method to compute the nth Fibonacci number
    public static int fibonacci(int n) {
        // Base cases: F(0) = 0, F(1) = 1
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
            // Recursive step: F(n) = F(n-1) + F(n-2)
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        // Print the first 10 Fibonacci numbers
        int n = 10;
        System.out.println("First " + n + " Fibonacci numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
