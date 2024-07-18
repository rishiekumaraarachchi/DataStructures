package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindOdd {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 4, 6, 8, 9};
        int[] oddNumbers = findOdd(arr);
        System.out.println("The odd numbers are: " + Arrays.toString(oddNumbers));
    }

    public static int[] findOdd(int[] arr) {
        List<Integer> oddList = new ArrayList<>();
        for (int x : arr) {
            if (x % 2 == 1) {
                oddList.add(x);
            }
        }

        // Convert the list to an array
        int[] oddArray = new int[oddList.size()];
        for (int i = 0; i < oddList.size(); i++) {
            oddArray[i] = oddList.get(i);
        }
        return oddArray;
    }
}
