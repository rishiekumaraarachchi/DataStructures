package Codes;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[arr.length];
        System.arraycopy(arr, 0, arr2, 0, arr.length);
        for (int j : arr2) {
            System.out.print(j + " ");
        }
    }
}
