package Practices;

public class LeftMostEven {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 9, 3, 8, 1};
        int result = findRightMostEven(arr);
        System.out.println("the right most even is at index : " + result + " and the value is : " + arr[result]);

    }

    public static int findRightMostEven(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] % 2 == 0) {
                return i;
            }
        }
        return -1;
    }
}
