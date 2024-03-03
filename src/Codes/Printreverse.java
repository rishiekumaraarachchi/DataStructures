package Codes;

public class Printreverse {
    public static void main(String[] args) {
        int []arr= new int[]{
                1,5,6,7,9,3,4
        };
        for(int i=arr.length-1; i>=0;i--){
            System.out.print(" "+ arr[i]);
        }
    }
}
