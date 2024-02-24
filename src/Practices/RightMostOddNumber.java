package Practices;

public class RightMostOddNumber {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 3, 6, 4, 9, 5, 8, 7, 6};
        int a = findRightOdd(arr);
        System.out.println("Right most odd one is : " + a);
    }

    public static int findRightOdd(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                return arr[i];
            }
        }
        return -1;
    }
}
