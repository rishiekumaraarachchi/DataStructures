package Codes;

public class Unique {
    public static void main(String[] args) {
        int num1 = 100;
        int num2 = 72;

        int gcd = 1;
        int min = Math.min(num1,num2);
        for(int i = 1; i<=min;i++){
            if(num1%i==0 && num2%i==0){
                gcd = i;
            }
        }
        System.out.println("gcd is: "+gcd);

    }
}
