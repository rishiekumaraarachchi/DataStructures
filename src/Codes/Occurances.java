package Codes;


import java.util.Arrays;

public class Occurances {
    public static void main(String[] args) {
        int [] arr = new int []{1,1,1,9,4,3,5,5,7,6,8,3,6};
        checkOccurrences(arr);
    }
    public static void checkOccurrences(int []arr){
        boolean  [] checked = new boolean[arr.length];
        int  [] result = new int[arr.length];
       for (int i = 0; i<= arr.length-1;i++){
           if(!checked[i]){
               int count=1;
           for (int j=i+1; j<= arr.length-1;j++){
               if(arr[i]==arr[j]){
                   count++;
                   checked[j]=true;
               }
           }
          result[i]=count;
       }}
        for (int i = 0; i < arr.length; i++) {
            if (!checked[i]) {
                System.out.println(arr[i] + ": " + result[i]);
            }
        }

    }
}
