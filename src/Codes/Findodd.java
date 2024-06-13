package Codes;

import java.util.ArrayList;

public class Findodd {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 5, 6, 7};
        int[] result = findOdd(arr);
        for (int j : result) {
            System.out.print(j + ",");
        }
    }

    static int[] findOdd(int[] arr) {
        ArrayList<Integer> oddList = new ArrayList<>();
        for (int num : arr) {
            if (num % 2 != 0) {
                oddList.add(num);
            }
        }
        int[] oddArray = new int[oddList.size()];
        for (int i = 0; i < oddList.size(); i++) {
            oddArray[i] = oddList.get(i);
        }
        return oddArray;
    }
}
