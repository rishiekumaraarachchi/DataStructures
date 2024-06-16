package Codes;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int [] arr = new int [] {1,5,9,3,7,8,5,8,9,0,4,1,9,5};
        findDuplicates(arr);

    }
    public static void findDuplicates(int [] arr){
        Set<Integer> set = new HashSet<>();
        int count = 0;
        for(int j :arr){
           if(!set.add(j)){
               System.out.print(j+" ");
               count++;
           }
        }
        System.out.println( );
        System.out.println("there are "+ count+" duplicates");
    }
}
