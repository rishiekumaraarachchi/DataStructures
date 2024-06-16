package Codes;

public class FrequentCheck {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 7, 9, 3, 6, 4, 7, 6, 4};
        int num = 4;
        int frequency = frequentCount(arr, num);
        System.out.println(frequency);
    }

    public static int frequentCount(int[] arr, int num) {
        int count = 0;
        for (int i : arr) {
            if (i == num) {
                count++;
            }
        }
        return count;
    }
}
