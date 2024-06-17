package Codes;

public class GCD {
    public static void main(String[] args) {
        int n1= 20;
        int n2 = 60;
        calculateGCD(n1,n2);
    }
    public static void calculateGCD(int n1,int n2){
        int smallest = Math.min(n1, n2);
        int GCD=1;
        for(int i=1;i<=smallest;i++){
            if(n1%i==0&&n2%i==0){
                GCD=i;
            }
        }
        System.out.println("gcd of "+n1 +" & "+n2+" is "+GCD);
    }
}
