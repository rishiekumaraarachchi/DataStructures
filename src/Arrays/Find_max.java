package Arrays;

public class Find_max {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 9, 3, 4, 6};
        int max = findMax(arr);
        System.out.println(max);
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int x : arr) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }
}
