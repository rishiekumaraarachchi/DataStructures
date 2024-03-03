package Codes;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 5, 6, 7, 9, 3, 4,9,6,5,4};

        Set<Integer>  set = new HashSet<>();
        for(int i =0;i<arr.length;i++){
            if(!set.add(arr[i])){
                System.out.println("Duplicate found "+arr[i]);
            }
        }
        for (int a: set){
            System.out.print(a);
        }
    }
}
