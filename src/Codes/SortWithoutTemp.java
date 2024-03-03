package Codes;

public class SortWithoutTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Before sorting num1 is : " + a + " and num 2 is : " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After sorting num1 is : " + a + " and num 2 is : " + b);

    }
}
