package Codes;

public class LCM {
    public static void main(String[] args) {
        int n1= 20;
        int n2 = 70;
        calculateLCM(n1,n2);
    }
    public static void calculateLCM(int n1,int n2){
        int  LCM=Math.max(n1,n2);

        while (LCM % n1 != 0 || LCM % n2 != 0) {
            LCM++;
        }
        System.out.println(LCM);
    }
}
