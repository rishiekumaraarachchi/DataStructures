package Practice;

import java.util.ArrayList;
import java.util.Arrays;

public class FindDupInTwoArrays {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 4, 6, 7, 8};
        int[] arr1 = new int[]{2, 3, 6, 7, 8};
        System.out.println(Arrays.toString(findDup(arr, arr1)));

    }

    public static int[] findDup(int[] arr, int[] arr1) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j] && !duplicates.contains(arr[i])) {
                    duplicates.add(arr[i]);
                    break;
                }
            }
        }
        int[] duplicatesArr = new int[duplicates.size()];
        for (int i = 0; i < duplicates.size(); i++) {
            duplicatesArr[i] = duplicates.get(i);
        }
        return duplicatesArr;
    }
}
