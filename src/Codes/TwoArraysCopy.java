package Codes;

public class TwoArraysCopy {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{6, 7, 8, 9, 10};
        int n = arr.length + arr2.length;
        int[] arr3 = new int[n];
        System.arraycopy(arr, 0, arr3, 0, arr.length);
        System.arraycopy(arr2, 0, arr3, arr.length, arr2.length);
        System.out.println("Array 1 is ");
        for (int j : arr3) {
            System.out.print(j + " ");

        }
    }
}